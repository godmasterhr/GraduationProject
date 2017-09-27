package com.e_mall.www.service;

import java.util.List;

import com.e_mall.www.pojo.Notice;

public interface NoticeService {
	/**
	 * 查询所有的公告
	 * @return
	 */
	public List<Notice> findNoticeList();
	/**
	 * 根据公告id查询公告
	 * @return
	 */
	public Notice findNoticeById(String noticeId);
}
