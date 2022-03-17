package com.ofss;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/m1")
	public String m1(ModelMap map)
	{
		map.addAttribute("myName","Guru");
		return "Hello"; // view name Hello.jsp should be there
	}
}
