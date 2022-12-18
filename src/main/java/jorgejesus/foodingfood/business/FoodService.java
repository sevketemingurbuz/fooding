package jorgejesus.foodingfood.business;

import java.util.List;

import jorgejesus.foodingfood.entities.Food;

public interface FoodService {

	public List<Food> getAll(int pageNo, int pageSize);
	
	public List<Food> getByFoodNameContainsIgnoreCase(String foodName);
	
	public List<Food> getByFoodNameContainsAndPageNoPageSize(String foodName, int pageNo, int pageSize);
	
}
