package by.it_academy.task.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
	private List<Customer> cus;
	private String product;
	private double price;

	public Order() {
		this("", 0);
	}

	public Order(String product, double price) {
		this.cus = new ArrayList<>();
		this.setProduct(product);
		this.setPrice(price);
	}

	public List<Customer> getCus() {
		return cus;
	}

	public void setCus(List<Customer> cus) {
		this.cus = cus;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			this.price = 0;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(cus, price, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(cus, other.cus) && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(product, other.product);
	}

	@Override
	public String toString() {
		return "Order [cus=" + cus + ", product=" + product + ", price=" + price + "]";
	}

}
