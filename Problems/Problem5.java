package Problems;
//Write a Java program that matches a string with a 'p' followed by anything ending in 'q'.
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(validate("p2#@!$eresq"));
	}

	private static boolean validate(String text) {
		// TODO Auto-generated method stub
		return text.matches("[p].*[q]");
	}

}
