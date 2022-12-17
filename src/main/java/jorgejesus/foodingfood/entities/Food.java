package jorgejesus.foodingfood.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "foods")
@AllArgsConstructor
@NoArgsConstructor
public class Food {
	
	@Id
	@Column(name= "id")
	private int id;
	
	@Column(name= "name")
	private String foodName;

}
