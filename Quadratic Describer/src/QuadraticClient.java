import java.util.Scanner; //scanner
public class QuadraticClient {

	public static void main(String[] args) {
	
System.out.println("Welcome to the Quadratic Describer");
System.out.println("Provide values for coefficients a, b, and c");
		Scanner console = new Scanner(System.in);
		System.out.print("a: ");
		double a = console.nextDouble();
		System.out.print("b: ");
		double b = console.nextDouble();
		System.out.print("c: ");
		double c = console.nextDouble();
		System.out.println(Quadratic.quadrDescriber(a, b, c));
		System.out.println("Do you want to keep going? (Type \"quit\" to end)");
		String nextStep = console.next();
		if (nextStep.equals("quit")) {
		
	}

}


