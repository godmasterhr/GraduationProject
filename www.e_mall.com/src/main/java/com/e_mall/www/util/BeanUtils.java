package com.e_mall.www.util;

import java.io.IOException;
import java.util.List;

import com.e_mall.www.pojo.Item;
import com.e_mall.www.pojo.ItemPage;
import com.e_mall.www.pojo.Notice;
import com.e_mall.www.pojo.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BeanUtils {
	private static final ObjectMapper MAPPER = new ObjectMapper();
	private static BeanUtils beanUtils = new BeanUtils();
	private BeanUtils(){};
	public static BeanUtils getInstance(){
		return beanUtils;
	}
	
	public Item getItem(String jsonData) throws Exception{
		Item item = MAPPER.readValue(jsonData, Item.class);
		return item;
	}
	public Notice getNotice(String jsonData) throws Exception{
		Notice notice = MAPPER.readValue(jsonData, Notice.class);
		return notice;
	}
	
	public List<Notice> getNoticeList(String jsonData) throws Exception{
		List<Notice> noticeList= MAPPER.readValue(jsonData,new TypeReference<List<Notice>>(){});
		return noticeList;
	}
	
	public ItemPage<Item> getItemPage(String jsonData) throws Exception, IOException{
		ItemPage<Item> itemPage = new ItemPage<Item>();
		JsonNode pageNode = MAPPER.readTree(jsonData);
		String itemString = pageNode.get("list").toString();
		String pageNum = pageNode.get("pageNum").toString();
		String prePage = pageNode.get("prePage").toString();
		String nextPage = pageNode.get("nextPage").toString();
		String total = pageNode.get("total").toString();
		String pages = pageNode.get("pages").toString();
		List<Item> itemList= MAPPER.readValue(itemString,new TypeReference<List<Item>>(){});
		itemPage.setPageNum(Integer.parseInt(pageNum));
		itemPage.setPages(Integer.parseInt(pages));
		itemPage.setTotal(Integer.parseInt(total));
		itemPage.setPrePage(Integer.parseInt(prePage));
		itemPage.setNextPage(Integer.parseInt(nextPage));
		itemPage.setList(itemList);
		return itemPage;
	}
}
