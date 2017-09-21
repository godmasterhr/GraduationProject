package cn.e_mall.spider.getitem;

import java.util.List;

public class Food {
	public static void main(String[] args) throws Exception {
		SupItem si = new SupItem();
		String foodUrl="https://list.jd.com/list.html?cat=12218,13553,13574";
		List<String> foodList = si.getItem(foodUrl);
		String dir = "food";
		for(String Url :foodList){
			si.getItemInfo("http:"+Url,dir,"5");
		}
	}
}
