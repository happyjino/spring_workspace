package com.care.root.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class FileConfig {
	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver mr = new CommonsMultipartResolver(); // 객체 생성
		mr.setMaxUploadSize(52428800); // 50MB -> 최대 사이즈 정해주기
		mr.setDefaultEncoding("utf-8"); // 인코딩 정하기
		return mr;
		
		/* 
		         이걸 xml에 만들려면 servlet-context.xml에서 만들어준다. 
			<beans:bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver(이 위치에 있는걸로 빈을 만들겠다!)">
				<beans:property name="maxUploadSize" value="52428800" />
				<beans:property name="defaultEncoding" value="utf-8" />
			</beans:bean> 
		 */
	}
	
	
	
}
