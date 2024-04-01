package addition;
import java.util.*;

public class Lab9 {
	
	public static double findSmallestNum(double num1, double num2, double num3) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print
//		num1 = sc.nextDouble();
		
		double smallest = num1;
		
		if(num2<smallest) {
			smallest = num2;
		}
		else if(num3<smallest) {
			smallest = num3;
		}
		
		return smallest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------------TASK #1----------------");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Input the first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Input the second number: ");
		double num2 = sc.nextDouble();
		System.out.print("Input the third number: ");
		double num3 = sc.nextDouble();
		System.out.println();
		
		double smallest = findSmallestNum(num1, num2, num3);
		
		System.out.println("The smallest value is: " + smallest);
		
		System.out.println();
		System.out.println("----------------TASK #2----------------");
		System.out.println();
		System.out.print("Input the string: ");
		String input = sc1.nextLine();
		
		int wordsNum = wordsNum(input);
		System.out.println(wordsNum);
		
		System.out.println();
		System.out.println("----------------TASK #3----------------");
		System.out.println();
		
		System.out.print("input a number: ");
		int num = sc.nextInt();
		int findEven = num(num);
		System.out.println(findEven);
		
		System.out.println();
		System.out.println("----------------TASK #4----------------");
		System.out.println();
		
		System.out.print("input a number: ");
		int nume = sc.nextInt();
		int romm = romm(nume);
	}
	
	public static int wordsNum(String input) {
		if(input == null) {
			return 0 ;
		} 
		String[] words = input.split("\\s");
		return words.length;
	}
	
	static int num(int integer) {
		if(integer%2==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		return integer;
	}
	
	static int romm(int n) {
		for(int i = n-1; i>=1;i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j <=i-1; j++) {
				System.out.print("i-j");
			}
			for(int j=1; j<i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		return n;
	}

}
