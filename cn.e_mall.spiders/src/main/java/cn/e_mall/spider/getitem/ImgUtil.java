package cn.e_mall.spider.getitem;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImgUtil{
	
	public static void getImg(String imgUrl, String imgName,String dir) throws Exception {
		URL url = new URL("http:"+imgUrl);
	    HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
	    httpConn.connect();
	    InputStream cin = httpConn.getInputStream();
	    File file= new File("d:/JDimgs/"+dir+"/");
	    if(!file.exists()){
	    	file.mkdirs();
	    }
	    
	    OutputStream outStream = new FileOutputStream("d:/JDimgs/"+dir+"/"+imgName);
	    byte[] buffer = new byte[1024];
	    int len = 0;
	    while ((len = cin.read(buffer)) != -1) {
	    	outStream.write(buffer, 0, len);
	    }
	    cin.close();
	    outStream.close();
    }
	

	
}
