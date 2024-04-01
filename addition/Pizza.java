package addition;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Pizza {

	public static void main(String[] args) {
		String toppings = "Cheese ";
		String crust = "Hand-tossed";
		int numberOfToppings = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		boolean discount = false;
		double amount = 12.99;
		final double TAX_RATE = .08;
		System.out.println("Welcome to Mike and Diane's Pizza");
		System.out.println("-------------------------------------");
		System.out.print("Please insert your Name: ");
		Scanner sc1 = new Scanner(System.in);
		String firstName = sc1.nextLine();
		//compare the first name of user to the owners'first name
		if(firstName.equalsIgnoreCase("Mike") || firstName.equalsIgnoreCase("Diane")) {
			discount = true;
		} 
		System.out.println("Pizza Size (inches) Cost");
		System.out.println(" 10 $10.99 ");
		System.out.println(" 12 $12.99");
		System.out.println(" 14 $14.99");
		System.out.println(" 16 $16.99");
		System.out.println("What size pizza would you like?");
		System.out.print(
		"10, 12, 14, or 16 (enter the number only): ");
		String sizeOfPizzaStr = sc1.nextLine();
		do{
			try {
				int sizeOfPizza = Integer.parseInt(sizeOfPizzaStr);
				
				if(sizeOfPizza == 10) {
					amount = 10.99;
					System.out.println("You selected a 10 inches pizza which costs $" + amount + "\n");
				}
				else if(sizeOfPizza == 12) {
					System.out.println("You selected a 12 inches pizza which costs $" + amount + "\n");
				}
				else if(sizeOfPizza == 14) {
					amount = 14.99;
					System.out.println("You selected a 14 inches pizza which costs $" + amount + "\n");
				}
				else if(sizeOfPizza == 16) {
					amount = 16.99;
					System.out.println("You selected a 16 inches pizza which costs $" + amount + "\n");
				} 
				else {
					sizeOfPizza = 12;
					System.out.println("Invalid size\n12 inches is selected as default and costs $"
							+ amount + "\n");
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Enter a valid input");
			}
		
		//set the amount for each option
		
		//Selection of crust
		System.out.println("What type of crust do you want? ");
		System.out.print("(H)Hand-tossed, (T) Thin-crust, or " +
		"(D) Deep-dish (enter H, T, or D): ");
		Scanner sc2 = new Scanner(System.in);
		String input = sc2.nextLine();
		char crustType = input.charAt(0);

		switch(crustType) {
			case 'h','H':
				System.out.println("You selected a Hand-tossed\n");
				amount += 0;
				break;
			case 't','T': 
				System.out.println("You selected a Thin-crust\n");
				amount += 0;
				crust = "Thin-crust";
				break;
			case 'd','D':
				System.out.println("You selected a Deep-dish crust\n");
				amount += 0;
				crust = "Deep-dish";
				break;
			default:
				crustType = 'H';
				System.out.println("Invalid input\nHand-tossed(H) selected by default\n");
				
		}
		
		System.out.println("All pizzas come with cheese.");
		System.out.println("Additional toppings are $1.25 each,"
		+ " choose from");
		System.out.println("Pepperoni, Sausage, Onion, Mushroom\n");
		
		System.out.print("Do you want Pepperoni? (Y/N): ");
		input = sc2.nextLine();
		char choice = input.charAt(0);
		if (choice == 'Y' || choice == 'y')
		{
		numberOfToppings += 1;
		toppings = toppings + "Pepperoni ";
		}
		
		System.out.print("Do you want Sausage? (Y/N): ");
		input = sc2.nextLine();
	    choice = input.charAt(0);
		if (choice == 'Y' || choice == 'y')
		{
		numberOfToppings += 1;
		toppings = toppings + "Sausage ";
		}
		
		System.out.print("Do you want Onion? (Y/N): ");
		input = sc2.nextLine();
		choice = input.charAt(0);
		if (choice == 'Y' || choice == 'y')
		{
		numberOfToppings += 1;
		toppings = toppings + "Onion ";
		}
		
		System.out.print("Do you want Mushroom? (Y/N): ");
		input = sc2.nextLine();
		choice = input.charAt(0);
		if (choice == 'Y' || choice == 'y')
		{
		numberOfToppings += 1;
		toppings = toppings + "Mushroom ";
		}
		
		amount = amount + (1.25*numberOfToppings);
		
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.println("Your order is as follows: ");
		System.out.println(sizeOfPizzaStr + " inch pizza");
		System.out.println(crust + " crust");
		System.out.println(toppings);
		System.out.println();
		
		if (discount == true) {
			System.out.println("Congratulation " + firstName + "! You are eligible for the discount of $2.00\n");
			amount -= 2.00;
		}
		
		System.out.println("The cost of your order is: $" + df.format(amount));
		//calculate and display tax and total cost
		double tax = amount * TAX_RATE;
		System.out.println("The tax is: $" + df.format(tax));
		System.out.println("The total due is: $" + df.format(tax+amount));
		System.out.println(
		"Your order will be ready for pickup in 30 minutes.");
		
		}while(sizeOfPizzaStr != "10" || sizeOfPizzaStr != "12" || sizeOfPizzaStr != "14" ||
				sizeOfPizzaStr != "16" );
		
	}

}
