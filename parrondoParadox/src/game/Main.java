package game;

public class Main {

	public static void main(String[] args) {
		
		GameA gA = new GameA();
		
		long victory = 0;
		long defeat = 0;
		double total = 0;
		long money = 1;
		
		while (total < 1000000) {
			if (gA.start()) {
				victory++;
				money++;
			} else {
				defeat++;
				money--;
			}
			total = victory + defeat;
		}
		
		System.out.println("Playing only game A.");
		System.out.println("Total games played: " + (int)total);
		System.out.println("Victories: " + victory);
		System.out.println("Defeat: " + defeat);
		System.out.printf("Total games won: %.2f ", victory*100/total);
		System.out.println("%");
		System.out.printf("Total games lost: %.2f ", defeat*100/total);
		System.out.println("%");
		System.out.println("Total money earned: " + money);
		
		GameB gB = new GameB();
		
		victory = 0;
		defeat = 0;
		total = 0;
		money = 1;
		
		while (total < 500000) {
			long earned = 0;
			if (gA.start()) {
				earned++;
				victory++;
			} else {
				earned--;
				defeat++;
			}
			if (gB.start(earned)) {
				money++;
				victory++;
			} else {
				money--;
				defeat++;
			}
			total = victory + defeat;
		}
		
		System.out.println("Playing A and B.");
		System.out.println("Total games played: " + (int)total*2);
		System.out.println("Victories: " + victory);
		System.out.println("Defeat: " + defeat);
		System.out.printf("Total games won: %.2f ", victory*100/total);
		System.out.println("%");
		System.out.printf("Total games lost: %.2f ", defeat*100/total);
		System.out.println("%");
		System.out.println("Total money earned: " + money);
		
	}

}
