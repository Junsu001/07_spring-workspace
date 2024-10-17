package com.br.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * * Lombok (롬복)
 * - 해당 클래스에 작성되어있는 필드를 가지고 내부적으로
 *   생성자, getter/setter, toString 등을 만들어주는 어노테이션을 제공
 * - 클래스에 필드만을 작성하고 클래스 상단에 필요로하는 생성자 또는 메소드 어노테이션 기술만 하면됨
 *   
 * - 장점 : 필드가 후에 변경될(타입, 이름, 새로이 추가) 경우 매번 일일히 생성자 또는 메소드를 수정할 필요가 없어짐
 * - 단점 : 롬복이 알아서 메소드같은걸 만들때 메소드 명을 부여하는데 이때 명명규칙이
 * 			framework에서 요구하는 이름이 아닐 수 있음
 * 			ex) mName 필드일 경우 setmname, getmnName 이름으로 만들어져야됨
 * 				롬복은 setMName , getMName로 만들어줌
 *  			프레임워크 기능을 이용해서 필드에 매핑 시킬때 또는 값 꺼낼때 제대로 매핑 또는 못가져올 수도있음
 *  			#{mName}, ${mName} 
 *  		=> 따라서 이제부터 필드는 적어도 소문자가 두 글자이상 시작하는 이름으로 짓자!!!!
 *  
 *  - 유의사항
 *  	ㄴ 롬복 라이브러리 추가만으로 바로 사용 불가
 *  	ㄴ 해당 IDE(Eclipse, STS>에서 롬복을 사용할 수 있도록 설치 (설치후 재실행)
 *  		ㄴ 롬복 라이브러리(.jar) 를 실행시키면 설치창 뜸
 */			

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString			// 코드로 보여지지는 않지만 실제로 동작함
public class MemberDto {
	
	private String name;
	private String age;
	private String addr;
//	private String mname;
}
