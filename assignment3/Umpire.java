package assignment3;

import java.util.ArrayList;

public class Umpire {
	int guessedNumber;
	Player players[];
	ArrayList<Integer> playerGuessedNumbers=new ArrayList<Integer>();
	public Umpire(int guessedNumber,Player p[]){
		this.guessedNumber=guessedNumber;	
		this.players=p;
	}
	
	public void getPlayersGuess() {
		int num=1;
		for(Player player:players) {
			playerGuessedNumbers.add(player.guessNum(num));
			num++;
		}
	}
	
	public void compare(){
		ArrayList<String> correctGuesses=new ArrayList<String>();
		int player=1;
		for(int guess: playerGuessedNumbers) {
			if(guessedNumber==guess) {
				correctGuesses.add(String.valueOf(player));
			}
			player++;
		}
		
	if(correctGuesses.size()>0)
		System.out.println("Players :"+ String.join(",",correctGuesses)+" won the game");
	else
		System.out.println("Lost Game ,Try Again !!!");		
	}

}
