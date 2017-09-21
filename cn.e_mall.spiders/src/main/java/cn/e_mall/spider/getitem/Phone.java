package cn.e_mall.spider.getitem;

import java.util.List;



public class Phone {
	public static void main(String[] args) throws Exception {
		SupItem si = new SupItem();
		String phoneUrl="https://list.jd.com/list.html?cat=9987,653,655";
		List<String> phoneList = si.getItem(phoneUrl);
		String dir = "phone";
		for(String Url :phoneList){
			si.getItemInfo("http:"+Url,dir,"1");
		}
	}
	

}
