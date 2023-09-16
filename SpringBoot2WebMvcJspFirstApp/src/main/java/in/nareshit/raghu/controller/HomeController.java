package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //(Object + HTTP Protocol) 
public class HomeController {

	//@RequestMapping(value = "/show",method = RequestMethod.GET)
	@RequestMapping(value = "/show")
	public String showPage() {
		System.out.println("METHOD IS CALLED...");
		return "HomePage";
	}
}
