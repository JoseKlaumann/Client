package entities;

public class OrderItem {
	
	private Double price;
	private Integer quantity;
	
	private Product product;

	public OrderItem() {
	}
	
	public OrderItem(Double price, Integer quantity, Product product) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return price*quantity;
	}
	
	@Override
	public String toString() {
		return product.getName() 
			 + ", $"
			 + String.format("%.2f", price)
			 + ", Quantity: "
			 + quantity
			 + ", Subtotal: $"
			 + String.format("%.2f", subTotal());
	}
}
