package com.generation.jbay.controller;

import com.generation.jbay.controller.helpers.ControllerHelper;
import com.generation.jbay.model.entities.Merch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/merch")
public class MerchController
{
	@Autowired
	ControllerHelper helper;


	@GetMapping
	public String seeAllMerchs(Model model)
	{
//		List<Merch> all = helper.findAllMerchs();
		model.addAttribute("merchs", helper.findAllMerchs());
		return "merchsPagina";
	}

	@PostMapping
	public String insertMerch(@ModelAttribute Merch merch, @RequestParam Integer seller_id)
	{
		helper.saveMerch(merch,seller_id);
		return "redirect:/merch";
	}

}
