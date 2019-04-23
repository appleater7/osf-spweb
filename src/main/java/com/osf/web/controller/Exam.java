package com.osf.web.controller;

import lombok.extern.slf4j.Slf4j;
/*
 * log4j level 순서
 * 0. all : 다나옴
 * 1. Trace : 매우 상세한 정보(추적의 추적)
 * 2. Debug : 개발할때 필요한 정보
 * 3. Info : 정보 톰캣이 언제 시작되었다., 어떤 프로그램이 실행되고있다 등
 * 4. Warn : Warning 경고
 * 5. Error : Error 실제 발생하는 에러!!
 * 6. Fatal : 진짜 치명적인 에러
 * 7. off : 아무것도 안함
 */

@Slf4j
public class Exam {
	
	public static void main(String[] args) {
		String str = null;
		Exam e1 = new Exam();
		Exam e2 = new Exam();
		System.out.println(e1);
		log.info("e1=>{}", e1);
		log.info("e1=>{}, e2=>{}", e1, e2);
		
		if (str.equals("홍길동")) {
			log.info("이름은 홍길이 맞습니다.");
		}else {
			log.info("이름은 홍길이 아닙니다.");
		}
	}
}
