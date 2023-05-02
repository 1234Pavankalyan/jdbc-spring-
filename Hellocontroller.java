package Springpackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hellocontroller {
@RequestMapping("/hello")
public String hello(Model model) {
	System.out.println("hello welcome");
	model.addAttribute("message","Hello world!");
	return "index";
	
}
}
