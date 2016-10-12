package org.chen.beans;

import org.chen.Interface.Instrument;
import org.chen.Interface.Performer;

public class Instrumentalist implements Performer {

	public Instrumentalist() {

	}

	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	private String song;

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void perform() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Playing " + song + " : ");

		instrument.play();
	}

}
