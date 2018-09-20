package showdown;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BattingOrder extends ArrayList<Player>{
	private List<Player> order = new ArrayList<Player>();
	public Iterator<Player> itr;
	private Player currentBatter = null;
	
	public BattingOrder(Player bo_1, Player bo_2, Player bo_3,Player bo_4,
			Player bo_5, Player bo_6, Player bo_7, Player bo_8, Player bo_9) {
		order.add(bo_1);
		System.out.println(bo_1.getName());
		order.add(bo_2);
		order.add(bo_3);
		order.add(bo_4);
		order.add(bo_5);
		order.add(bo_6);
		order.add(bo_7);
		order.add(bo_8);
		order.add(bo_9);
		itr = order.iterator();
		

		currentBatter = bo_1;
	}
	
	public Player nextBatter() {
		return currentBatter = itr.next();
	}
	
	public Boolean itrHasNext() {
		return itr.hasNext();
	}
	
	public Player loopBackToFirstSpot() {
		itr = order.iterator();
		currentBatter = itr.next();
		return currentBatter;
	}
	
	public Player getCurrentBatter() {
		return currentBatter;
	}
	
	public List<Player> getOrder(){
		return order;
	}
}