/* This class is client code that uses the Calculate library 
 * to perform various mathematical tasks.
 * @author Ethan Zhou
 * @version September 6, 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(988));
		System.out.println(Calculate.cube(988));
		System.out.println(Calculate.average(2,4));
		System.out.println(Calculate.average(4,6,8));
		System.out.println(Calculate.toDegrees(3.14));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(2,4,6));
		System.out.println(Calculate.toImproperFrac(2,3,4));
		System.out.println(Calculate.toMixedNum(7,3));
		System.out.println(Calculate.foil(2, 3, 6, -7, "x"));
		System.out.println(Calculate.isDivisibleBy(5,3));
		System.out.println(Calculate.absValue(2));
		System.out.println(Calculate.max(4, 6));
		System.out.println(Calculate.max(4, 6, 8));
		System.out.println(Calculate.min(4, 6));
		System.out.println(Calculate.round2(5.5866));
		System.out.println(Calculate.exponent(5,3));
		System.out.println(Calculate.factorial(0));
		System.out.println(Calculate.isPrime(41));
		System.out.println(Calculate.gcf(42, 27));
		System.out.println(Calculate.sqrt(25));
	}

}
