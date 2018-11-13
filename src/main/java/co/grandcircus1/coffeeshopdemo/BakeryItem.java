package co.grandcircus1.coffeeshopdemo;

public class BakeryItem {
	
	private Long id;
	private String name;
	private String description;
	private Double price;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public BakeryItem() {

}


	public BakeryItem(String name, String description, Double price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "BakeryItem [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	} }
 