
public class SwapTwoNumber {

	public static void main(String[] args) {
		swapNumber(1,2);
		swapNumber(5,10);
	}

	public static void swapNumber(int a, int b) {
		System.out.println("INPUT > A= " + a + ", B= " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("OUTPUT > A= " + a + ", B= " + b + "\n");
	}
}
