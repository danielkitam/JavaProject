package addition;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assess {
	
	static boolean passwordCheck(String password) {
		boolean bool = false;
		if(password.length()<12) return false;
		
		int lowerCase = 0;
		int upperCase = 0;
		int digit = 0;
		int special= 0;
		
		for(char c: password.toCharArray()) {
			if(Character.isLowerCase(c)) lowerCase++;
			else if(Character.isUpperCase(c)) upperCase++;
			else if(Character.isDigit(c)) digit++;
			else if(isSpecialChar(c)) special++;
		}
		
		if(lowerCase >=3 && upperCase >=1 && digit >=1 && special >=2) bool=true;
		
		return bool;
	}
	public static boolean isSpecialChar(char c) {
		Pattern pattern = Pattern.compile("[%'\"*&$!@#^+]");
		Matcher matcher = pattern.matcher(String.valueOf(c));
		
		return matcher.matches();
	}
	
	//power method
	
	public static double power(double base, double exponent) {
		double result = Math.pow(base, exponent);
		return result;
	}
	
	//compoundInt method
	
	public static double compoundInterest(double initialValue, double i, double n) {
		double futureValue = initialValue*Math.pow((1+i), n);
		return futureValue;
	}
	
	//fix
	
	public static float fix(float a) {
		return Math.abs(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("Insert your password: ");
		String password = scanner.nextLine();
		if(passwordCheck(password)) {
			System.out.println("Your password is Strong");
		}
		else {
			System.out.println("Your password is very weak");
		}
		System.out.println("------------------------------");
		System.out.print("Insert your base: ");
		double base = scanner.nextDouble();
		System.out.print("Insert your exponent: ");
		double exponent = scanner.nextDouble();
		
		System.out.println(power(base, exponent));
		System.out.println("------------------------------");
		
		System.out.print("Insert your initial: ");
		double initial = scanner.nextDouble();
		System.out.print("Insert your interest rate: ");
		double inter = scanner.nextDouble();
		System.out.print("Insert your time period: ");
		double period = scanner.nextDouble();
		
		System.out.println("Your future value is: " + compoundInterest(initial, inter, period));
	}

}
