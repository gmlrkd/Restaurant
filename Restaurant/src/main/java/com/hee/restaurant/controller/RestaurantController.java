package com.hee.restaurant.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hee.restaurant.service.RestaurantService;
import com.hee.restaurant.vo.RestaurantVO;

@Controller
public class RestaurantController {

	@Autowired
	public RestaurantService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<RestaurantVO> list;

		list = service.getAllList();
model.addAttribute("city",list.get(0));	
		model.addAttribute("list", list);
		return "main";
	}
	@RequestMapping(value = "/restaurant/list", method = RequestMethod.GET)
	public String list( Model model) {
		List<RestaurantVO> list;
		list = service.getAllList();
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping(value="/restaurant/detail",method=RequestMethod.GET)
	public String detail(RestaurantVO rvo,@RequestParam("no") String no,Model model) {
		rvo = service.getRVO(no);
		
		model.addAttribute("rvo",rvo);
		
		return "detail";
	}
}
