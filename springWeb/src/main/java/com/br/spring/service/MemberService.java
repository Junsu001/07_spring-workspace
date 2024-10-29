package com.br.spring.service;

import com.br.spring.dto.MemberDto;

public interface MemberService {
	
	// 로그인
	MemberDto selectMember(MemberDto m);
	
	// 회원가입
	int insertMember(MemberDto m);
	
	// 아이디 중복체크
	int selectUserIdCount(String checkId);
	
	// 회원정보 변경
	int updateMember(MemberDto m);
	
	// 회원프로필 변경
	int updateProfileImg(MemberDto m);
	
	// 회원탈퇴
	int deleteMember(String userId);
}
