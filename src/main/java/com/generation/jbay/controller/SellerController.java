package com.generation.jbay.controller;

import com.generation.jbay.controller.helpers.ControllerHelper;
import com.generation.jbay.model.entities.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seller")
public class SellerController
{
	@Autowired
	ControllerHelper helper;


	@GetMapping
	public String seeAllSellers(Model model)
	{
		model.addAttribute("sellers",helper.findAllSellers());
		return "sellersPagina";
	}

	@PostMapping
	public String insertSeller(@ModelAttribute Seller seller)
	{
		helper.saveSeller(seller);
		return "redirect:/seller";
	}
}
