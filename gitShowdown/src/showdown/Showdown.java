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

	public BasesOnHit battle(Player currentPitcher, Player currentBatter) {
		int pOutcome;
		int bOutcome;
		BasesOnHit baseOnHit;
		
		System.out.println(currentPitcher.getName() + " is pitching against " + currentBatter.getName());

		pOutcome = rollDice(20, 1, currentPitcher.getName());
		bOutcome = rollDice(20, 1, currentBatter.getName());
		
		if (pOutcome <= currentBatter.getOnBase()) {
			System.out.println(currentBatter.getName() + "'s Advantage");
			baseOnHit = currentBatter.playerStats.floorEntry(bOutcome).getValue();
		} else {
			System.out.println(currentPitcher.getName() + "'s Advantage");
			baseOnHit = currentPitcher.playerStats.floorEntry(pOutcome).getValue();
		}
		System.out.println(baseOnHit.getComment());
		System.out.println(currentBatter.getName() + " advanced " + baseOnHit.getValue() + " base(s)");
		return baseOnHit;
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
}
