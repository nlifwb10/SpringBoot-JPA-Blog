package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 // 스프링이 com.cos.blog패키지 이하를 스캔해서 모든파일을 메모리에 new하는것은 아니고
 // 특정 어노테이션이 붙어있는 클래스 파일 들을 new해서 (IOC)스프링 컨테이너에 관리해줌
@RestController
public class BlogControllertTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring bodfot</h1>";
	}
}
