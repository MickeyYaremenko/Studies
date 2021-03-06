package by.htp.persons;

public class Adress {
	private String city;
	private String street;
	private int houseNum;

	public Adress(String city, String street, int houseNum) {
		this.city = city;
		this.street = street;
		this.houseNum = houseNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}

	public String toString() {
		return "City: " + city + " Street: " + street + " House number:" + houseNum;
	}

}
