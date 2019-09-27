package com.cg.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcdemo.dto.Product;
import com.cg.springmvcdemo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService prodservice;
	//Can put any name in the value, need not to have same value
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value="/add_page",method = RequestMethod.GET)
	public String addProduct(@ModelAttribute("product_details") Product product,Map<String,Object> model) {
		List<String> types=new ArrayList<String>();
		types.add("SELECT");
		types.add("Electronics");
		types.add("Grocery");
		types.add("Home Appliances");
		
		model.put("dataitem",types);
		return "addProduct";
	}
	
	@RequestMapping(value = "/pagesubmit", method = RequestMethod.POST)
	public String addData(@ModelAttribute("product_details") Product product) {
		System.out.println(product);
		prodservice.addProduct(product);
		return "home";
	}
	
	@RequestMapping(value = "/show_all" , method=RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> myList = prodservice.showProducts();
		//page,key,value pair
		return new ModelAndView("ShowProduct","data",myList);
		
	}
	@RequestMapping(value = "/delete", method=RequestMethod.GET)	
	public String deletePage() {
		return "DeleteProduct";
	}
	@RequestMapping(value="/deletedata",method = RequestMethod.POST)
	public String deleteData(@RequestParam("pid") int prodId) {
		
		prodservice.removeData(prodId);
		System.out.println("deleted");
		return "redirect:/show_all";
	}
}
