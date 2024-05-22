package rod_paper_seassor;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.print("Hello World! Checking phase!");
		try {
			int term_selection, i = 0;
			System.out.print("Please enter an integer to choose number of terms");
			Scanner input = new Scanner(System.in);
			term_selection = input.nextInt();
			System.out.println("You entered: "+term_selection);
			// Creating an instance of the Game class.
			Game new_game = new Game();
			System.out.println("Let's start");
			while(i<term_selection) {
				int select = input.nextInt();
				new_game.play(select);
				i++;
			}
			new_game.winner_determiner();
			System.exit(0);
		}
		catch(Exception e){
			System.out.println("Wrong input type");
		}
				
	}

}
