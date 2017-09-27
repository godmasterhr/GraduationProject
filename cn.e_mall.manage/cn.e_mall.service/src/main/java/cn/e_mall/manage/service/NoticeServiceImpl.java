package cn.e_mall.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.e_mall.common.service.HttpClientService;
import cn.e_mall.manage.mapper.NoticeMapper;
import cn.e_mall.manage.pojo.Notice;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	/**
	 * 将数据库中的公告查询出来
	 */
	public List<Notice> findNoticeList() {
		return noticeMapper.findNoticeList();
	}

	@Override
	public Notice findNoticeById(String noticeId) {
		return noticeMapper.findNoticeById(noticeId);
	}

	@Override
	public void saveNotice(Notice notice) {
		 noticeMapper.saveNotice(notice);
	}

	@Override
	public void updateNotice(Notice notice) {
		 noticeMapper.updateNotice(notice);
		
	}

	@Override
	public void delNoticeById(String noticeId) {
		noticeMapper.delNoticeById(noticeId);
	}

}
