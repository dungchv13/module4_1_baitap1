package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculateController {
    @GetMapping("/home")
    public String home(){
        return "convert";
    }


    @GetMapping("/calculate")
    public String convert(@RequestParam("dollars") int dollars, @RequestParam("tyle") int tyle, Model model){
        int vnd = dollars*tyle;

        model.addAttribute("vnd",vnd);
        model.addAttribute("dollars",dollars);
        return "result";

    }
}
