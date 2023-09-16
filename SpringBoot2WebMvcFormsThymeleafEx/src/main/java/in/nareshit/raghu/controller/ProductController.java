package in.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nareshit.raghu.model.Product;

@Controller
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/showEdit")
	public String showEditProd(Model model) 
	{
		Product prod = new Product(999, "PEN", 500.0, "B", "NIT", "TEST SAMPLE");
		model.addAttribute("product",prod);
		return "ProductEdit";
	}
}
