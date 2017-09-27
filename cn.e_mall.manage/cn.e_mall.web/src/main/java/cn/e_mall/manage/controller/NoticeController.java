package cn.e_mall.manage.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e_mall.manage.pojo.Notice;
import cn.e_mall.manage.service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticesService;
	
	/**
	 * 跳转公告管理界面
	 * @return
	 */
	@RequestMapping("toNoticeManage")
	public  String toNoticeManage(){
		return "noticeManage";
	}
	
	
	@RequestMapping("/toSeeNotice")
	public String toSeeNotice(Model model){
		 List<Notice> noticeList = noticesService.findNoticeList();
		 model.addAttribute("noticeList", noticeList);
		 return "noticeList";
	}
	
	@RequestMapping("/tonotice")
	@ResponseBody
	public List<Notice> toNotice(){
		return noticesService.findNoticeList();
	}
	
	@RequestMapping("/noticeInfo")
	@ResponseBody
	public Notice noticeInfo(String noticeId,Model model){
		return noticesService.findNoticeById(noticeId);
	}
	
	@RequestMapping("/seeNoticeInfo")
	public String seeNoticeInfo(String noticeId,Model model){
		 Notice notice  = noticesService.findNoticeById(noticeId);
		 model.addAttribute("notice", notice);
		 return "noticeInfo";
	}
	
	@RequestMapping("/toaddNotice")
	public String toaddNotice(){
		 return "noticeAdd";
	}
	
	
	@RequestMapping("/updateNotice")
	public String updateNotice(Notice notice){
		notice.setNoticeContent(notice.getNoticeContent().trim());
		noticesService.updateNotice(notice);
		 return "redirect:/toSeeNotice";
	}
	
	@RequestMapping("/saveNotice")
	public String saveNotice(Notice notice){
		notice.setNoticeId(UUID.randomUUID().toString());
		notice.setNoticeContent(notice.getNoticeContent().trim());
		noticesService.saveNotice(notice);
		 return "redirect:/toSeeNotice";
	}
	
	@RequestMapping("/toUpdateNotice")
	public String toUpdateNotice(String noticeId,Model model){
		Notice notice = noticesService.findNoticeById(noticeId);
		model.addAttribute("notice", notice);
		return "noticeUpdate";
	}
	
	
	
	@RequestMapping("/toDeleteNotice")
	public String toDeleteNotice(String noticeId){
		noticesService.delNoticeById(noticeId);
		return "redirect:/toSeeNotice";
	}
}
