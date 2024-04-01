package addition;
import java.util.*;
public class Add {

	public static void add() {
		Scanner sc = new Scanner(System.in);
		int num1, num2, sum;
		
		System.out.println("Tap your first Num: ");
		num1 = sc.nextInt();
		
		System.out.println("Tap your second Num: ");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		
		sc.close();
		
		System.out.print("Your result is:\n\t" + num1 + " + " + num2 + " = "
				+ sum);

	}

}