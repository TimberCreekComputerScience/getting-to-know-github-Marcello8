package lemonade;
import java.util.Scanner;

public class lemonade {

	public static void main(String[] args) {
		System.out.println("Welcome to my Dr.Lemonade!");
		System.out.println("Do you want a Large medium or small?");
		int large = 3;
		int medium = 2;
		int small = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("type 3, for large, 2 for medium, and 1 for small");
		int userInp = scan.nextInt();
		if (userInp == 3) {
			System.out.println("You got a large that will be 3 bucks");
		} else if (userInp == 2) {
			System.out.println("You got a medium that will be 2 bucks");
		} else if (userInp == 1) {
			System.out.println("You got a small that will be 1 buck");
		} else {
			System.out.println("You did not type 1,2, or 3(try again");
		}
		
		System.out.println("How many drinks do you want?");
		int userInp2 = scan.nextInt();
		System.out.println("Okay you got " + userInp2 + " drinks!");
		System.out.println("You owe " + userInp2 * userInp + ",thanks for your service:)");
		
	}

}
