package ruait.ood.coingame;

public class Player {

	private String name = "";
	private String coinOption = "";

	public String[] coinValue = { "Heads", "Tails" };

	public Player(String name) {
		this.name = name;

	}

	public String getCoinOption() {
		return coinOption;
	}

	public void setCoinOption(String opponentFlip) {
		this.coinOption = (opponentFlip.equals("Heads")) ? "Tails" : "Heads";
	}

	public String getRandCoinOption() {
		int randnum = (Math.random() < 0.5) ? 0 : 1;
		coinOption = coinValue[randnum];
		return coinOption;
	}

	public void didPlayerWin(String winningFlip) {
		if (coinOption.equals(winningFlip)) {

			System.out.println(name + " won with a flip of " + coinOption);
		} else {
			System.out.println(name + " lose with a flip of " + coinOption);
		}
	}

}
