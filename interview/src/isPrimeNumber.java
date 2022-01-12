
public class isPrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrime(2)); // true
		System.out.println(isPrime(3)); // true
		System.out.println(isPrime(4)); // false
		System.out.println(isPrime(5)); // true
		System.out.println(isPrime(6)); // false
		System.out.println(isPrime(7)); // true
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		} else if (n == 2) {
			return true;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}

		return true;
	}
}
