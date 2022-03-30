package by.it_academy.task.customer;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] cus = new Customer[5];
		cus[0] = new Customer(0, "Селявко", "Дарья", "Сергеевна", 1230, 11456);
		cus[1] = new Customer(1, "Петрова", "Оксана", "Сергеевна", 8600, 14865);
		cus[2] = new Customer(2, "Анкуда", "Максим", "Олегович", 1199, 24560);
		cus[3] = new Customer(3, "Пудрова", "Дарья", "Сергеевна", 1123, 15678);
		cus[4] = new Customer(4, "Селявко", "Алексей", "Иванович", 2235, 75699);

		Customers list = new Customers("Book", 123.456);
		for (Customer e : cus) {
			list.addCustomer(e);
		}
		list.sortcustomer();
		printList(list.getCus());
		System.out.println("------------------------------");
		List<Customer> c = list.intervalnumber(1000, 1500);
		printList(c);
	}
	

	public static void printList(List<Customer> c) {
		for(Customer cus: c) {
			System.out.println(cus.toString());
		}
	}
}
