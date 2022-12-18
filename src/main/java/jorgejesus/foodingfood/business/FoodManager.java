package jorgejesus.foodingfood.business;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import jorgejesus.foodingfood.dataAccess.FoodDao;
import jorgejesus.foodingfood.entities.Food;

@Service
public class FoodManager implements FoodService{
	
	FoodDao foodDao;
	
	public FoodManager(FoodDao foodDao) {
		this.foodDao= foodDao;
	}

	public List<Food> getAll(int pageNo, int pageSize) {
		pageNo= pageNo-1;
		Pageable page = PageRequest.of(pageNo, pageSize);
		return foodDao.findAll(page).getContent();
	}
	
	public List<Food> getByFoodNameContainsIgnoreCase(String foodName){
		return this.foodDao.getByFoodNameContainsIgnoreCase(foodName);
	}
	
	public List<Food> getByFoodNameContainsAndPageNoPageSize(String foodName, int pageNo, int pageSize){
		pageNo= pageNo-1;
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		List<Food> page = this.foodDao.getByFoodNameContains(foodName, pageable);
		return page;
	}
	
}
