/* This class contains methods that perform various math operations
 * @author Ethan Zhou
 * @version September 6, 2018
 */
public class Calculate {
	// Returns the square of the input 
	public static int square(int number) {
	return number*number;
	}
	// Returns the cube of the input
	public static int cube(int number) {
		return number*number*number;
	}
	//Returns the average of two numbers
	public static double average(double value1, double value2) {
		return (value1 + value2)/2;
	}
	//Returns the average of three numbers
	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3)/3;
	}
	//Converts radians to degrees
	public static double toDegrees(double radian) {
		return radian * (180/3.14159);
	}
	//Converts degrees to radians
	public static double toRadians(double degrees) {
		return degrees * (3.14159/180);
	}
	//Evaluates the discriminant b^2-4ac
	public static double discriminant(double a, double b, double c) {
		return (b*b) - (4*a*c);
	}
	//Converts mixed number to improper fraction
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		return ((whole*denominator) + numerator) + "/" + denominator;
	}
	//Converts improper fraction to a mixed number
	public static String toMixedNum(int numerator, int denominator) {
		return numerator / denominator + " " + numerator % denominator + "/" + denominator;
	}
	//Multiplies two expressions together using FOIL
	public static String foil(int num1, int num2, int num3, int num4, String x) {
		return num1 * num3 + "x^2 " + "+ " + (num1 * num4 + num2 * num3)+ "x " + "+ " + (num2 * num4);
	}
	//Determines if a number is divisible
	public static boolean isDivisibleBy(int num1, int num2) {
		
		if (num1 % num2 == 0) {
		return true;
	}
		else {
			return false;
		}
	}
	//Prints the absolute value of a number
	public static double absValue(double num1) {
		if (num1 < 0) {
			return num1*-1;
		}
		else {
			return num1;
		}
		
}
	//Returns the bigger number of two numbers
	public static double max(double num1, double num2) {
	if (num1 > num2) {
		return num1;
	}
	else {
		return num2;
	}
	}
	//Returns the biggest number of three numbers
	public static double max(double num1, double num2, double num3) {
		double firstTwo;
		if (num1 > num2) {
			firstTwo = num1;
		}
		else { 
			firstTwo = num2;
		}
		if (firstTwo > num3) {
			return firstTwo;
		}
		else {
			return num3;
		
		}
	}
	//Returns the smaller number of two numbers
	public static int min(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		}else {
			return num2;
		}
	}
	//Rounds a number to two decimal places
	public static double round2(double num1) {
		double num2= (num1 + .005)*100;
		double num3 = (int)num2;	
			return num3/100;
			
	}
}
