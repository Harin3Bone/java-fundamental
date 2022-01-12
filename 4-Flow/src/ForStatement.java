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
	}

	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}
}
