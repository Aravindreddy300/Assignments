package com.cg.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.entity.Product;
import com.cg.service.ProductService;

@Controller
@RequestMapping("/api1")
public class ProductController {
	
	@Autowired
	ProductService service;
	@RequestMapping("/product")
	public String viewHomePage(Model model) {
		System.out.println("Hello");
		List<Product> listproducts = service.listAll();
		model.addAttribute("listproducts", listproducts);
		for(Product p : listproducts) {
			System.out.println("data "+ p.getId()+p.getName());
		}
		return "product_index";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		
		Product p=new Product();
		model.addAttribute("product", p);
		return "new_product";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    service.save(product);
	     
	    return "redirect:/api1/product";
	}
	
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name="id") Long id) {
		service.delete(id);
		return "redirect:/api1/product";
	}
	
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name="id") Long id) {
		ModelAndView mav=new ModelAndView("edit_product");
		Product product=service.get(id);
		mav.addObject("product", product);
		return mav;
	}
	
}
