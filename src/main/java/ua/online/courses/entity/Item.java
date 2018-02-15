package ua.online.courses.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item extends BaseEntity{
	
	@Column
	private String name;
	
	@Column
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Item() {}

	public String getName() {
		return name;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", user=" + user + "]";
	}
	
	
}
