package ruait.ood.coingame;

import java.util.Scanner;

public class CoinFlippingGame {
	public static void main(String[] args) {
		CoinGame mainGame = new CoinGame("thanhbc", "phuongyc");

		String usersAnswer;
		do {
			mainGame.startGame();
			System.out.println("Play Again? ");

			Scanner playGameAgain = new Scanner(System.in);
			usersAnswer = playGameAgain.nextLine();
		} while (usersAnswer.toLowerCase().startsWith("y"));

	}
}
