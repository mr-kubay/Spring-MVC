package ua.online.courses.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item extends BaseEntity{
	
	
	private String name;
	private String descr;
	private int amount;
	
	@Column(columnDefinition = "DECIMAL(5,2)")
	private BigDecimal price;
	
	public Item() {}

	public Item(String name, String descr, int amount, BigDecimal price) {
		this.name = name;
		this.descr = descr;
		this.amount = amount;
		this.price = price;
	}

	public String getName() {
		return name;
	}

		
	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}
	
	
}
