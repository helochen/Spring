package org.chen.beans;

import org.chen.Interface.Poem;

public class PoeticJuggler extends Juggler {
	private Poem poem;

	public PoeticJuggler(Poem p) {
		super();
		this.poem = p;
		// TODO Auto-generated constructor stub
	}

	public PoeticJuggler(int beanBags , Poem p) {
		super(beanBags);
		this.poem = p;
		// TODO Auto-generated constructor stub
	}
	
	public void perform() throws Exception{
		super.perform();
		System.out.println("while reciting....");
		poem.recite();
	}
	
}
