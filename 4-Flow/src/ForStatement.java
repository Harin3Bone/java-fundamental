public class ForStatement {

	public static void main(String[] args) {
		System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
		System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3));
		System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4));
		System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5));

		for (int i = 1; i < 5; i++) {
			System.out.println("Loop " + i + " hello!");
		}

		/*
		 * Challenge Using the for statement call the calculateInterest method with the
		 * amount of 10000 with an interestRate of 2,3,4,5,6,7 and 8 Then print the
		 * result to console
		 */

		System.out.println("INCREMENT");
		double initValue = 10_000;
		for (int rate = 2; rate <= 8; rate++) {
			double interest = calculateInterest(initValue, rate);
			System.out.println(initValue + " at " + rate + "% interest = " + String.format("%.2f", interest));
		}

		System.out.println("\nDECREMENT");
		// Modify from increment to decrement
		for (int rate = 8; rate >= 2; rate--) {
			double interest = calculateInterest(initValue, rate);
			System.out.println(initValue + " at " + rate + "% interest = " + String.format("%.2f", interest));
		}

		/*
		 * Challenge Create a for statement using any range of numbers Determine if the
		 * number is a prime number using the isPrime method if it is a prime number,
		 * print it out AND increment a count of the number of prime numbers found if
		 * that count is 3 exit the for loop hint: Use the break; statement to exit
		 */

		int count = 0;
		for (int no = 0; no < 20; no++) {
			if (count == 3) {
				break;
			}

			if (isPrime(no)) {
				System.out.println("Number " + no + " is prime number.");
				count++;
			}
		}

	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
	
	public static boolean isPrimeV2(int n) {
		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i <= (long) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
