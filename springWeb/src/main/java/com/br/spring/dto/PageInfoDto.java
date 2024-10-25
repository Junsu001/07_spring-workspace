package com.br.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class PageInfoDto {

	private int listCount;
	private int currentPage;
	private int pageLimit;
	private int boardlimit;
	private int maxPage;
	private int startPage;
	private int endPage;
	
	
}
