package org.chen.beans;

import org.chen.Interface.Poem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("duke")
public class PoeticJuggler extends Juggler {

	@Autowired
	@Qualifier(value="sonnet29")
	private Poem poem;

	public PoeticJuggler() {
		super(10);
	}

	public PoeticJuggler(Poem p) {
		super();
		this.poem = p;
		// TODO Auto-generated constructor stub
	}

	public PoeticJuggler(int beanBags, Poem p) {
		super(beanBags);
		this.poem = p;
		// TODO Auto-generated constructor stub
	}

	public void perform() throws Exception {
		super.perform();
		System.out.println("while reciting....");
		poem.recite();
	}

}
