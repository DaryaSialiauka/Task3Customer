package by.it_academy.task.customer;

public class Customer implements Comparable<Customer> {

	private int id;
	private String firstname;
	private String lastname;
	private String patronymic;
	private int numberCreditCard;
	private int numberBankAccount;

	private static final int MinNumberCard = 999;
	private static final int MinNumberAccount = 9999;

	public Customer() {
		this.setId(0);
		this.setFirstname("");
		this.setLastname("");
		this.setPatronymic("");
		this.setNumberCreditCard(0);
		this.setNumberBankAccount(0);
	}

	public Customer(int id, String firstname, String lastname, String patronymic, int numberCreditCard,
			int numberBankAccount) {
		this.setId(id);
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setPatronymic(patronymic);
		this.setNumberCreditCard(numberCreditCard);
		this.setNumberBankAccount(numberBankAccount);
	}

	public Customer(int id, String firstname, String lastname, String patronymic) {
		this(id, firstname, lastname, patronymic, 0, 0);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id >= 0) {
			this.id = id;
		} else {
			this.id = 0;
		}
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public int getNumberCreditCard() {
		return numberCreditCard;
	}

	public void setNumberCreditCard(int numberCreditCard) {
		if (numberCreditCard > MinNumberCard) {
			this.numberCreditCard = numberCreditCard;
		} else {
			this.numberCreditCard = 0;
		}
	}

	public int getNumberBankAccount() {
		return numberBankAccount;
	}

	public void setNumberBankAccount(int numberBankAccount) {
		if (numberBankAccount > MinNumberAccount) {
			this.numberBankAccount = numberBankAccount;
		} else {
			this.numberBankAccount = 0;
		}
	}

	public String toString() {
		return "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", patronymic=" + patronymic
				+ ", numbercreditcard=" + numberCreditCard + ", numberbankaccount=" + numberBankAccount;
	}

	@Override
	public int compareTo(Customer c) {
		if (this.firstname.compareToIgnoreCase(c.firstname) == 0) {
			return this.lastname.compareToIgnoreCase(c.lastname);
		} else {
			return this.firstname.compareToIgnoreCase(c.firstname);
		}
	}

}
