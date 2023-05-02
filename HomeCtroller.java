package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeCtroller {

	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name","karun");
		model.addAttribute("id",101);
		List<String> names=new ArrayList<String>();
		names.add("Raj");
		names.add("Arun");
		names.add("Karthik");
		model.addAttribute("list", names);		
		return "index";
	}
	
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("This is welcome url");
		return "welcome";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView obj=new ModelAndView();
		obj.addObject("name", "Puja");
		obj.addObject("id", 102);
		
		obj.setViewName("help");
		return obj;
	}
}
