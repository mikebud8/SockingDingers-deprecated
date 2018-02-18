package showdown;

import java.util.Arrays;

public class Field {
	int runs;
	boolean[] field;

	public Field() {
		runs = 0;
		field = new boolean[5];
	}

	public int hit(int basesEarned) {
		runs = 0;
		field[Bases.BOX.val] = true;

		// On any hit all baserunners advance Bases.FIRST.val.
		// TODO broken for walks :(
		if (basesEarned > 0) {
			field[Bases.HOME.val] = field[Bases.THIRD.val];
			field[Bases.THIRD.val] = field[Bases.SECOND.val];
			field[Bases.SECOND.val] = field[Bases.FIRST.val];
			field[Bases.FIRST.val] = false;
		}

		for (int i = 1; i <= basesEarned; i++) {

			if (field[Bases.FIRST.val] != true) {
				field[Bases.FIRST.val] = field[Bases.BOX.val];
			} else if (field[Bases.SECOND.val] != true) {
				field[Bases.SECOND.val] = field[Bases.FIRST.val];
				field[Bases.FIRST.val] = field[Bases.BOX.val];
			} else if (field[Bases.THIRD.val] != true) {
				field[Bases.THIRD.val] = field[Bases.SECOND.val];
				field[Bases.SECOND.val] = field[Bases.FIRST.val];
				field[Bases.FIRST.val] = field[Bases.BOX.val];
			} else if (field[4] != true) {
				field[4] = field[Bases.THIRD.val];
				field[Bases.THIRD.val] = field[Bases.SECOND.val];
				field[Bases.SECOND.val] = field[Bases.FIRST.val];
				field[Bases.FIRST.val] = field[Bases.BOX.val];
			}

			if (field[Bases.HOME.val] == true) {
				runs++;
				field[Bases.HOME.val] = false;
				System.out.println("Run Scores!!");
			}

		}

		for (int j = 0; j < basesEarned; j++) {
			field[j] = false;
		}

		System.out.println(Arrays.toString(field));
		return runs;
	}
	
	public void resetField() {
		for (int i = 0; i <= Bases.HOME.val; i++) {
			field[i] = false;
		}
	}

	public void getFieldStatus() {
		System.out.println(Arrays.toString(field));
	}
}
