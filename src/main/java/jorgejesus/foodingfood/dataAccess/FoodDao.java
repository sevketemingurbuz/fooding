package jorgejesus.foodingfood.dataAccess;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import jorgejesus.foodingfood.entities.Food;

public interface FoodDao extends JpaRepository<Food, Integer>{
	

	
	List<Food> getByFoodNameContainsIgnoreCase (String foodName);
	

	List<Food> getByFoodNameContainsIgnoreCase (String foodName, Pageable page);
	

}
