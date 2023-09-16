package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@GetMapping("/show")
	public ModelAndView showPage() {
		ModelAndView m= new ModelAndView();
		m.setViewName("HomePage");
		return m;
	}
	
	@GetMapping("/data")
	public ModelAndView showData() {
		ModelAndView m = new ModelAndView();
		m.addObject("sid", 100);
		m.addObject("sname", "AA");
		m.setViewName("DataPage");
		return m;
	}
}
