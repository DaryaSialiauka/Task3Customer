package by.it_academy.task.customer;

public class Customers {
	private Customer[] cus;
	private String product;
	private double price;

	public Customers(Customer[] cus, String product, double price) {
		this.setCus(cus);
		this.setProduct(product);
		this.setPrice(price);
	}

	public Customer[] getCus() {
		return cus;
	}

	public void setCus(Customer[] cus) {
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

	public void sortcustomer() {
		Customer[] temp = this.cus;
		for (int i = 0; i < temp.length - 1; i++) {
			for (int j = 0; j < temp.length - 1 - i; j++) {
				if (temp[j].getFirstname().compareToIgnoreCase(temp[j + 1].getFirstname()) > 0) {
					Customer c = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = c;
				} else if (temp[j].getFirstname().compareToIgnoreCase(temp[j + 1].getFirstname()) == 0) {
					if (temp[j].getLastname().compareToIgnoreCase(temp[j + 1].getLastname()) > 0) {
						Customer c = temp[j];
						temp[j] = temp[j + 1];
						temp[j + 1] = c;
					} else if (temp[j].getLastname().compareToIgnoreCase(temp[j + 1].getLastname()) == 0) {
						if (temp[j].getPatronymic().compareToIgnoreCase(temp[j + 1].getPatronymic()) > 0) {
							Customer c = temp[j];
							temp[j] = temp[j + 1];
							temp[j + 1] = c;
						}
					}
				}
			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i].toString());
		}
	}

	public void intervalnumber(int number1, int number2) {
		Customer[] temp = this.cus;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].getNumbercreditcard() >= number1 && temp[i].getNumbercreditcard() <= number2) {
				System.out.println(temp[i].toString());
			}
		}
	}

}
