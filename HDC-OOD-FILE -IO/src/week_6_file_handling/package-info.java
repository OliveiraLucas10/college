
/**
 * @author lucasmaximo
 *
 */
/**
 * 												DEVELOPMENT
 *
 * * 		Write a program that helps you manage products that belong to different categories. 
 * 		Each product should have
 * 						|Product (super class)                      |Taxable (interface)
 * 						|---  product ID,              				| -- kitchenware - (defaultTax) = 12%
 * 						|---  name									| -- eletronicdevices - (eletronictTax) = 10%
 * 						|---  price									| -- tv sets - (tvTax) = 16% 
 * 						|---  and quantity parameters. 				| -- kitchenware - plastic - (addTax) = (deafaultTax + 5%)
 * 
 * 
 * 		|Furniture (extends Product)		|Kitchenware (extends Product)              |ElectronicDevices (extends Product)
 * 		|-- chairs,(extends Furniture)		|ALL - additional parameter (material)		|-- keyboards, (extends ElectronicDevices)
 * 		|-- tables,(extends Furniture) 		|-- spoons,  (extends Kitchenware)			|-- mobile phones (extends ElectronicDevices)
 * 		|-- dressers,(extends Furniture)	|-- forks,   (extends Kitchenware)			|-- and mp3 players. (extends ElectronicDevices)
 * 		  |	-- dimensions (parameter/class)	|-- knives,  (extends Kitchenware)			  | -- mp3 additional parameter (memorySize)
 * 			 | -- 3 integers				|-- plates,  (extends Kitchenware)			|-- TV sets, (extends ElectronicDevices)
 * 																						  | -- tv additional parameter (displaySize)
 * 
 *   	 *  	All classes that implement Taxable interface should have a taxReturn method, that displays how much tax will be paid.
 * 		
 * 		 *   	Some products are taxable, which should be implemented using Taxable interface. 
 *  
 *  	 * 		In the beginning of the program, populate an ArrayList with several different kinds of products, minimum 3 of each.
 *  
 *  
 *  	Your program should display a menu with the following options:
 *  		
 *  			1. Buy product. This option should accept Product ID and quantity. 
 *  				If there are enough products of this type in stock, the purchase can be completed successfully 
 *  				(subtract the purchased quantity).
 *  			2. Check if the product is in stock. Accepts Product ID.
 *  			3. Display product details. 
 *  			 	Accepts Product ID. This should display, -- product name, 
 *  														 -- type, 
 *  														 -- price 
 *        													 -- and other parameters such as -- material, 
 *        															               			 -- memory size 
 *        																					 -- and display size where applicable.
 *  			4. Calculate Tax Return. Accepts Product ID and quantity. If the product is taxable display how much tax will be paid. 
 *  			5. Exit.
 *  
 */
package week_6_file_handling;