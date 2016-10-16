package org.chen.beans;

import java.util.Collection;

import org.chen.Interface.Instrument;
import org.chen.Interface.Performer;

public class OneManBand implements Performer {

	public OneManBand(){
		
	}
	
	public void perform() throws Exception {
		// TODO Auto-generated method stub
		for(Instrument instrument : instruments){
			instrument.play();
		}
	}
	
	private Collection<Instrument> instruments;

	public Collection<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	
	
}
