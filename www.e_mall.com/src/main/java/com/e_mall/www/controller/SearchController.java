package com.e_mall.www.controller;


import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e_mall.www.pojo.Item;
import com.e_mall.www.service.SearchService;



@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    /**
     * 通过关键字搜索
     * 
     * @param keyWords
     * @return
     * @throws Exception 
     */
    @RequestMapping(value = "/toSearch")
    public String search(String key, Integer page, Integer rows,Model model) throws Exception {
    	 key = new String(key.getBytes("iso8859-1"),"utf-8");
         List<Item> itemList = searchService.search(key, page, rows);
         model.addAttribute("item", itemList);
         model.addAttribute("key", key);
         return "search";
    }
    

}
