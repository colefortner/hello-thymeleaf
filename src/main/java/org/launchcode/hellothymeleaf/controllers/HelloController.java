package org.launchcode.hellothymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    // responds to get requests at "/hello"
    @GetMapping("hello")
    // Thymeleaf template will not work if @ResponseBody is active
//    @ResponseBody
    public String hello(Model model) {
        model.addAttribute("variableName", "variableValue");
        return "first-template";
    }

}



