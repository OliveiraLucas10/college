/** 
 * 	Each product should have ---  product ID,
 * 							 ---  name
 * 							 ---  price
 * 							 ---  and quantity parameters. 
 * 
 * */ 
package week_6_file_handling;

import java.io.Serializable;

//create the abstract super class 
@SuppressWarnings("serial")
abstract class Product implements Serializable {

	//create the default attributes 
	public String productId;
	public String name;
	public double price;
	public int quantity;
	
	//create the constructor
	public Product (String productId, String name, double price, int quantity) {
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}//close the constructor
	
	//Creating the abstract methods to be responsible for the polymorphisms in the inheritances classes
	abstract public String getMaterial();
    abstract public int getMemorySize();
    abstract public double getDisplaySize();
	abstract public Dimensions getDimensions();
	abstract public void checkStoque(String productId);
	abstract public void productDetails (String productId);
	abstract public double taxReturn(String productId, int quantity);
	
	//creating the getters and setter necessary for the exercise
	public String getProductId() {
		return productId;
	}//closing get Product Id
	public String getName() {
		return name;
	}//closing get Name
	public double getPrice() {
		return price;
	}//closing get Price
	public int getQuantity() {
		return quantity;
	}//closing get Quantity 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}//closing set Quantity 
	
	//creating the buy products method to be used through the inheritance
	public void buyProducts(String productId, int quantity) {
		int p = getQuantity() - quantity;
		setQuantity(p);
		System.out.println("                                                                                     ");
		System.out.println(" =================================================================================== ");
		System.out.println(" Congratulation! You succesfully bought " + quantity + " of " + productId);
		System.out.println(" =================================================================================== ");
		System.out.println("                                                                                     ");
	}//closing the buy products method
	
}//Closing class Product
