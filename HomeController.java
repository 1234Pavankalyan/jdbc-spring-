package com.controller1;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
import com.model.User;
 
@Controller
public class HomeController {
 
    
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name","karun");
        model.addAttribute("id",101);
        List<String> list=new ArrayList<String>();
        list.add("karun");
        list.add("mouni");
        list.add("Raj");
        
        model.addAttribute("listofnames", list);
        
        System.out.println(list);
        return "listofusers";
    }
    
    @RequestMapping("/addUser")
    public String addUser(@ModelAttribute User user,Model model) {
 
        return "welcome";
    }
}
 