package org.chen.beans;

import org.chen.Interface.Performer;

public class Juggler implements Performer{

	public void perform() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" JUGGLING " + beanBags + " BEANBAGS ");
	}
	
	private int beanBags = 3;

	public Juggler() {
		// TODO Auto-generated constructor stub
	}

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
	}
	
	
}
