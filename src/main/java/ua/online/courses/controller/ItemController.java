package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemController {
	@GetMapping("/items")
	public String showItems(Model model) {
		List<String> items = new ArrayList<>();
		items.add("Sneakers");
		items.add("Polo");
		items.add("Shirt");
		items.add("Jeans");
		items.add("Boots");
		items.add("Hat");
		items.add("Snapback");
		
		model.addAttribute("itemsList" , items);
		return "items";
	}
	
	@GetMapping("items/{item1}")
	public String showProduct(Model model, 
			@PathVariable("item1") String item) {
		model.addAttribute("item1", item);
		return "items/product";
	}
	
	@GetMapping("/items/{itemName}/shopcard")
	public String addToShopCart(Model model, @PathVariable("itemName") String name) {
		model.addAttribute("itemName", name);
		return "items/shopcard";
	}
	
	@GetMapping("/items/{itemName}/order")
	public String order() {
		return "items/order";
	}

}
