package by.htp.homelibrary.domain;

public abstract class PrintedEdition {
	double price; 
	String name; 
	
	public PrintedEdition(double price, String name){ 
		this.price = price; 
		this.name = name; 
	} 
	public abstract String printFormat();
	
	public abstract boolean showAPrintedEdition();
}

