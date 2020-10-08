package com.sujata.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Item;
import com.sujata.model.service.ItemService;

@Controller
@SessionAttributes({"items"})
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/")
	public String mainPage(){
		return "index";
	}
	
	@RequestMapping("/showAll")
	public ModelAndView getAllItemController(){
		ModelAndView modelAndView=new ModelAndView();
		
		List<Item> items= itemService.getAllItems();
		
		modelAndView.addObject("items", items);
		modelAndView.setViewName("showallitems");
		
		return modelAndView;
	}
	
	@RequestMapping("/addItem")
	public ModelAndView addItemController(){
		return new ModelAndView("additem", "command", new Item());
	}
	
	@RequestMapping("/insertItem")
	public ModelAndView insertItemController(@ModelAttribute Item item){
		ModelAndView modelandView=new ModelAndView();
		String msg=null;
		if(itemService.addItem(item))
			msg="Item Added";
		else
			msg="Item Not Addded";
		
		modelandView.addObject("message", msg);
		modelandView.setViewName("output");
		return modelandView;
	}
	
	@RequestMapping("/searchItem")
	public ModelAndView searchItemController(){
		return new ModelAndView("searchitem","command",new Item());
	}
	
	@ModelAttribute("itemIds")
	List<Integer> getItemIds(){
		List<Item> items=itemService.getAllItems();
		ArrayList<Integer> itemIds=new ArrayList();
		for(Item item:items){
			itemIds.add(item.getItemId());
		}
		return itemIds;
	}
}
