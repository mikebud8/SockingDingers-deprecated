package showdown;

import showdown.Player.BasesOnHit;

public class Game {
	public final static int TOP = 0;
	public final static int BOTTOM = 1;
	//public BattingOrder homeBatters;
	//public BattingOrder awayBatters;

	public static void main(String[] args) {

		GameWindow gw = new GameWindow();

		gw.setVisible(true);

		int outs = 0;
		int totalRunsHome = 0;
		int totalRunsAway = 0;

		Scoreboard sb = new Scoreboard();
		sb.getScore();

		//ArrayList<Player> homeBatters;
		//ArrayList<Player> awayBatters;

		BattingOrder homeBatters;
		BattingOrder awayBatters;

		BattingOrder currentBatters;
		Player crntBtr = new Player();
		Player currentPitcher = new Player();
		Showdown showDown = new Showdown();

		int inning = 0;
		int inningIs = TOP;

		// Make the field
		Field f = new Field();
		f.getFieldStatus();

		// Make the Batters
		homeBatters = makeHomeBatters();
		awayBatters = makeAwayBatters();

		gw.setAwayBattingOrderTable(awayBatters);
		gw.setHomeBattingOrderTable(homeBatters);
		

		Player homePitcher = getHomePitcher();
		Player awayPitcher = getAwayPitcher();
		
		while (inning < 9) {
			int runsScored = 0;
			int runsPerInning = 0;

			// Not sure best way to do this
			// Innings are separated into TOP and BOTTOM
			// Away team ALWAYS bats in the top of the inning
			if (inningIs == TOP) {
				System.out.println("Now entering inning #" + (inning + 1));
				currentBatters = awayBatters;
				currentPitcher = homePitcher;
			//	batterIndex = nextAwayBatter;
			} else {
				currentBatters = homeBatters;
				currentPitcher = awayPitcher;
			//	batterIndex = nextHomeBatter;
			}
/*			while (inning < 22) {
			if (!homeBatters.itrHasNext()) {
				crntBtr = homeBatters.loopBackToFirstSpot();
			}else {
				crntBtr = homeBatters.nextBatter();
			}*/
			while (outs < 4) {
				if (!currentBatters.itrHasNext()) {
					crntBtr = currentBatters.loopBackToFirstSpot();
				}else {
				crntBtr = currentBatters.nextBatter();
				}
				BasesOnHit baseOnHit = showDown.battle(currentPitcher, crntBtr);
				crntBtr.addHitType(baseOnHit);
				int bases = baseOnHit.getValue();
				crntBtr.addAtBats();

				if (bases == 0) {
					outs++;
				} else {
					runsScored = f.hit(bases);
					crntBtr.addHits();
					crntBtr.addRbis(runsScored);
				}
				runsPerInning += runsScored;
				runsScored = 0;
				System.out.println(runsPerInning);
				//currentBatters.nextBatter();
				//batterIndex++;
			}

/*			if (inningIs == TOP) {
				nextAwayBatter = batterIndex;
			} else {
				nextHomeBatter = batterIndex;
			}*/

			sb.setScoreByInning(inningIs, inning, runsPerInning);

			if (inningIs == TOP) {
				totalRunsAway += runsPerInning;
				sb.setTotalScore(inningIs, inning, totalRunsAway);
				inningIs = BOTTOM;

				//This is a silly little thing that happens when the home team is winning in the
				//middle of the 9th inning and they don't actually play their half inning.
				if (/*inningIs == BOTTOM &&*/ inning == 8 && totalRunsHome > totalRunsAway) {
					sb.setNinthInningHomeWin();
					inning++;
				}

			} else {
				totalRunsHome += runsPerInning;
				sb.setTotalScore(inningIs, inning, totalRunsHome);
				inningIs = TOP;
				inning++;
			}

			sb.getScore();
			f.resetField();
			outs = 0;
			runsPerInning = 0;
			gw.setScores(totalRunsAway, totalRunsHome);
		}

		System.out.println("|---------FINAL SCORE---------|");
		sb.getScore();
		StatSheet ss = new StatSheet(homeBatters, awayBatters);
		ss.showStatSheet();
		//ss.BoxScore(homeBatters);

	}
	//TODO update this t
	// these are all garbage methods just to tweak player names for now
	public static BattingOrder makeHomeBatters() {
		Player Mitts = new Player("Mitts", "b");
		Player James = new Player("James", "b");
		Player Mooch = new Player("Mooch", "b");
		Player CrackFiend = new Player("Crack Fiend", "b");
		Player RatTrap = new Player("RatTrap", "b");
		Player Natalie = new Player("Natalie", "b");
		Player KP = new Player("KP", "b");
		Player Zach = new Player("Zach", "b");
		Player PaulaSanchez = new Player("Paula Sanchez", "b");

		BattingOrder homeBO = new BattingOrder(Mitts, James, Mooch, CrackFiend, RatTrap, Natalie, KP, Zach, PaulaSanchez);

		return homeBO;
	}

	public static BattingOrder makeAwayBatters() {
		Player Deano = new Player("Deano", "b");
		Player Mikebud = new Player("Mikebud", "b");
		Player StoneCleave = new Player("StoneCleave", "b");
		Player BigOwen = new Player("Big Owen", "b");
		Player Lex = new Player("Lex", "b");
		Player BigToni = new Player("Big Toni", "b");
		Player Dides = new Player("Dides", "b");
		Player Steggy = new Player("Steggy", "b");
		Player Evvy = new Player("Evvy", "b");

		BattingOrder awayBO = new BattingOrder(Deano, Mikebud, StoneCleave, BigOwen, Lex, BigToni, Dides, Steggy, Evvy);

		return awayBO;
	}

	public static Player getHomePitcher() {
		Player Amanda = new Player("Amanda", "p");
		return Amanda;
	}

	public static Player getAwayPitcher() {
		Player Kasabushi = new Player("Kasabushi", "p");
		return Kasabushi;
	}

}
