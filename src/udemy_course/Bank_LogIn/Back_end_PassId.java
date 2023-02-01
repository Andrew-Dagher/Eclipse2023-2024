package udemy_course.Bank_LogIn;
import java.util.Scanner;
import java.util.HashMap;

public class Back_end_PassId {
	
	public Scanner input = new Scanner(System.in);
	
	private String username;
	private int pass;
	private HashMap user = new HashMap<>();
	
	
	public void tasks() {
		System.out.println("Welcome to your Banking log in.");
		
		
	}
	public void prompt_user() {
		System.out.print("please enter your username and numbered password seperated by a space: ");
		String username = input.next();
		int pass = input.nextInt();
		this.username = username;
		this.pass = pass;
	}
	
	// default Constructor
	
	public void AskForLog() {
		while(true) {
		System.out.println("\nHere are you options:\nPress 1 to check your log in information.\nPress 2 to log back into account.\nPress 3 to leave application.");
		System.out.print("\nChoice entered:");
		int choice = input.nextInt();
		if (1 == choice) {
			user.put(this.username, this.pass);
			System.out.println("\nYour id and password are: " + user.entrySet());
		}
		else if (2 == choice) {
			while (true) {
				System.out.print("enter your username: ");
				String username = input.next();
				if (username.equals(this.username)) { // if this was in main, then u could replace this.username with user.containsKey(this.username)
					System.out.print("what is the password: ");
					int pass = input.nextInt();
					if (pass == this.pass){ // if this was in main, then u could replace this.username with user.Values(), maybe not because this prints [...]
						System.out.println("YAY, you were logged in");
						break;
					}else System.out.println("\nIncorrect password or username, try again please.\n");
				}else System.out.println("\nIncorrect password or username, try again please\n");
				}
				}
		else if(choice == 3) {
			break;
		}
		}
		}
	
//	while(playerPos[firstPlayer]<100 && playerPos[secondPlayer]<100) {
//		int diceValue=flipDice();
//		System.out.print(" Player "+ player[0]+" got a dice value of "+ diceValue);
//		playerPos[firstPlayer]+=diceValue;
//		
//		if(playerPos[firstPlayer]>100) {
//			playerPos[firstPlayer]=100-(playerPos[firstPlayer]-100);
//		}
//		
//		for(int ladder: ladders) {
//			if(playerPos[firstPlayer]==ladder) {
//				playerPos[firstPlayer]=TopLadder(ladder);
//				System.out.println(" Player "+player[0]+" climbed a ladder to square "+playerPos[firstPlayer]);
//				break;
//		}
//		for (int snake : snakes) {
//	      if (playerPos[firstPlayer] == snake) {
//	          playerPos[firstPlayer] = tailSnake(snake);
//	          System.out.println(" Player "+player[0]+" was caught by a snake and went down to square "+ playerPos[firstPlayer]);
//	           break;
//	      }
//		}
//		int temp=firstPlayer;
//		firstPlayer=secondPlayer;
//		secondPlayer=temp;
//
//		}
//	}
//		System.out.println("Player "+(playerPos[0] == 100 ? 1 : 2) + " wins!");
//	}
}
		
		
	


