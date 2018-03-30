package showdown;

import java.util.ArrayList;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Player {
	public String name;
	public int onBase = 0;
	public int speed = 0;
	public int cost = 0;
	public String position = null;
	public int strikeOut = -1;
	public int groundOut = 100;
	public int flyOut = 100;
	public int walk = 100;
	public int single = 100;
	public int twoBagger = 100;
	public int triple = 100;
	public int dinger = 100;
	public NavigableMap<Integer, BasesOnHit> playerStats = new TreeMap<Integer, BasesOnHit>();
	public int hits = 0;
	public int atBats = 0;
	public int rbis = 0;
	public ArrayList<BasesOnHit> hitTypes = new ArrayList<BasesOnHit>();
	
	public Player() {
	}
	
	public Player(String name, String playerType) {
		if (playerType.equals("b")) {
		this.name = name;
		onBase = 8;
		speed = 15;
		cost = 0;
		position = "B";
		strikeOut = -1;
		groundOut = 3;
		flyOut = 5;
		walk = 8;
		single = 11;
		twoBagger = 15;
		triple = 17;
		dinger = 18;
		setStats();
		} else if (playerType.equals("p")) { 
			this.name = name;
			onBase = 2;
			speed = 15;
			cost = 0;
			position = "P";
			groundOut = 11;
			flyOut = 16;
			walk = 18;
			single = 20;
			setStats();
		}
	}
	
	private Object[][] buildStats() {
	Object[][] data = {{"",onBase},{"speed:",speed},{"Position:", position}};
	return data;
	}
	
	public Object[][] getCardStats(){
		Object[][] cardStats = this.buildStats();
	return cardStats;
	}
	
	public String getName(){
	return name;
	}
	
	public int getHits(){
	return hits;
	}
	
	public int getAtBats(){
	return atBats;
	}
	
	public int getRbis(){
	return rbis;
	}
	
	public int getOnBase(){
	return onBase;
	}
	
	public int getSpeed(){
	return speed;
	}
	
	public int getCost(){
	return cost;
	}
	
	public int getStrikeOut() {
		return strikeOut;
	}

	public int getGroundOut(){
	return groundOut;
	}
	
	public int getFlyOut(){
	return flyOut;
	}
	
	public int getWalk(){
	return walk;
	}
	
	public int getSingle(){
	return single;
	}
	
	public int getTwoBagger(){
	return twoBagger;
	}
	
	public int getTriple(){
	return triple;
	}
	
	public int getDinger(){
	return dinger;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setOnBase(int onBaseVal) {
		onBase = onBaseVal;
	}
	
	public void setSpeed(int speedVal){
		speed = speedVal;
	}
	
	public void setCost(int costVal){
		cost = costVal;
	}

	public void setStrikeOut(int strikeOut) {
		this.strikeOut = strikeOut;
	}
	
	public void setGroundOut(int groundOutVal){
		groundOut = groundOutVal;
	}
	
	public void setFlyOut(int flyOutVal){
		flyOut = flyOutVal;
	}
	
	public void setWalk(int walkVal){
		walk = walkVal;
	}
	
	public void setSingle(int singleVal){
		single = singleVal;
	}
	
	public void setTwoBagger(int twoBaggerVal){
		twoBagger = twoBaggerVal;
	}
	
	public void setTriple(int tripleVal){
		triple = tripleVal;
	}
	
	public void setDinger(int dingerVal){
		dinger = dingerVal;
	}
	
	public void setHits(int hits){
	this.hits = hits;
	}
	
	public void setatBats(int atBats){
	 this.atBats = atBats;
	}
	
	public void setRbis(int rbis){
	this.rbis = rbis;
	}
	
	public void setStats() {
	//Nobody's perfect
	//Returns a mapping associated with the greatest key less than or equal to the given key, or null if there is no such key.
	playerStats.clear();
	playerStats.put(-1, BasesOnHit.STRIKEOUT);
	playerStats.put(groundOut, BasesOnHit.GROUNDOUT);
	playerStats.put(flyOut, BasesOnHit.FLYOUT);
	playerStats.put(walk, BasesOnHit.WALK);
	playerStats.put(single, BasesOnHit.SINGLE);
	playerStats.put(twoBagger, BasesOnHit.TWOBAGGER);
	playerStats.put(triple, BasesOnHit.TRIPLE);
	playerStats.put(dinger, BasesOnHit.DINGER);

	/*for(int i = 0; i <= 20; i++) {
		System.out.println(playerStats.floorEntry(i).getValue());
	}*/
	}
	
	public void addRbis(int rbis) {
		this.rbis += rbis;
	}
	
	public void addAtBats() {
		atBats++;
	}
	
	public void addHits() {
		hits++;
	}
	
	public void addHitType(BasesOnHit ht) {
		this.hitTypes.add(ht);
	}
	
	@Override
	public String toString() {
		String myString = "Strike Out: " + getStrikeOut() + ".\n" +
						  "Ground Out: " + getGroundOut() + ".\n" +
						  "Fly Out: " + getFlyOut() + ".\n" +
						  "Walk: " + getWalk() + ".\n" +
						  "Single: " + getSingle() + ".\n" +
						  "Double: " + getTwoBagger() + ".\n" +
						  "Triple: " + getTriple() + ".\n" +
						  "Homerun: " + getDinger() + ".\n";
		return myString;
	}
	
	public enum BasesOnHit{
		STRIKEOUT(0, "He/she goes down swinging!"),
		GROUNDOUT(0, "Grounder to the second baseman."),
		FLYOUT(0, "Routine fly ball for the centerfielder."),
		WALK(1, "And he/she walks him/her."),
		SINGLE(1, "Safe at first."),
		TWOBAGGER(2, "Stand up double!"),
		TRIPLE(3, "He slides into third!!"),
		DINGER(4, "This guy is socking dingers!!!!")
		;
		
		private final int bases;
		private final String comment;
		private BasesOnHit(int bases, String comment) {
			this.bases = bases;
			this.comment = comment;
		}
		
		public int getValue() {
			return bases;
		}
		
		public String getComment() {
			return comment;
		}
	}
}
