package showdown;

import java.util.Arrays;

public class Scoreboard {
		String[] awayBoard;
		String[] homeBoard;
		
	public Scoreboard() {
		awayBoard = new String[]{"__","__","__","__","__","__","__","__","__","|","0"};
		homeBoard = new String[]{"__","__","__","__","__","__","__","__","__","|","0"};
	}
	
	public void getScore() {
	System.out.println("Away: " + Arrays.toString(awayBoard));
	System.out.println("Home: " + Arrays.toString(homeBoard));
	
	}
	 
	public void setNinthInningHomeWin() {
		homeBoard[8] = "X";
	}
	
	public void setScoreByInning(int topBottom, int inning, int score) {
		
		if (topBottom == 0) {
			String stringScore = Integer.toString(score);
			awayBoard[inning] = stringScore;
		} else {
			String stringScore = Integer.toString(score);
			homeBoard[inning] = stringScore;
		}
	}
	
	public void setTotalScore(int topBottom, int inning, int totalScore) {
		if (topBottom == 0) {
			String stringScore = Integer.toString(totalScore);
			awayBoard[10] = stringScore;
		} else {
			String stringScore = Integer.toString(totalScore);
			homeBoard[10] = stringScore;
		}
	}
}
