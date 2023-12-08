package Problems;

//Write a Java program that matches a string that has a p followed by zero or more q's. 
public class Problem2{

	public static void main(String[] args) {
		
		
		System.out.println(validate("p"));
		System.out.println(validate("pq"));
		System.out.println(validate("pqq"));
		System.out.println(validate("pqqq"));
		System.out.println(validate("pqqq qqq"));
		
	}

	private static boolean validate(String text) {
		
		return text.matches("[p][q]*");
		
	}
	
}