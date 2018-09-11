/* This class contains methods that perform various math operations
 * @author Ethan Zhou
 * @version September 6, 2018
 */
public class Calculate {
	// Returns the square of the input 
	public static int square(int number) {
	return number*number;
	}
	public static int cube(int number) {
		return number*number*number;
	}
	public static double average(double value1, double value2) {
		return (value1 + value2)/2;
	}
	public static double average(double num1, double num2, double num3) {
		return (num1 + num2 + num3)/3;
	}
	public static double toDegrees(double radian) {
		return radian * (180/3.14159);
	}
	public static double toRadians(double degrees) {
		return degrees * (3.14159/180);
	}
	
	public static double discriminant(double a, double b, double c) {
		return (b*b) - (4*a*c);
	}
}
