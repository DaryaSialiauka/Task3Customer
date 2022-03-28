package by.it_academy.task.customer;

public class Customer {

	private int id;
	private String firstname;
	private String lastname;
	private String patronymic;
	private int numbercreditcard;
	private int numberbankaccount;

	public Customer(int id, String firstname, String lastname, String patronymic, int numbercreditcard,
			int numberbankaccount) {
		this.setId(id);
		this.setFirstname(firstname);
		this.setLastname(lastname);
		this.setPatronymic(patronymic);
		this.setNumbercreditcard(numbercreditcard);
		this.setNumberbankaccount(numberbankaccount);
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

	public int getNumbercreditcard() {
		return numbercreditcard;
	}

	public void setNumbercreditcard(int numbercreditcard) {
		if (numbercreditcard > 999) {
			this.numbercreditcard = numbercreditcard;
		} else {
			this.numbercreditcard = 0;
		}
	}

	public int getNumberbankaccount() {
		return numberbankaccount;
	}

	public void setNumberbankaccount(int numberbankaccount) {
		if (numberbankaccount > 9999) {
			this.numberbankaccount = numberbankaccount;
		} else {
			this.numberbankaccount = 0;
		}
	}

	public String toString() {
		return "ФИО:" + firstname + " " + lastname + " " + patronymic + ", номер карты:" + numbercreditcard
				+ ", номер банковского счета:" + numberbankaccount;
	}

}
