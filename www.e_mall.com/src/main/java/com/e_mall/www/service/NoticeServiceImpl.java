package com.e_mall.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_mall.www.pojo.Notice;
import com.e_mall.www.util.BeanUtils;

import cn.e_mall.common.service.HttpClientService;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	private HttpClientService httpClientService;
	
	
	/**
	 * 将数据库中的公告查询出来
	 */
	public List<Notice> findNoticeList() {
		List<Notice> noticeList= null;
		try {
			String url="http://manage.e_mall.com:8081/tonotice";
			String jsonData = httpClientService.doGet(url);
		    noticeList = BeanUtils.getInstance().getNoticeList(jsonData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return noticeList;
	}


	/**
	 * 根据公告id将公告返回
	 */
	public Notice findNoticeById(String noticeId) {
		Notice notice =null;
		try {
			String url="http://manage.e_mall.com:8081/noticeInfo?noticeId="+noticeId;
			String jsonData = httpClientService.doGet(url);
		    notice = BeanUtils.getInstance().getNotice(jsonData);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return notice;
	}

}
