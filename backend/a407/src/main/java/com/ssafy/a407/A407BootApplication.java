package com.ssafy.a407;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class A407BootApplication implements WebMvcConfigurer{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(A407BootApplication.class, args);
	}
//
//	@Autowired
//    private JwtInterceptor jwtInterceptor;
//
////    JWTInterceptor를 설치한다.
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry
//        .addInterceptor(jwtInterceptor).addPathPatterns("/user/**") // 기본 적용 경로
//        .excludePathPatterns(Arrays.asList("/user/login", "/user/join", "/user/findId", "/user/findPw"));// 적용 제외 경로
////                .excludePathPatterns(Arrays.asList("/user/confirm/**", "/board/list"));// 적용 제외 경로
//    }
//
////    Interceptor를 이용해서 처리하므로 전역의 Corss Origin 처리를 해준다.
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowedMethods("*")
//                .allowedHeaders("*")
//                .exposedHeaders("x-access-token");
//    }

}
