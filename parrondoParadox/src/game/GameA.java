package game;

public class GameA {
	
	private enum Coin{heads, tails};
	
	public boolean start(){		
		boolean victory = false;
		
		if (flipCoin() == Coin.heads) {
			victory = true;
		}
		
		return victory;
	}
	
	private Coin flipCoin(){
		double r = Math.random();
		
		Coin coin = Coin.tails;
		
		// prob = 0.5 - 0.005
		double x = 0.005;
		double p = 0.5 - x;
		
		if (r <= p) {
			coin = Coin.heads;
		}
		
		return coin;
	}
}
