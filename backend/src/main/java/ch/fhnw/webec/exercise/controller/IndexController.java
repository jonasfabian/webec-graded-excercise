package ch.fhnw.webec.exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("title", "Hello World");

        return "index";
    }
}
