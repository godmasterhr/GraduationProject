package cn.e_mall.spider.getitem;

import java.io.IOException;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import cn.e_mall.spider.pojo.Item;
import cn.e_mall.spider.service.ItemService;
import cn.e_mall.spider.service.ItemServiceImpl;
public class SupItem {
	
	
	private ItemService itemService;
	
	final static ObjectMapper MAPPER = new ObjectMapper();
	
	
	//获取每件商品的商品url
	public   List getItem(String url) throws Exception{
		List<String> itemURLList = new ArrayList<String>();
		for(int i =1;i<=2;i++){
			url=url+"&page="+i;
			Document document = Jsoup.connect(url).get();
			Elements eles = document.select(".gl-warp").select(".clearfix .p-img a");
			for(Element ele :eles){
				String Itemhref = ele.attr("href");
				System.out.println(Itemhref);
				itemURLList.add(Itemhref);
			}
		}
		return itemURLList;
	}
	
	
	//获取商品的详细信息
	public  void getItemInfo(String itemUrl,String dir,String itemType) throws Exception{
		//获取商品id
		String id = itemUrl.substring(itemUrl.lastIndexOf("/")+1, itemUrl.lastIndexOf("."));
		System.out.println("商品id:"+id);
		Document document = Jsoup.connect(itemUrl).get();
		
		//获取商品标题
		Elements eleHead = document.select(".itemInfo-wrap").select(".sku-name");
		if(eleHead.isEmpty()){
			eleHead=document.select(".m-item-inner").select("#itemInfo").select("#name").select("h1");
		}
		String title = eleHead.get(0).text();
		System.out.println("商品标题:"+title);
		
		
		//获取商品卖点https://cd.jd.com/promotion/v2?callback=jQuery7589665&skuId=ID&area=1_72_2799_0&shopId=1000000904&venderId=1000000904&cat=9987%2C653%2C655&_=1485316326319
		String sellUrl = "https://cd.jd.com/promotion/v2?callback=jQuery7589665&skuId="+id+"&area=1_72_2799_0&shopId=1000000904&venderId=1000000904&cat=9987%2C653%2C655&_=1485316326319";
		String sellJson =  Jsoup.parse(new URL(sellUrl).openStream(), "GBK", sellUrl).text();
		sellJson = sellJson.substring(14, sellJson.lastIndexOf(")"));
		JsonNode jsonNode = MAPPER.readTree(sellJson);
		String sellPoint = jsonNode.get("ads").get(0).get("ad").asText();
		System.out.println("商品卖点:"+sellPoint);
		
		
		//商品价格http://p.3.cn/prices/mgets?skuIds=J_ID
		String priceUrl = "https://p.3.cn/prices/mgets?callback=jQuery6573343&type=1&area=1_72_4137_0&pdtk=&pduid=1576835098&pdpin=&pdbp=0&skuIds=J_"+id;
		String priceJson = Jsoup.parse(new URL(priceUrl).openStream(), "GBK",priceUrl).text();
		priceJson = priceJson.substring(14, priceJson.lastIndexOf(")"));
		jsonNode = MAPPER.readTree(priceJson);
		Double price = jsonNode.get(0).get("p").asDouble();
		System.out.println("商品价格:"+price);
		
		
		//获取商品图片（下载到本地）
		Elements eles  = document.select(".preview").select("#spec-n1").select("img");
		String imgUrl ="";
		if(eles.isEmpty()){
			eles=document.select("#preview").select("#spec-n1").select("img");
			Element ele = eles.get(0);
			 imgUrl = ele.attr("src");
		}else{
			Element ele = eles.get(0);
			 imgUrl = ele.attr("data-origin");
		}
		String imgName = id+".jpg";
		ImgUtil.getImg(imgUrl, imgName, dir);
		imgUrl = "d:/JDimgs/"+dir+"/"+imgName;
		System.out.println("图片路径:"+imgUrl);
		
		
		
		
		//获取完商品的信息  开始数据落地
		Item item = new Item();
		item.setId(id);
		item.setTitle(title);
		item.setSellPoint(sellPoint);
		item.setPrice(price);
		item.setItemUrl(imgUrl);
		item.setItemType(itemType);
		item.setNum(9999);
		
		itemService = new ItemServiceImpl();
		itemService.addItem(item);
	}
	
	
}
