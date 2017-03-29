package by.htp.homelibrary.domain;

public class Magazine extends PrintedEdition {
	String editor;
	public Magazine(double price, String name, String ed) { 
		super(price, name);
		editor = ed;
	} 

	public String toString() { 
		return "Magazine {price = " + super.price +", name = '" + super.name + ", editor = '" + this.editor + "'}"; 
	}
	public String printFormat(){
		return "A4";
	}
	public boolean showAPrintedEdition(){
		boolean a = editor.startsWith("a");
		return a; 
	}
}


