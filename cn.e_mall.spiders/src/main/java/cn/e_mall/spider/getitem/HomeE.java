package cn.e_mall.spider.getitem;

import java.util.List;

public class HomeE {
	public static void main(String[] args) throws Exception {
		SupItem si = new SupItem();
		String HOMEsUrl="https://list.jd.com/list.html?cat=737,794,798";
		List<String> HOMEsList = si.getItem(HOMEsUrl);
		String dir = "homee";
		for(String Url :HOMEsList){
			si.getItemInfo("http:"+Url,dir,"4");
		}
	}
}
