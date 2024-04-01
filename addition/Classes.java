package addition;

import java.util.Random;
import java.util.Scanner;

class myClass{
	private int i;
	private String name;
	
	public myClass() {
		this.i = 5;
	}
	public myClass(String namePar) {
		this.name = namePar;
	}
	public int getI() {
		return this.i;
	}
	public String getName(){
		return this.name;
	}
	
	public double findLarg(double num1, double num2, double num3) {
		double largest = num1;
		if (num2>num1) {
			if(num3>num2) largest = num3;
			else largest = num2;
		}
		
		else if(num3>num1) {
			if(num2>num3) largest = num2;
			else largest = num3;
		}
				
		return largest;
	}
	
	/**  This is a guessing Game full code - method of our class */
	
	public void guessingGame() {
		Scanner sc = new Scanner(System.in);
		Scanner strScanner = new Scanner(System.in);
		Random  random = new Random();
		int countTry= 0;
		int maxTries = 10;
		
		System.out.println("------WELCOME TO THE GUESSING GAME-------");
		System.out.println("--YOU GOT 10 TRIES IN TOTAL--");
		System.out.println();
		
		System.out.print("Enter the maximum value in the guessing game(less or equal to 100): ");
		int maxNum = sc.nextInt();
		while(maxNum > 100) {
			System.out.print("Enter the maximum value in the guessing game(less or equal to 100): ");
			maxNum = sc.nextInt();
			System.out.println();
		}
		
		int guessNum = random.nextInt(maxNum) + 1;
		
		while(true) {
			System.out.print("Enter your guessing number (0-" + maxNum + "): ");
			int userGuess = sc.nextInt();
			countTry++;
			maxTries--;
			
			if(userGuess > guessNum) {
				System.out.println("You are above the number! - " + maxTries + " Tries left \n");
			}
			else if(userGuess < guessNum) {
				System.out.println("You are below the number! - " + maxTries + " Tries left \n");
			}
			else {
				System.out.println("CONGRATULATIONS, you got it!!!");
				System.out.println("You had " + countTry + " tries.");
				System.out.println("----------------------------------");
				
				System.out.print("You wanna play again? (y/n): ");
				char end = strScanner.nextLine().charAt(0);
				
				if (end == 'y' || end == 'Y') {
					System.out.print("Enter the maximum value in the guessing game(less or equal to 100): ");
					maxNum = sc.nextInt();
					while(maxNum > 100) {
						System.out.print("Enter the maximum value in the guessing game(less or equal to 100): ");
						maxNum = sc.nextInt();
						System.out.println();
					}
					guessNum = random.nextInt(maxNum) + 1;
					maxTries = 10;
					countTry = 0;
					//continue;
				}
				else break;
			}
			
			if(maxTries == 0) {
				System.out.println("You have " + maxTries + " Tries");
				System.out.println("YOU LOST THE GAME  -  The number was " + guessNum);
				System.out.print("You wanna try again? (y/n): ");
				char end = strScanner.nextLine().charAt(0);
				
				if (end == 'y' || end == 'Y') {
					System.out.print("Enter the maximum value in the guessing game(less or equal to 100): ");
					maxNum = sc.nextInt();
					while(maxNum > 100) {
						System.out.print("Enter the maximum value in the guessing game(less or equal to 100): ");
						maxNum = sc.nextInt();
						System.out.println();
					}
					guessNum = random.nextInt(maxNum) + 1;
					maxTries = 10;
					countTry = 0;
					//continue;
				}
				else break;
			}
		}
		
		
	}
}

public class Classes {

	public static void main(String[] args) {
		myClass obj = new myClass();
		myClass obj2 = new myClass("Daniel");
		
//		System.out.println(obj.getI() + " " + obj2.getI());
//		System.out.println(obj.getName() + " " + obj2.getName());
//		
//		double largest  = obj.findLarg(45.9, 4500.9, 4500.9);
//		
//		System.out.println(largest);
		
		obj2.guessingGame();

	}

}
