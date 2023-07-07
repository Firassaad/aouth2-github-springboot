package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "hello home ";
    }
    @GetMapping("\safe")
    public String secured(){
        return "Hello from a safe spot";
    }
}
