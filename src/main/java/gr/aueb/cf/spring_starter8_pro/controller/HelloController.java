package gr.aueb.cf.spring_starter8_pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/starter")
public class HelloController {

//    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("message", "Hello Coding");
        return "index";
    }
}
