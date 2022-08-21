package chap09;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 스프링 부트 프로젝트 구조가 변경이 일어났기 때문에 스프링 부트에서 사용하는 뷰 리졸버(ViewResolver)의 설정 값을 변경 (정확히는 ViewResolver의 경로(Path)를 수정해야 함)
// application.properties 에 변경해줬음 (톰캣 깔기 싫어서 스프링 부트로 ........)

@SpringBootApplication
public class HelloSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

}
