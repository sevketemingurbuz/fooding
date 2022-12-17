package jorgejesus.foodingfood.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jorgejesus.foodingfood.business.FoodService;
import jorgejesus.foodingfood.entities.Food;

@RestController
@RequestMapping("/api/food")
public class FoodController {
	
	FoodService foodService;
	
	public FoodController(FoodService foodService) {
		this.foodService= foodService;
	}
	
	@GetMapping("/getPageNoAndPageSize")
	public List<Food> getAll(int pageNo, int pageSize){
		return this.foodService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("getByFoodNameContains")
	public List<Food> getByFoodNameContains(String foodName){
		return this.foodService.getByFoodNameContains(foodName);
	}
	
	@GetMapping("getByFoodNameContainsAndPageNoPageSize")
	public List<Food> getByFoodNameContainsAndPageNoPageSize(String foodName, int pageNo, int pageSize){
		return this.foodService.getByFoodNameContainsAndPageNoPageSize(foodName, pageNo, pageSize);
	}

}
