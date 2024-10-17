package com.br.mvc.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.br.mvc.dto.NoticeDto;

//Dao역할 하는 클래스에 부여하는 componemt어노테이션(빈스캐닝에 의해 빈 등록)
@Repository
public class NoticeDao {
   
   //db에 담겨있는 공지사항 데이터 임의 지정-추후DB연동
   private List<NoticeDto> dbList = Arrays.asList(
               new NoticeDto(1,"제목1","내용1")
              , new NoticeDto(2,"제목2","내용2")
              , new NoticeDto(3,"제목3","내용3")
         );
   
   public List<NoticeDto> selectNoticeList(){
      return dbList;
   }
   
   public NoticeDto selectNoticeByNo(int noticeNo) {
      for(NoticeDto n: dbList) {
         if(n.getNo() == noticeNo) {
            return n;
         }
      }
      //쿼리실행결과반환
      return null;
   }
   
   public int  updateNotice(NoticeDto n) {
	      for(NoticeDto s: dbList) {
	         if(s.getNo() == n.getNo()) {
	        	 
	        	s.setNo(n.getNo());
	            s.setTitle(n.getTitle()); 
	            s.setContent(n.getContent()); 
	            return 1;
	         }
	      }
	      //쿼리실행결과반환
	      return 0;
	   }
   
 
}
