/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdown;

import java.util.concurrent.ThreadLocalRandom;

import showdown.Player.BasesOnHit;

/**
 *
 * @author mikebud
 */
public class Showdown {

	Player currentPitcher;

	Player currentBatter;

	public int battle(Player currentPitcher, Player currentBatter, int outs) {
		int bases = 0;
		int outcome;
		BasesOnHit baseOnHit;
		
		System.out.println(currentPitcher.getName() + " is pitching against " + currentBatter.getName());

		outcome = rollDice(20, 1, currentPitcher.getName());
		// outcome = 5; //debug
		System.out.println("Current batters on base is " + currentBatter.getOnBase());
		if (outcome <= currentBatter.getOnBase()) {
			System.out.println(currentBatter.getName() + "'s Advantage");
			int bOutcome = rollDice(20, 1, currentBatter.getName());
			// int bOutcome = 20; //debug hit

			baseOnHit = currentBatter.playerStats.floorEntry(bOutcome).getValue();
			bases = baseOnHit.getValue();
			System.out.println("Bases on hit is " + bases);

		} else {
			System.out.println(currentPitcher.getName() + "'s Advantage");
			int pOutcome = rollDice(20, 1, currentBatter.getName());
			// int pOutcome = 2; //debug hit

			baseOnHit = currentPitcher.playerStats.floorEntry(pOutcome).getValue();
			bases = baseOnHit.getValue();
		}
		System.out.println(currentBatter.getName() + " advanced " + bases + " base(s)");
		return bases;
	}

	public static int rollDice(int dSides, int nDice, String player) {

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = 0;
		// int dTotal = 0;

		for (int i = 1; i <= nDice; i++) {
			randomNum = ThreadLocalRandom.current().nextInt(1, dSides + 1);
			System.out.println(player + "'s roll equals " + randomNum);
			// dTotal = dTotal + randomNum;
		}
		return randomNum;
	}

	public int startDuel(Player batter, Player pitcher, int outs) {
		currentBatter = batter;
		currentPitcher = pitcher;
		int bases = battle(batter, pitcher, outs);
		return bases;
	}
}
