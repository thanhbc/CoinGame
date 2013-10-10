package ruait.ood.coingame;

public class CoinGame {

	Player[] player = new Player[2];
	Coin theCoin = new Coin();

	public CoinGame(String player1, String player2) {
		player[0] = new Player(player1);
		player[1] = new Player(player2);
	}

	public void startGame() {
		int randIndex = (Math.random() < 0.5) ? 0 : 1;
		String playersPick = player[randIndex].getRandCoinOption();

		int opponentIndex = (randIndex == 0) ? 1 : 0;
		player[opponentIndex].setCoinOption(playersPick);

		String winningFlip = theCoin.getCoinOption();

		player[0].didPlayerWin(winningFlip);
		player[1].didPlayerWin(winningFlip);
	}
}
