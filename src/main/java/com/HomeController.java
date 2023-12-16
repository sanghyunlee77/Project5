package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping
    public String class_index(Model model){
        model.addAttribute("title", "2학년 2학기");
        return "index";
    }
}
