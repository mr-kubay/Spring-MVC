package ua.online.courses.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.online.courses.entity.Item;
import ua.online.courses.service.ItemService;

@Controller
@SessionAttributes("item")
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/list")
	public String showItems(Model model) {
		model.addAttribute("itemsList", itemService.showAllItems());
		return "items/list";
	}
	
	@GetMapping("/add")
	public String showAddItemPage(Model model) {
		model.addAttribute("item", new Item());
		return "items/add";
	}
	
	@PostMapping("/add")
	public String saveItem(
				@ModelAttribute("item") Item item) {
		
		itemService.saveItem(item);
		return "redirect:/items/list";
	}
	
	@GetMapping("/{itemId}/edit")
	public String editItem(@PathVariable("itemId") int id , Model model) {
		model.addAttribute("item", itemService.findById(id));
		return "items/edit";
	}
	
	@PostMapping("{itemId}/edit")
	public String saveEditedItem(@ModelAttribute("item") Item item) {
		itemService.saveItem(item);
		return "redirect:/items/list";
	}
	
	@GetMapping("/{item1}")
	public String showProduct(Model model, 
			@PathVariable("item1") String item) {
		model.addAttribute("item1", item);
		return "items/product";
	}
	
	@GetMapping("/{itemName}/shopcard")
	public String addToShopCart(Model model, @PathVariable("itemName") String name) {
		model.addAttribute("itemName", name);
		return "items/shopcard";
	}
	
	@GetMapping("/{itemName}/order")
	public String order() {
		return "items/order";
	}
	
	@GetMapping("/product")
	public String showBuyList() {
		return "items/product";
	}
	
	@GetMapping("{itemID}/delete")
	public String deleteItem(@PathVariable("itemID") int id, Model model) {
		itemService.deleteItem(id);
		return "redirect:/items/list";
	}
}
