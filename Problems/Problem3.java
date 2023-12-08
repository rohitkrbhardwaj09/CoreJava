package Problems;

//3. Write a Java program to find sequences of lowercase letters joined by an underscore.
public class Problem3 {

	public static void main(String[] args) {
		
		System.out.println(validate("Rohit_Bhardwaj"));
		System.out.println(validate("Rohit_bhardwaj"));
		System.out.println(validate("rohit_Bhardwaj"));
		System.out.println(validate("rohit_bhardwaj"));

	}

	private static boolean validate(String text) {
		return text.matches("[a-z]+_[a-z]+$");
	}

}
