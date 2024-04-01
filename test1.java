import addition.Add;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, sum = 0, input;
		while(i<=5) {
			System.out.print("Enter an integer: ");
			input = sc.nextInt();
			sum += input;
			i++;
		}
		double avrg = (sum/5);
		System.out.println("The Average is:" + avrg);

	}

}
