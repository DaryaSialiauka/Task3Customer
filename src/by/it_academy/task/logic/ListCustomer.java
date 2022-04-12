package by.it_academy.task.logic;

import java.util.ArrayList;
import java.util.Collections;

import by.it_academy.task.customer.Customer;
import by.it_academy.task.customer.Order;

public class ListCustomer {

	public static void addCustomer(Order or, Customer c) {
		or.getCus().add(c);
	}

	public static void removeCustomer(Order or, int i) {
		or.getCus().remove(i);
	}

	public static void sortcustomer(Order or) {
		Collections.sort(or.getCus());
	}

	public static ArrayList<Customer> intervalnumber(Order or, int number1, int number2) {
		ArrayList<Customer> temp = new ArrayList<>();
		for (int i = 0; i < or.getCus().size(); i++) {
			if (or.getCus().get(i).getNumberCreditCard() >= number1
					&& or.getCus().get(i).getNumberCreditCard() <= number2) {
				temp.add(or.getCus().get(i));
			}
		}
		return temp;
	}
}
