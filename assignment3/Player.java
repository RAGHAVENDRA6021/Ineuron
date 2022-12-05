package assignment3;

import java.util.Scanner;

public class Player {
	int number;
	int guessNum(int num){
		System.out.println("Player"+num+" : Guess Number");
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		return number;	
	}

}
