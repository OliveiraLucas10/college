package week_6_file_handling;

import java.util.ArrayList;
import java.util.Scanner;

// Creating Driver class to manage and call all the classes
public class Driver
{

	// Creating the ArrayList in order to follow the annunciate
	static ArrayList<Product> products = new ArrayList<>();

	// Creating a method add in order to populate the array list from the main method
	public static int add()
	{
		Chairs chairs1 = new Chairs("chair 1", "Amazing Chair ", 30.00, 10);
		Chairs chairs2 = new Chairs("chair 2", "Surreal Chair ", 45.50, 20);
		Chairs chairs3 = new Chairs("chair 3", "Transparent Chair ", 70.90, 30);
		products.add(chairs1);
		products.add(chairs2);
		products.add(chairs3);

		Tables table1 = new Tables("table 1", "Amazing Table ", 80.10, 20);
		Tables table2 = new Tables("table 2", "Surreal Table ", 100.99, 15);
		Tables table3 = new Tables("table 3", "Transparent Table ", 150.70, 30);

		products.add(table1);
		products.add(table2);
		products.add(table3);

		Dressers dresser1 = new Dressers("dresser 1", "Amazing Dresser ", 350.00, 10, 3, 2, 4);
		Dressers dresser2 = new Dressers("dresser 2", "Surreal Dresser ", 700.00, 10, 3, 2, 6);
		Dressers dresser3 = new Dressers("dresser 3", "Transparent Dresser ", 1000.00, 10, 3, 3, 6);
		products.add(dresser1);
		products.add(dresser2);
		products.add(dresser3);

		Spoons spoon1 = new Spoons("spoon 1", "Amazing Spoon ", 5.18, 10, "Metal");
		Spoons spoon2 = new Spoons("spoon 2", "Surreal Spoon ", 12.30, 10, "Plastic");
		Spoons spoon3 = new Spoons("spoon 3", "Transparent Spoon ", 18.60, 10, "Silver");
		products.add(spoon1);
		products.add(spoon2);
		products.add(spoon3);

		Forks fork1 = new Forks("fork 1", "Amazing Fork ", 6.50, 10, "Metal");
		Forks fork2 = new Forks("fork 2", "Surreal Fork ", 8.80, 10, "Plastic");
		Forks fork3 = new Forks("fork 3", "Transparent Fork ", 10.70, 10, "Silver");
		products.add(fork1);
		products.add(fork2);
		products.add(fork3);

		Knives knife1 = new Knives("knife 1", "Amazing Knive ", 4.20, 10, "Metal");
		Knives knife2 = new Knives("knife 2", "Surreal Knive ", 6.30, 10, "Plastic");
		Knives knife3 = new Knives("knife 3", "Transparent Knives ", 8.10, 10, "Silver");
		products.add(knife1);
		products.add(knife2);
		products.add(knife3);
		products.add(knife3);

		Plates plate1 = new Plates("plate 1", "Amazing Plate ", 12.10, 10, "porcelana");
		Plates plate2 = new Plates("plate 2", "Surreal Plate ", 15.10, 10, "porcelana");
		Plates plate3 = new Plates("plate 3", "Transparent Plate ", 20.10, 10, "glass");
		products.add(plate1);
		products.add(plate2);
		products.add(plate3);

		Keyboards keyboard1 = new Keyboards("keyboard 1", "Amazing Keyboard ", 29.99, 10);
		Keyboards keyboard2 = new Keyboards("keyboard 2", "Surreal Keyboard ", 49.99, 10);
		Keyboards keyboard3 = new Keyboards("keyboard 3", "Transparent Keyboard ", 99.99, 10);
		products.add(keyboard1);
		products.add(keyboard2);
		products.add(keyboard3);

		MobilePhones mobilePhone1 = new MobilePhones("mobile Phone 1", "Nokia x ", 400.10, 10);
		MobilePhones mobilePhone2 = new MobilePhones("mobile Phone 2", "Sansung x ", 600.10, 10);
		MobilePhones mobilePhone3 = new MobilePhones("mobile Phone 3", "Apple x ", 800.10, 10);
		products.add(mobilePhone1);
		products.add(mobilePhone2);
		products.add(mobilePhone3);

		MP3Players mp3Player1 = new MP3Players("mp3 Player 1", "Amazing MP3 Player ", 10.10, 10, 16);
		MP3Players mp3Player2 = new MP3Players("mp3 Player 2", "Surreal MP3 Player ", 50.10, 10, 32);
		MP3Players mp3Player3 = new MP3Players("mp3 Player 3", "Transparent MP3 Player ", 100.10, 10, 64);
		products.add(mp3Player1);
		products.add(mp3Player2);
		products.add(mp3Player3);

		TVSets tv1 = new TVSets("tv 1", "Sansung TV", 300.10, 25, 42.2);
		TVSets tv2 = new TVSets("tv 2", "Chingwang TV", 500.10, 15, 42.2);
		TVSets tv3 = new TVSets("tv 3", "Sony TV", 800.10, 15, 42.2);
		products.add(tv1);
		products.add(tv2);
		products.add(tv3);
		return 0;
	}// closing the add method

