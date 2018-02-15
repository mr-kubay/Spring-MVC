package ua.online.courses.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.online.courses.entity.Item;
import ua.online.courses.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("items/list")
	public String showItems(Model model) {
		model.addAttribute("itemsList", itemService.showAllItems());
		return "items/items";
	}
	
	@GetMapping("items/add")
	public String showAddItemPage() {
		return "items/add-item";
	}
	
	@PostMapping("items/add")
	public String saveItem(
				@RequestParam("name") String name,
				@RequestParam("price") BigDecimal price) {
		
		Item item = new Item();
		item.setName(name);
		item.setPrice(price);
		
		itemService.saveItem(item);
		return "redirect:/items/list";
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
	
	@GetMapping("/items/product")
	public String showBuyList() {
		return "items/product";
	}

	
}
