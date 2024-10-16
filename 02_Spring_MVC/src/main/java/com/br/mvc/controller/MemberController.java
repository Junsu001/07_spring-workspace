package com.br.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/member")
@Controller
public class MemberController {

	// ===== 요청시 전달되는 값(parameter) 처리하는 방법 =====
	/*
	 * 	1. HttpServletRequest 방법
	 *  2. @RequestParam 이용하는 방법
	 *  3. 커맨드 객체 이용하는 방법
	 * 
	 */
	
	/*
	 * 	1. HttpServletRequest 방법
	 */
	@RequestMapping("/detail.do")
	public String memberDetail(HttpServletRequest request) {
		int no = Integer.parseInt(request.getParameter("no"));
		
		System.out.println("조회 할 회원번호: " + no);
		
		
		return "main";
	}
	
//	@RequestMapping(value="/enroll.do", method=RequestMethod.GET) // 405 에러 (요청전송방식이 맞지 않을 경우)
//	@RequestMapping(value="/enroll.do", method=RequestMethod.POST) 
	@PostMapping("/enroll1.do") // Spring 버전업 되면서 @GetMapping, @PostMapping 지원
	public String memberEnroll1(HttpServletRequest request) {
		
//		request.setCharacterEncoding("utf-8"); // => 스프링에서 제공하는 인코딩 필터 등록 (web.xml)
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + address);
		

		return "main";
	}
	
	/*
	 * 2. @RequestParam 이용하는 방법
	 * 	  request.getParameter()를 자동으로 해주는 어노테이션
	 * 
	 * 	 1) 요청시 전달값을 받기 위한 변수를 매개변수로 작성하기
	 *   2) 요청시 전달값의 키값과 담고자하는 변수명이 다를경우 
	 *   	또는 어노테이션의 속성을 활용하고자 할 경우 어노테이션 기술
	 *   
	 */
	
	@GetMapping("/detail2.do")
	public String memberDetail2(int no) {
	
		System.out.println("조회할 회원번호: " + no);
		return "main";
	}
	
	@PostMapping("/enroll2.do")
	public String memberEnroll2(/*@RequestParam(value="name")*/ String name //키값과 매개변수명이 동일할 경우 생략 가능
							  , @RequestParam(value="age", defaultValue="10") int age //내부적으로 파싱돼서 담기는데 값이 없을 경우 400 에러
							  	// int형으로 넘어오는 값이 없을때 빈문자열로 설정할 수 있는데 그럴땐 @RequestParam을 명시해줘야함 
							  , @RequestParam(/*value=*/"address")String addr) 
								// 어노테이션 내에서 value속성값만 작성할경우 속성명 생략가능 알아서 value값으로 인식됨
	{
		
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + addr);
		
		return "main";
	}
	
}