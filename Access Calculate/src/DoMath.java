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
	}

}
