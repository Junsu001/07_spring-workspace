package com.br.file.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class AttachDto {
	
	private int fileNo;
	private String filPath;
	private String originalName;
	private String filesystemName;
	private int refBoardNo;
	
	
}
