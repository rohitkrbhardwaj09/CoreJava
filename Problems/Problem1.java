package Problems;

import java.util.*;

//Write a Java program to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9).
class Problem1{
    public static void main(String[] args) {
 
        System.out.println(validate("RohitBhardwaj"));
        System.out.println(validate("RohitBhardwaj012"));
        System.out.println(validate("RohitBhardwaj$123"));
        System.out.println(validate("RohitBhardwaj@ gmail.com"));
        System.out.println(validate("RohitBhardwaj $#%@#"));

    }

	private static boolean validate(String text) {
		return text.matches("[\\w]+");
	}
}