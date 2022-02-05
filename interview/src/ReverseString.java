
public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("123"));
		System.out.println(reverseString(""));
		System.out.println(reverseString("aasdfghj"));		
		System.out.println(reverseString(null));
		;
	}

	public static String reverseString(String s) {
		if (s == null) {
			return "";
		}
		
		StringBuilder sb = new StringBuilder();		
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			sb.append(ch);
		}

		return sb.toString();
	}

}
