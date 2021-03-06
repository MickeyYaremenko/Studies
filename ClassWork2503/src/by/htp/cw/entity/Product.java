package by.htp.cw.entity;

public class Product {
	
	private int id;
	private String name;
	private String UPC;
	private String manufacturer;
	private double price;
	private int longevityDays;
	private static int producedAmount;
	
	{
		producedAmount++;
	}
	
	public Product(){
		
	}
	public Product(int id, String name, String UPC, String manufacturer, double price, int longevityDays){
		this.id = id;
		this.name = name;
		this.UPC = UPC;
		this.manufacturer = manufacturer;
		this.price = price;
		this.longevityDays = longevityDays;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUPC() {
		return UPC;
	}
	public void setUPC(String uPC) {
		UPC = uPC;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getLongevityDays() {
		return longevityDays;
	}
	public void setLongevityDays(int longevityDays) {
		this.longevityDays = longevityDays;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", UPC=" + UPC + ", manufacturer=" + manufacturer + ", price="
				+ price + ", longevityDays=" + longevityDays + "]";
	}
	public static int getProducedAmount() {
		return producedAmount;
	}
	
	
	
	

}
