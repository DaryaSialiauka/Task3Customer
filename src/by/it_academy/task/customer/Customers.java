package by.it_academy.task.customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customers {
	private List<Customer> cus;
	private String product;
	private double price;
	
	

	public Customers() {
		this("",0);
	}

	public Customers(String product, double price) {
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

	public void addCustomer(Customer c) {
		this.cus.add(c);
	}

	public void removeCustomer(int i) {
		this.cus.remove(i);
	}

	public void sortcustomer() {
		Collections.sort(this.cus);
	}

	public ArrayList<Customer> intervalnumber(int number1, int number2) {
		ArrayList<Customer> temp = new ArrayList<>();
		for (int i = 0; i < this.cus.size(); i++) {
			if (this.cus.get(i).getNumberCreditCard() >= number1 && this.cus.get(i).getNumberCreditCard() <= number2) {
				temp.add(this.cus.get(i));
			}
		}
		return temp;
	}
	

}
