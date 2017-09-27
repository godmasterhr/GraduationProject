package cn.e_mall.spider.getitem;

import java.util.List;

public class Computer {
	public static void main(String[] args) throws Exception {
		SupItem si = new SupItem();
		String CPUUrl="https://list.jd.com/list.html?cat=670,671,672";
		List<String> CPUList = si.getItem(CPUUrl);
		String dir = "computer";
		for(String Url :CPUList){
			si.getItemInfo("http:"+Url,dir,"2");
		}
	}
	
}
