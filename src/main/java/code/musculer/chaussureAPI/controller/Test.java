package code.musculer.chaussureAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Test {
    @GetMapping()
    public String test(){
        return "hello dia nkm cool";
    }
}
