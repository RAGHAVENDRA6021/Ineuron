package assignment3;

import java.util.Scanner;

public class Guesser {
	int number;
	int guessNum(){
		System.out.println("Guesser : Guess Number");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		return number;	
	}

}
