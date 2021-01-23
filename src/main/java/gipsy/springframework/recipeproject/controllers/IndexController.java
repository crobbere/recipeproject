package gipsy.springframework.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){
        System.out.println("Some message to say...4444132456789sspds");
        return "index";
    }
}
