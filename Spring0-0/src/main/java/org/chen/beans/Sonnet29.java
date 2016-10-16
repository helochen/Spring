package org.chen.beans;

import org.chen.Interface.Poem;
import org.springframework.stereotype.Component;

@Component("sonnet29")
public class Sonnet29 implements Poem {
	
	public Sonnet29() {
		// TODO Auto-generated constructor stub
	}

	private static String[] LINES = {
		"1322424",
		"1fsdfsdf",
		"3wwtrwfsdf",
		"fsdfgdgd",
		"fsdfsdfsdf",
		"fsdfsvxcvgs",
		"fwerwrfgdgdf",
		"fsdfsdf",
		"fdsfsdfsd"
	};
	
	public void recite() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < LINES.length ; ++i){
			System.out.println(LINES[i]);
		}
	}

}
