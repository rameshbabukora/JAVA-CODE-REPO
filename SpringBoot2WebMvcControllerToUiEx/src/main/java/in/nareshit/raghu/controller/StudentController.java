package in.nareshit.raghu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.nareshit.raghu.model.Student;

@Controller
public class StudentController {

	@GetMapping("/show")
	public String showData(Model model)
	{

		List<Student> list = Arrays.asList(
				new Student(100, "AA", 2500.0),
				new Student(101, "BA", 2900.0),
				new Student(102, "AC", 2800.0),
				new Student(103, "FF", 2600.0)
				);
		model.addAttribute("list", list);
		return "StdData";
	}
}
