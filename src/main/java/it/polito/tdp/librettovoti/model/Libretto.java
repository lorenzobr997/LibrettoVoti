package it.polito.tdp.librettovoti.model;

import java.util.List;
import java.util.ArrayList;

public class Libretto {
	
	private List<Voto> voti;

	public Libretto() {
		this.voti = new ArrayList<>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	public String toString() {
		String s = "";
		for(Voto v:this.voti) {
			s = s + v.toString() + "\n";
		}
		return s;
	}
}
