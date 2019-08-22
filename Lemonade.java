import java.util.Scanner;

public class Lemonade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int drink = 10;
		System.out.println("How much do you think the lemanade is?,type it");
		Scanner dice = new Scanner(System.in);
		int userInp = dice.nextInt();
		if (userInp == 10){
			System.out.println("You are right");
		}else if (userInp == -10){
			System.out.println("You owe me money kidd");
		}
		else{
			System.out.println("you entered a wrong number");
		}

	}

}
