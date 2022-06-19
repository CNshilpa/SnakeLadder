
package com.snakenladder.www;

import java.util.Random;

public class SnakeLadder {

	public static void main(String[] args) {

		
		Random random = new Random();
		int dice = 1 + random.nextInt(6);
		System.out.println("dice value: " + dice);
		Random random1 = new Random();
		int winningPosition=100;
		int player1Position = 0;
		int diceRoll=0;

		while (player1Position < winningPosition) {
			diceRoll++;
			int playOption = random1.nextInt(3);
			System.out.println("play option: " + playOption);
			switch (playOption) {
			case 0:
				System.out.println(" NO PLAY " + " Player position is " + player1Position);
				break;
			case 1:
				player1Position = player1Position + dice;
				System.out.println(" Ladder " + " Player position is " + player1Position);
				break;

			default:
				player1Position = player1Position - dice;
				if (player1Position < 0) {
					player1Position = 0;
				}
				System.out.println(" Snake " + " Player position is " + player1Position);
				break;

			}
			System.out.println("No. of time dice rolled:"+diceRoll);
		}
	}
	}
