package showdown;

import java.util.Iterator;
import java.util.LinkedList;

public class BattingOrder {
	public LinkedList<String> order = new LinkedList<String>();
	public Iterator<String> itr;
	
	public BattingOrder(String bo_1, String bo_2, String bo_3,String bo_4,
			String bo_5, String bo_6, String bo_7, String bo_8, String bo_9) {
		order.add(bo_1);
		order.add(bo_2);
		order.add(bo_3);
		order.add(bo_4);
		order.add(bo_5);
		order.add(bo_6);
		order.add(bo_7);
		order.add(bo_8);
		order.add(bo_9);
		itr = order.iterator();
	}
	
	public String nextBatter() {
		return itr.next();
	}
	
	public Boolean itrHasNext() {
		return itr.hasNext();
	}
	
	public String loopBackToFirstSpot() {
		itr = order.iterator();
		return itr.next();
	}
}