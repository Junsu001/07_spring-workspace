package com.br.sbatis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.sbatis.dao.NoticeDao;
import com.br.sbatis.dto.NoticeDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class NoticeServiceImpl implements NoticeService {

	private final NoticeDao noticeDao;
	
	@Override
	public List<NoticeDto> selectNoticeList() {
		return noticeDao.selectNoticeList();
	}

	@Override
	public NoticeDto selectNoticeByNo(int noticeNo) {
		return noticeDao.selectNoticeByNo(noticeNo);
	}

	@Override
	public int insertNotice(NoticeDto n) {
		return noticeDao.insertNotice(n); // 오류나면 exception 뜨기때문에 그게 아니라면 자동 commit된거
	}

	@Override
	public int updateNotice(NoticeDto n) {
		return noticeDao.updateNotice(n);
	}

	@Override
	public int deleteNotice(String[] deleteNo) {
		return noticeDao.deleteNotice(deleteNo);
	}

}