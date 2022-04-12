package by.it_academy.task.view;

import java.util.List;

import by.it_academy.task.customer.Customer;

public class ViewCustomer {

	public static void printList(List<Customer> c) {
		for (Customer cus : c) {
			System.out.println(cus.toString());
		}
	}
}
