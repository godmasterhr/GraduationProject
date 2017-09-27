package cn.e_mall.manage.mapper;

import java.util.List;

import cn.e_mall.manage.pojo.Notice;

public interface NoticeMapper {
	/**
	 * 查询公告集合
	 * @return
	 */
	public List<Notice> findNoticeList();
	/**
	 * 根据id查询notice
	 * @return
	 */
	public Notice findNoticeById(String noticeId);
	
	
	public void saveNotice(Notice notice);
	
	public void updateNotice(Notice notice);
	
	public void delNoticeById(String noticeId);
}
