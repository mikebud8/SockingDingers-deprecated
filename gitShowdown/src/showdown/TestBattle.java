package showdown;

public class TestBattle {
	public static void main(String[] args) {
		Player batter = new Player("batter", "b");
		Player pitcher = new Player("pitcher", "p");
		Showdown showDown = new Showdown();
		batter.setGroundOut(0);
		batter.setStats();
		System.out.println(batter.toString());
		System.out.println("\n\n" + batter.playerStats.floorEntry(14).getValue().getValue());
		System.out.println(batter.playerStats.toString() + "\n");
		showDown.battle(pitcher, batter);
		//int bases = BasesOnHit.matchName(batter.playerStats.floorEntry(0).getValue());
		//System.out.println("Total bases is " + bases + ".");
	}
	
}
