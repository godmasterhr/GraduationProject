package com.e_mall.www.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_mall.www.pojo.Item;
import com.e_mall.www.util.BeanUtils;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.e_mall.common.service.HttpClientService;
import cn.e_mall.common.service.RedisService;

@Service
public class ItemInfoServiceImpl implements ItemInfoService{
	
	@Autowired
	private HttpClientService httpClientService;
	
	@Autowired
	private RedisService redisService;
	
	private static final ObjectMapper MAPPER = new ObjectMapper();
	/**
	 * 根据商品id查询商品详细信息
	 * @return
	 *  
	 */
	@Override
	public Item findItemById(String id) {
		Item item = null;
		//注意：先在虚拟机中 config set protected-mode no
		String itemInfoJson = redisService.get(id);
		if(itemInfoJson==null||"".equals(itemInfoJson)){
			String url="http://manage.e_mall.com:8081/toItemInfo?&id="+id;
			try {
				String jsonData = httpClientService.doGet(url);
				redisService.set(id, jsonData);
			    item = BeanUtils.getInstance().getItem(jsonData);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else{
			try {
				item =  MAPPER.readValue(itemInfoJson, Item.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return item;
		
	}
	@Override
	public void updateNum(String id,int i) {
		String url="http://manage.e_mall.com:8081/toUpdateNum?&id="+id+"&num="+i;
		try {
			httpClientService.doGet(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
