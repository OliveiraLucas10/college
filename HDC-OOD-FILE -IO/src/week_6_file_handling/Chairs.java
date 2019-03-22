package week_6_file_handling;

/** creating the chairs class extends the attributes from the super class furniture */
@SuppressWarnings("serial")
public class Chairs extends Furniture{
	/** creating the constructor of the class Chairs, through the inheritance */
	public Chairs (String productId, String name, Double price, int quantity) {
		super(productId, name, price, quantity);
	}//closing constructor 

}//Closing chairs class
