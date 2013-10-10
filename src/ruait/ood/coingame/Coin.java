package ruait.ood.coingame;

public class Coin {

	private String coinOption = "";
	public String[] coinValue = { "Heads", "Tails" };

	public String getCoinOption() {
		return coinOption;
	}

	public Coin() {
		int randnum = (Math.random() < 0.5) ? 0 : 1;
		coinOption = coinValue[randnum];
	}
}
