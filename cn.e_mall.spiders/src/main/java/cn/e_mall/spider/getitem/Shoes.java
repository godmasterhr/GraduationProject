package cn.e_mall.spider.getitem;

import java.util.List;

public class Shoes {

	public static void main(String[] args) throws Exception {
		SupItem si = new SupItem();
		String shoesUrl="https://list.jd.com/list.html?cat=1318,12099,9756";
		List<String> shoesList = si.getItem(shoesUrl);
		String dir = "shoes";
		for(String Url :shoesList){
			si.getItemInfo("http:"+Url,dir,"8");
		}

	}

}
