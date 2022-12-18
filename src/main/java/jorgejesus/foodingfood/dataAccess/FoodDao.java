package jorgejesus.foodingfood.dataAccess;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jorgejesus.foodingfood.entities.Food;

public interface FoodDao extends JpaRepository<Food, Integer>{
	

	
	List<Food> getByFoodNameContainsIgnoreCase (String foodName);
	

	List<Food> getByFoodNameContains (String foodName, Pageable page);
	

}
