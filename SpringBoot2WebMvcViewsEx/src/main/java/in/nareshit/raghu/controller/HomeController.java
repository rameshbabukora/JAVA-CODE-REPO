package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.nareshit.raghu.view.SampleExcelExport;
import in.nareshit.raghu.view.SamplePdfView;

@Controller
public class HomeController {

	@GetMapping("/excel")
	public ModelAndView showExcelData() {
		ModelAndView m = new ModelAndView();
		m.setView(new SampleExcelExport());;
		m.addObject("title", "WELCOME TO NIT");
		return m;
	}
	
	@GetMapping("/pdf")
	public ModelAndView showPdfData() {
		ModelAndView m = new ModelAndView();
		m.setView(new SamplePdfView());;
		m.addObject("title", "WELCOME TO NIT");
		return m;
	}
}
