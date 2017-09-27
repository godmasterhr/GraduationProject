package com.e_mall.www.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_mall.www.pojo.Item;

import cn.e_mall.common.service.HttpClientService;


@Service
public class SearchServiceImpl implements SearchService{

    @Autowired
    private HttpSolrServer httpSolrServer;
    
    public List<Item> search(String keyWords, Integer page, Integer rows) {
        // 构造搜索对象
        SolrQuery solrQuery = new SolrQuery();
        solrQuery.setQuery(keyWords);
        
        // 分页数据(
        solrQuery.setStart((Math.max(1, page) - 1) * rows);
        solrQuery.setRows(rows);
        
        try {
            QueryResponse queryResponse = this.httpSolrServer.query(solrQuery);
            List<Item> itemList = queryResponse.getBeans(Item.class);
            if (itemList == null || itemList.isEmpty()) {
                return  null;
            }
           
            return itemList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
