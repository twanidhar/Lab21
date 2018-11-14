package co.grandcircus1.coffeeshopdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer quantity;

	@ManyToOne
	private BakeryItem bakeryItem;

	public CartItem() {

	}

	public CartItem(Long id, Integer quantity, BakeryItem bakeryItem) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.bakeryItem = bakeryItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BakeryItem getBakeryItem() {
		return bakeryItem;
	}

	public void setBakeryItem(BakeryItem bakeryItem) {
		this.bakeryItem = bakeryItem;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", quantity=" + quantity + ", bakeryItem=" + bakeryItem + "]";
	}

}