	/** Created main method */
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		// Call the method to populate the array list
		Driver.add();

		// Instantiating the objects scanners to
		Scanner buyer = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		// Creating variables to be used
		String toBuy = null;
		System.out.println(" ");
		System.out.println(" ================================================================================");
		System.out.println("                                                                                 ");
		System.out.println("                  WEEK 5 - ABSTRACT CLASSES & INTERFACES                         ");
		System.out.println("                                                                                 ");
		System.out.println(" ================================================================================");
		System.out.println("                                                                                 ");

		// Do looping to creating the menu
		do
		{
			System.out.println("                                                                                  ");
			System.out.println("                                      MENU                                        ");
			System.out.println("                                                                                  ");
			System.out.println(" (1) Buy a Product                                                                ");
			System.out.println(" (2) Check stock                                                                  ");
			System.out.println(" (3) Display product details                                                      ");
			System.out.println(" (4) Calculate Tax Return                                                         ");
			System.out.println(" (5) Exit                                                                         ");
			System.out.println("                                                                                  ");
			System.out.print(" Chose an option -> ");

			// Switch statement to give options of the menu
			switch (input.nextInt())
			{
				// (1) Buy a Product
				case 1:
					int quantity = 0;
					int tempQuant = 0;
					System.out.println("                                                                                     ");
					System.out.println(" =================================================================================== ");
					System.out.println("                         List of products available in stoque.                     | ");
					System.out.println(" =================================================================================== ");
					System.out.println("                                                                                   | ");
					System.out.println("   |FURNITURE		   |KITCHENWARE           |ELETRONIC DEVICES               | ");
					System.out.println("   |-- chair 1, 2 and 3.   |-- spoon 1, 2 and 3.  |-- keyboard 1, 2 and 3.         | ");
					System.out.println("   |-- table 1, 2 and 3.   |-- fork 1, 2 and 3.   |-- mobile Phone 1, 2 and 3.     | ");
					System.out.println("   |-- dresser 1, 2 and 3. |-- knife 1, 2 and 3.  |-- mp3 player 1, 2 and 3.       | ");
					System.out.println("   |-- plates 1, 2 and 3.  |-- tv 1, 2 and 3.                                      | ");
					System.out.println("                                                                                   | ");
					System.out.println("                                                                                   | ");
					System.out.println(" =================================================================================== ");
					System.out.print(" Which product do you choose to buy ? ------>> ");
					toBuy = buyer.nextLine();
					System.out.println("                                                                                     ");

					// variable to help in the for loop to identify if the product was printed out already
					String last = null;

					System.out.println("                                                                                     ");
					System.out.println("                                                                                     ");
					System.out.println(
									" ================================================================================================================");
					System.out.println(
									" ProductId                        Product Name                           Price                  Tax (for 1 pç)   ");
					System.out.println(
									" ================================================================================================================");
					System.out.println(
									"                                                                                                                  ");

					// for loop to print out the name of the productId(s) similar(s). In case of the user do not know and insert inexactly name of the productId
					for (int i = 0; i < products.size(); i++)
					{
						// if statement to verify if the product is exactly the name is in the stock
						if (products.get(i).getProductId().equals(toBuy))
						{
							// Give the value of the quantity of this specific productId
							quantity = products.get(i).getQuantity();
							System.out.print(" " + (products.get(i).getProductId()) + "                         "
											+ products.get(i).getName() + "                          " +
											products.get(i).getPrice() + "                     ");
							System.out.printf("%.2f", (products.get(i).taxReturn(products.get(i).getProductId(), 1)));
							System.out.println("");
							// If the productId is not exactly the same of the productId, but similar
						}
						else if (products.get(i).getProductId().contains(toBuy))
						{
							// To avoid printing many times the same name of productId
							if (products.get(i).getProductId().equals(last))
							{
							}
							else
							{
								System.out.print(" " + (products.get(i).getProductId()) + "                         "
												+ products.get(i).getName() + "                          " +
												products.get(i).getPrice() + "                     ");
								System.out.printf("%.2f", (products.get(i).taxReturn(products.get(i).getProductId(), 1)));
								System.out.println("");
								last = products.get(i).getProductId();
							} // if statement
						} // if statement
					} // for loop
					System.out.println();
					System.out.println(
									" ================================================================================================================");
					System.out.println();

					// if statement to verify the product is not in the stoque
					if (quantity > 0)
					{
						// print out message to inform the user about the quantity of the product to buy
						System.out.println(" We have " + quantity + " of the product " + toBuy + " in stock.                         ");
						System.out.println(" =================================================================================== ");
						System.out.print(" How many of " + toBuy + " ?" + " Quantity to buy ------>> ");
						// Variable to absorb the interaction of the quantity to buy
						tempQuant = input.nextInt();
						// if statement in order to verify if the quantiy of the user want to buy is higger or lower of the product
						// and print out a message necessary according with the situation
						if (tempQuant <= quantity)
						{
							for (int i = 0; i < products.size(); i++)
							{
								if (products.get(i).getProductId().equals(toBuy))
								{
									products.get(i).buyProducts(toBuy, tempQuant);
								} // close if statement
							} // close for loop
						}
						else
						{
							System.out.println(" Sorry.                                                                          ");
							System.out.println("                                                                                 ");
							System.out.println(" We have " + quantity + " of the product " + toBuy + " in stock.                 ");
							System.out.println(" Please, choose another specific productId.                                      ");
						} // Closing if statement
					}
					else
					{
						System.out.println(" Sorry.                                                                              ");
						System.out.println("                                                                                     ");
						System.out.println(" To buy a product, you have to specify only one ProductId.                           ");
						System.out.println(" Please, choose one of the productsId described above.                               ");
					} // if statement
					System.out.println(" ");// visual motives

					break;

				// (2) Check stoque
				case 2:
					// creating local variable
					int temp2 = 0;
					System.out.println("                                                                                     ");
					// interact with the user printing out a message to absorb the product of interest
					System.out.print(" Which product do you want to check ?    ");
					toBuy = buyer.nextLine();
					// create the visual of the display check stoque
					System.out.println("                                                                                     ");
					System.out.println("                                                                                     ");
					System.out.println(
									" ================================================================================================================");
					System.out.println(
									"                                         CHECK STOQUE                                                            ");
					System.out.println(
									" ================================================================================================================");
					System.out.println("                                                                                     ");

					// Create the for loop to verify all the products in the arrayLIst
					for (int i = 0; i < products.size(); i++)
					{
						if (products.get(i).getProductId().equals(toBuy))
						{

							// using the check stoque method
							products.get(i).checkStoque(toBuy);

							temp2 = 1;
						}
						else if (products.get(i).getProductId().contains(toBuy) && temp2 == 0)
						{

							products.get(i).checkStoque(toBuy);
						} // close if statement
					} // close for loop
					System.out.println();
					System.out.println(
									" ================================================================================================================");
					System.out.println();

					break;

				// Display product details
				case 3:
					// creating local variables
					int eq = 0;
					int ct = 0;
					int dif = 0;
					// interacting with the user to absorb which product print out details of
					System.out.println("           ");
					System.out.print(" Product details - from which product ?    ");
					toBuy = buyer.nextLine();
					// verify in all the array and use the product details method to print out the message,
					for (int i = 0; i < products.size(); i++)
					{
						if (products.get(i).getProductId().equals(toBuy))
						{

							// using the method product details
							products.get(i).productDetails(toBuy);
							eq += 1;
						}
						else if (Driver.products.get(i).getProductId().contains(toBuy) && eq == 0)
						{
							// using the method product details
							products.get(i).productDetails(toBuy);
							ct += 1;
						} // closing if statement
					} // closign for loop
					for (int i = 0; i < Driver.products.size(); i++)
					{
						if (eq == 0 && ct == 0 && dif == 0)
						{
							// using the method product details
							products.get(i).productDetails(toBuy);
						} // if statement
					} // for loop

					break;

				// (4) Calculate Tax Return
				case 4:
					// Creating local variables
					int eq4 = 0;
					int ct4 = 0;
					int dif4 = 0;
					String product = null;
					int quant = 0;
					// print out message to interact with the user to absorb product and quantity to be calculated
					System.out.println(" ");
					System.out.print(" Product to be calculate --> ");
					product = buyer.nextLine(); // absorb product
					System.out.println(" ");
					System.out.print(" What is the quantity of the product " + product + " ? --> ");
					quant = input.nextInt(); // absorb quantity
					// Print out display to present data
					System.out.println(" ");
					System.out.println(
									" ================================================================================================================");
					System.out.println(
									" ProductId                        Quantity                           Tax                     Total (price + tax) ");
					System.out.println(
									" ================================================================================================================");
					System.out.println(" ");

					// Create a for loop in order to identify if the product informed by the user is an specific ProductId or part of some ProductIds
					for (int m = 0; m < products.size(); m++)
					{
						// Create the first if statement to identify and print out tax info of the productId which is equal.
						if (products.get(m).getProductId().equals(product))
						{
							System.out.println(" " + products.get(m).getProductId() + "                        " + quant
											+ "                               " +
											products.get(m).taxReturn(products.get(m).getProductId(), quant) + "                       " +
											((products.get(m).taxReturn(products.get(m).getProductId(), quant) + products.get(m).getPrice())
															* quant)
											+
											" (" + products.get(m).getPrice() + " + "
											+ products.get(m).taxReturn(products.get(m).getProductId(), quant) + ")");
							eq4 += 1;

							// Create the second if statement to identify and print out tax info of the productId which contain part of the productId name, containing a similar name.
						}
						else if (products.get(m).getProductId().contains(product) && eq4 == 0)
						{
							System.out.println(" " + products.get(m).getProductId() + "                        " + quant
											+ "                               " +
											products.get(m).taxReturn(products.get(m).getProductId(), quant) + "                       " +
											((products.get(m).taxReturn(products.get(m).getProductId(), quant) + products.get(m).getPrice())
															* quant)
											+
											" (" + products.get(m).getPrice() + " + "
											+ products.get(m).taxReturn(products.get(m).getProductId(), quant) + ")");
							ct4 += 1;
						} // close if statement
					} // close for loop

					// Create a for loop to print out a message in case of the product search by the user is not in our system.
					for (int i = 0; i < products.size(); i++)
					{
						if (eq4 == 0 && ct4 == 0 && dif4 == 0)
						{
							System.out.println(" The product " + product
											+ " was not found in our Stoque to be calculate. Try changing the productId name. ");
							dif4 += 1;
						} // close if statement
					} // close for loop

					System.out.println();
					System.out.println(
									" ================================================================================================================");
					System.out.println();

					break;

				// (5) Exit
				case 5:
					System.out.println();
					System.out.println("                                    The End   ");
					System.exit(0);
					break;

				default:
					System.out.println();
					System.out.println("  Wrong insertion  ");
					System.out.println();
			}// switch statement

		}
		while (products.size() != 0);
		buyer.close();
		input.close();
	}// main method

}// closing driver