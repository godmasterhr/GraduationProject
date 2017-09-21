package cn.e_mall.spider.getitem;

import java.util.List;

public class Clothes {
	public static void main(String[] args) throws Exception {
		SupItem si = new SupItem();
		String ClothesUrl="https://coll.jd.com/list.html?sub=11850";
		List<String> ClothesList = si.getItem(ClothesUrl);
		String dir = "clothes";
		for(String Url :ClothesList){
			si.getItemInfo("http:"+Url,dir,"3");
		}
	}
}
