package game;

public class GameB {
	
	private enum Coin{heads, tails};
	
	public boolean start(long money){
		boolean victory = false;
		
		if (money % 3 == 0) {
			if (flipCoin1() == Coin.heads) {
				victory = true;
			}
		} else {
			if (flipCoin2() == Coin.heads) {
				victory = true;
			}
		}
		
		return victory;
	}
	
	private Coin flipCoin1(){
		double r = Math.random();
		Coin coin = Coin.tails;
		
		// prob = 0.1 - 0.005 = 0.095
		double x = 0.005;
		double p = (1.0/10.0)-x;
		
		if (r <= p) {
			coin = Coin.heads;
		}
		
		return coin;
	}
	
	private Coin flipCoin2(){
		double r = Math.random();
		Coin coin = Coin.tails;
		
		// prob = 0.75 - 0.005 = 0.745
		double x = 0.005;
		double p = (3.0/4.0)-x;
		
		if (r <= p) {
			coin = Coin.heads;
		}
		
		return coin;
	}
}
