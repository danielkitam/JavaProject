package addition;
import java.util.*;

public class Resistance {

	public static void main(String[] args) {
		final double copperResis = 1.68 * 10E-8;
		final double aluminiumResis = 2.83 * 10E-8;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter wire gauge: ");
		int AWG = sc.nextInt();
		System.out.print("Enter wire length (in m.): ");
		double length = sc.nextDouble();
		
		double diameter = diameter(AWG); 
		System.out.println("Diameter of the wire is: " + diameter);
		
		double copperResistance = findRes(copperResis, length, diameter);
		double aluminiumResistance = findRes(aluminiumResis, length, diameter);
		
		System.out.println("Resistance in copper is: " + copperResistance + " ohms");
		System.out.println("Resistance in aliminium is: " + aluminiumResistance + " ohms");
		
		sc.close();

	}
	public static double diameter(int n) {
		double d = 0.127 * Math.pow(92, (36-n)/39) ;
		return d;
	}
	
	public static double findRes(double resistivity, double lengthVal, double d) {
		double resistance = (4*resistivity*lengthVal)/(Math.PI*Math.pow(d, 2));
		return resistance;
	}

}
