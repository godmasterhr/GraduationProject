package cn.e_mall.spider.getitem;

import java.util.List;

public class Book {
	public static void main(String[] args) throws Exception {
		SupItem si = new SupItem();
		String bookUrl="https://search.jd.com/Search?keyword=Python&enc=utf-8&qrst=1&rt=1&stop=1&book=y&vt=2&stock=1&click=1";
		List<String> bookList = si.getItem(bookUrl);
		String dir = "book";
		for(String Url :bookList){
			si.getItemInfo("http:"+Url,dir,"6");
		}
	}
}
