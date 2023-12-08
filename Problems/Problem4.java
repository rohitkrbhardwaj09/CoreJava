package Problems;
//4. Write a Java program to find the sequence of one upper case letter followed by lower case letters.
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(validate("Rohit"));
	}

	private static boolean validate(String text) {
		return text.matches("[A-Z][a-z]+");
		
	}

}
