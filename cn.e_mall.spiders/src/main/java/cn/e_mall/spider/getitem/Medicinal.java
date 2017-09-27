package cn.e_mall.spider.getitem;

import java.util.List;

public class Medicinal {
	public static void main(String[] args) throws Exception {
		SupItem si = new SupItem();
		String MedUrl="https://list.jd.com/list.html?cat=9192,12632,12635";
		List<String> MedList =  si.getItem(MedUrl);
		String dir = "drug";
		for(String Url :MedList){
			si.getItemInfo("http:"+Url,dir,"7");
		}
	}
}
