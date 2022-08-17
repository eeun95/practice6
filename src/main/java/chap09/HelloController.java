package chap09;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// @Controller 어노테이션을 적용한 클래스는 스프링 MVC에서 컨트롤러로 사용한다.
@Controller
public class HelloController {

    // @GetMapping 어노테이션은 메서드가 처리할 요청 경로를 지정한다.
    @GetMapping("/hello")
    // Model 파라미터는 컨트롤러의 처리 결과를 뷰에 전달할 때 사용한다.
    // @RequestParam 어노테이션은 HTTP 요청 파라미터의 값을 메서드의 파라미터로 전달할 때 사용된다.
    public String hello(Model model, @RequestParam(value="name", required = false) String name) {
        model.addAttribute("greeting", "안녕하세요" + name);
        return "hello";
    }
}
