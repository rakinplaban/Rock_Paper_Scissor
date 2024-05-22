package rod_paper_seassor;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.print("Hello World! Checking phase!");
		try {
			int term_selection;
			System.out.println("Please enter an integer to choose number of terms");
			Scanner input = new Scanner(System.in);
			term_selection = input.nextInt();
			System.out.println("You entered: "+term_selection);
			System.exit(0);
		}
		catch(Exception e){
			System.out.println("Wrong input type");
		}
				
	}

}
