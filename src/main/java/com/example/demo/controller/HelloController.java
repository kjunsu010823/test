package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return """
        김채연은 오늘도 멍청미를 발산하며 개발자의 길을 걷는다. 
        빌드가 안 되는 이유를 찾느라 세 시간을 보내고, 
        결국 오타 하나 때문이었음을 알고 조용히 커피를 마신다. 
        모두가 그녀를 멍청이라 부르지만, 사실은 누구보다 근성 있고,
        누구보다 진심으로 성장하고 있는 진정한 개발자다. 
        멍청해도 괜찮다. 매일 한 줄씩 더 나아가고 있으니까.
        """;
    }
}
