package showdown;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class StatSheet {
	BattingOrder homeTeam;
	BattingOrder awayTeam;
	
	public StatSheet(BattingOrder homeBatters, BattingOrder awayBatters) {
		this.homeTeam = homeBatters;
		this.awayTeam = awayBatters;
	}
	
	public void showStatSheet() {
		System.out.println("|----------HOME TEAM----------|");
		System.out.println("|Player             |RBI|Avg. |");
		for (int i = 0; i < homeTeam.getOrder().size(); i++) {
			
			String nextName = homeTeam.getOrder().get(i).getName();
			nextName = bufferNames(nextName,19);
			
			int rbis = homeTeam.getOrder().get(i).getRbis();
			String sRbis = setUpRbis(rbis);
			
			int hits = homeTeam.getOrder().get(i).getHits();
			int atBats = homeTeam.getOrder().get(i).getAtBats();
			
			String average = setUpBattingAverage(hits,atBats);
			
			System.out.println("|" + nextName + "|" + sRbis + "|" + average + "|");
		}
		BoxScore(homeTeam);
		
		System.out.println("|----------AWAY TEAM----------|");
		System.out.println("|Player             |RBI|Avg. |");
		for (int i = 0; i < awayTeam.getOrder().size(); i++) {
			
			String nextName = awayTeam.getOrder().get(i).getName();
			nextName = bufferNames(nextName,19);
			
			int rbis = awayTeam.getOrder().get(i).getRbis();
			String sRbis = setUpRbis(rbis);
			
			int hits = awayTeam.getOrder().get(i).getHits();
			int atBats = awayTeam.getOrder().get(i).getAtBats();
			
			
			String average = setUpBattingAverage(hits,atBats);
			
			System.out.println("|" + nextName + "|" + sRbis + "|" + average + "|");
		}
		BoxScore(awayTeam);
	}
	
	public String bufferNames(String name, int buffer) {
		while (name.length()<buffer) {
			name += " ";
		}
		
		return name;
	}
	
	public String setUpRbis(int rbis) {
		String sRbis = Integer.toString(rbis);
		
		if (rbis < 10) {
			sRbis = "  " + (Integer.toString(rbis));
		} 

		return sRbis;
	}
	
	public String setUpBattingAverage(int hits, int atBats) {
		String average = "0.000";
		if(atBats != 0) {
		double dHits = hits;
		double dAtBats = atBats;
		
		DecimalFormat df2 = new DecimalFormat("0.000");
		
		double avg = dHits / dAtBats;
		average = df2.format(avg);
		}
		return average;
	}
	
	public String BoxScore(ArrayList<Player> team) {
		for(int i = 0; i < team.size();  i++) {
			String playerStat = team.get(i).getName();
			playerStat = bufferNames(playerStat, 14);
			System.out.println(playerStat +": " + team.get(i).hitTypes.toString());
		}
		return null;
	}
}
