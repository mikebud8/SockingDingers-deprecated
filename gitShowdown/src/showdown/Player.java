package showdown;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Player {
	public String name;
	public int onBase = 0;
	public int speed = 0;
	public int cost = 0;
	public int strikeOut = -1;
	public int groundOut = 100;
	public int flyOut = 100;
	public int walk = 100;
	public int single = 100;
	public int twoBagger = 100;
	public int triple = 100;
	public int dinger = 100;
	NavigableMap<Integer, BasesOnHit> playerStats = new TreeMap<Integer, BasesOnHit>();
	public int hits = 0;
	public int atBats = 0;
	public int rbis = 0;
	
	public Player() {
	}
	
	public Player(String name, String playerType) {
		if (playerType.equals("b")) {
		this.name = name;
		onBase = 9;
		speed = 15;
		cost = 0;
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
			groundOut = 11;
			flyOut = 16;
			walk = 18;
			single = 20;
			setStats();
		}
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
		STRIKEOUT(0),
		GROUNDOUT(0),
		FLYOUT(0),
		WALK(1),
		SINGLE(1),
		TWOBAGGER(2),
		TRIPLE(3),
		DINGER(4)
		;
		
		private final int bases;
		private BasesOnHit(int bases) {
			this.bases = bases;
		}
		
		public int getValue() {
			return bases;
		}
	}
}
