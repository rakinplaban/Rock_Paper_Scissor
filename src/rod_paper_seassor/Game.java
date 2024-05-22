package rod_paper_seassor;
import java.util.*;

public class Game {
	private int term;
	private int bot_score = 0;
	private int player_score = 0;
	public Game() {
		System.out.println("Choose any one of them\n"
				+ "0----- Rock\n"
				+ "1----- Paper\n"+
				"2----- Seassor\n"
				+"Other--- Negative marking");
	}
	
	public int random() {
		Random random_pc_input = new Random();
		int a = random_pc_input.nextInt(3);
		return a;
	}
	
	public void play(int term) {
		int bot_term;
		bot_term = random();
		if(bot_term == this.term) {
			System.out.println();
		}
		if(bot_term == 0 && this.term == 1) {
			System.out.println("You win");
			player_score++;
		}else if(bot_term == 0 && this.term == 2) {
			System.out.println("I win");
			bot_score++;
		}else if(bot_term == 1 && this.term == 2) {
			System.out.println("You win");
			player_score++;
		}else if(bot_term == 1 && this.term == 0) {
			System.out.println("I win");
			bot_score++;
		}else if(bot_term == 2 && this.term == 0) {
			System.out.println("You win");
			player_score++;
		}else if(bot_term == 2 && this.term == 1) {
			System.out.println("I win");
			bot_score++;
		}else {
			System.out.println("You're fined!😂");
			player_score--;
		}
	}
	
	public void winner_determiner() {
		if(bot_score > player_score) {
			System.out.println("Sorry, you lost the game!");
		}else if(bot_score < player_score){
			System.out.println("Congrats, you're the winner!");
		}else {
			System.out.println("Draw!");
		}
	}
}
