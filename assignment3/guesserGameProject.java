package assignment3;

import java.util.Scanner;


public class guesserGameProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number of players:");
		int numberOfPlayers=scan.nextInt();
		Player players[]= new Player[numberOfPlayers];
		for(int i=0;i<numberOfPlayers;i++) {
			players[i]=new Player();
		}
		Guesser guesser= new Guesser();
		int guessedNumber=guesser.guessNum();
		Umpire umpire = new Umpire(guessedNumber,players);
		umpire.getPlayersGuess();
		umpire.compare();
	}
}

