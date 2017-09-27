package com.e_mall.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e_mall.www.pojo.Notice;
import com.e_mall.www.service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("/tonotice")
	public String toNotice(Model model){
		List<Notice> noticeList = noticeService.findNoticeList();
		model.addAttribute("noticeList",noticeList);
		return "notice";
	}
	@RequestMapping("/noticeInfo")
	public String noticeInfo(String noticeId,Model model){
		Notice notice = noticeService.findNoticeById(noticeId);
		model.addAttribute("notice",notice);
		return "noticeInfo";
	}
}
