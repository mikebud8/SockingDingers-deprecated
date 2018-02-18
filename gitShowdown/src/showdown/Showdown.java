/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showdown;

import java.util.concurrent.ThreadLocalRandom;

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

		System.out.println(currentPitcher.getName() + " is pitching against " + currentBatter.getName());

		outcome = rollDice(20, 1, currentPitcher.getName());
		// outcome = 5; //debug

		if (outcome <= currentBatter.getOnBase()) {
			System.out.println(currentBatter.getName() + "'s Advantage");
			int bOutcome = rollDice(20, 1, currentBatter.getName());
			// int bOutcome = 20; //debug hit

			if (bOutcome <= currentBatter.getFlyOut()) {
				bases = 0;
				System.out.println("You're out!!! (" + outs + ")");

			} else if (bOutcome <= currentBatter.getSingle()) {
				System.out.println("You're safe at first.");
				bases = 1;

			} else if (bOutcome <= currentBatter.getTwoBagger()) {
				System.out.println("Stand up double!!");
				bases = 2;

			} else if (bOutcome <= currentBatter.getTriple()) {
				System.out.println("He slides into third!!");
				bases = 3;

			} else {
				System.out.println("This guy is socking dingers!!!");
				bases = 4;
			}

		} else {
			System.out.println(currentPitcher.getName() + "'s Advantage");
			int pOutcome = rollDice(20, 1, currentBatter.getName());
			// int bOutcome = 2; //debug hit

			if (pOutcome <= currentPitcher.getFlyOut()) {
				bases = 0;
				System.out.println("You're out!!! (" + outs + ")");

			} else if (pOutcome <= currentPitcher.getSingle()) {
				System.out.println("You're safe at first.");
				bases = 1;

			} else if (pOutcome <= currentPitcher.getTwoBagger()) {
				System.out.println("Stand up double!!");
				bases = 2;

			} else {
				System.out.println("This guy is socking dingers!!!");
				bases = 4;
			}
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
