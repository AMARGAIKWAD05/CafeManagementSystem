package com.example.demo.entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String itemName;
	private int price;
	
	/*@ManyToMany(cascade = CascadeType.ALL,mappedBy = "menuitem")
	@JsonIgnore
	List<OrderItem> orderitem;*/

}
