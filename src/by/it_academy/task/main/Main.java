package by.it_academy.task.main;

import by.it_academy.task.customer.Customer;
import by.it_academy.task.customer.Order;
import by.it_academy.task.logic.ListCustomer;
import by.it_academy.task.view.ViewCustomer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer[] cus = new Customer[9];
		cus[0] = new Customer(0, "Селявко", "Дарья", "Сергеевна", 1230, 11456);
		cus[1] = new Customer(1, "Петрова", "Оксана", "Сергеевна", 8600, 14865);
		cus[2] = new Customer(2, "Анкуда", "Максим", "Олегович", 1199, 24560);
		cus[3] = new Customer(3, "Пудрова", "Дарья", "Сергеевна", 1123, 15678);
		cus[4] = new Customer(4, "Селявко", "Алексей", "Иванович", 2235, 75699);
		cus[5] = new Customer(5, "Мокотова", "Валентина", "Константиновна", 4235, 15699);
		cus[6] = new Customer(6, "Пудров", "Сергей", "Михайлович", 1235, 65699);
		cus[7] = new Customer(7, "Селявко", "Сергей", "Алексеевич", 0, 0);
		cus[8] = new Customer(8, "Селявко", "Иван", "Алексеевич");

		Order list = new Order("Book", 123.456);
		for (Customer e : cus) {
			ListCustomer.addCustomer(list, e);
		}
		ListCustomer.sortcustomer(list);

		ViewCustomer.printList(list.getCus());

		System.out.println("------------------------------");

		ViewCustomer.printList(ListCustomer.intervalnumber(list, 1000, 1500));
	}

}
