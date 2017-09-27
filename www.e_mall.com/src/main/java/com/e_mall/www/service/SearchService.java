package com.e_mall.www.service;

import java.util.List;

import com.e_mall.www.pojo.Item;

public interface SearchService {
	
	 public List<Item> search(String keyWords, Integer page, Integer rows);
}
