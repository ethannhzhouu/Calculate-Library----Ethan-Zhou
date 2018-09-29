/* This class contains methods that perform various math operations.
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
		if (denominator < 0) {
			throw new IllegalArgumentException ("Denominator cannot be 0, bc Cannot divide by 0");
		}
		return ((whole*denominator) + numerator) + "/" + denominator;
		
	}
	//Converts improper fraction to a mixed number
	public static String toMixedNum(int numerator, int denominator) {
		if (denominator < 0) {
			throw new IllegalArgumentException ("Denominator cannot be 0, bc cannot divide by 0");
		}
		return numerator / denominator + "_" + numerator % denominator + "/" + denominator;
	}
	//Multiplies two expressions together using FOIL
	public static String foil(int num1, int num2, int num3, int num4, String letter) {
		return num1 * num3 + letter + "^2 " + "+ " + (num1 * num4 + num2 * num3)+ letter + " " + "+ " + (num2 * num4);
	}
	//Determines if a number is divisible
	public static boolean isDivisibleBy(int num1, int num2) {
		if (num1 == 0 || num2 == 0) {
			throw new IllegalArgumentException ("Cannot determine if number is divisible by 0");
		}
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
		double num3 = 1;
		if (num1 > 0) { 
		double num2= (num1 + .005)*100;
		num3 = (int)num2;	
		}
		if (num1 < 0) {
			double num2= (num1 - .005)*100;
			num3 = (int)num2;	
			}
		if (num1 == 0) {
			return 0.00;	
			}
			return num3/100;
			
	}
	//returns value with an exponent
			public static double exponent (double base, int exponent){
				double answer = 1;
				if (exponent < 0) {
					throw new IllegalArgumentException ("Algorithm won't work if exponent is negative");
				}
				for (int i = 0; i < exponent; i++){
					answer = answer * base;
				}
				return answer;
				}
			
	// Returns the factorial of a specific integer
			public static int factorial(int num) {
				int answer = 1;
				if (num < 0) {
					throw new IllegalArgumentException ("Can't do factorial of negative number");
				}
				//factorial of zero is one.
				if(num == 0) { 
					return answer; 
				}
				else {
					// Multiplying smaller to bigger numbers increment by one and multiply until reaching the value of num
					for (int i = 1; i <= num; i++) {
						answer = answer * i;
					}
					return answer; 
				}	
				}
	// returns whether or not a number is prime
			public static boolean isPrime (int num) {
				boolean divisible;
				boolean prime = true;
					if (num > 1) {
						for (int i = 2; i < num; i++) {
								divisible = Calculate.isDivisibleBy(num, i);
								if (divisible == true) { 
									prime = false;
									}	
							}
						}
					if (num < 0) {
						throw new IllegalArgumentException ("Can't determine if negatives are prime");
					}
							return prime;
			}
			// returns greatest common factor of two numbers
			public static int gcf (int num1, int num2) {
			int ans = 1; //placeholder for answer
			if (num1 < 0) {
				throw new IllegalArgumentException ("Can't determine gcf if num is negative, returns the wrong greatest");
			}
			if (num2 < 0) {
				throw new IllegalArgumentException ("Can't determine gcf is num is negative, retuurns the wrong greatest");
			}
					for (int i = Calculate.min(num1, num2); i > 0; i--) { // use the minimum to find gcf, not max
						if (Calculate.max(num1, num2) % i == 0 && Calculate.min(num1,num2) % i == 0) { 
							//test numbers using decrementing until remainder is 0 for the higher and lower number
							if (i >= ans) {
								ans = i;
							}
						}
					}
					return ans;
					}
//returns square root of a specific number
	public static double sqrt(double num){
			double guess;
			double root;
				if (num == 0){
					root = 0;
					//square root of 0 is 0
				}
				if (num < 0){
					throw new IllegalArgumentException ("Square root of negative number is an imaginary number");
				}
				else if (num > 0){
					root = num/2;
					do {
						guess = root;
						root = ((num/guess) + guess)/2; // Newton's method
					}
					while ((guess - root) != 0); 
				}
				else {
					root = num;
				}
				return round2(root);
			}
				//uses the quadratic formula to approximate the real roots, if any.
				public static String quadForm (int a, int b, int c) {
				double quad = Calculate.discriminant(a, b, c); //Set quad equal to calculate the discriminant of a, b, c
				String ans = ""; //makes ans a string
				if (quad == 0) { // if discriminant = 0, it will return 1 root
					double root = Calculate.round2(-b/(2*a)); // equals 1 root, rounded to 2 decimal places
					ans = root + ""; // quotes create a string
				}
				if (quad > 0) {
					double firstRoot = Calculate.round2((-b + quad))/(2*a); // quadratic formula for the plus
					double secondRoot = Calculate.round2((-b - quad))/(2*a); // quadratic formula for the minus
					if (max(firstRoot, secondRoot) == firstRoot) { // have to use max bc it accepts doubles instead of min
						//return the smaller root first, and then second
						ans = secondRoot + " and " + firstRoot; 
					}
					else {
						ans = firstRoot + " and " + secondRoot;
					}
				}
				if (quad < 0) { // if quad is negative, there are no real roots
				ans = "no real roots";
				}
				return ans;
				}
			}



