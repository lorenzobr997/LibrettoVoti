package it.polito.tdp.librettovoti.model;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Libretto {
	
	private List<Voto> voti;
	private Map<String, Voto> votiMap;

	public Libretto() {
		this.voti = new ArrayList<>();
		this.votiMap = new HashMap<>();
	}
	
	public void add(Voto v) {
		this.voti.add(v);
		this.votiMap.put(v.getCorso(), v);
	}
	
	public Voto ricercaCorso(String Corso){
		return this.votiMap.get(Corso);
	}
	
	public List<Voto> listaVotiUguali(int p) {
		List<Voto> ris = new ArrayList<>() ;
		for(Voto v: this.voti) {
			if(v.getVoto() == p) {
				ris.add(v);
			}
		}
		return ris;
	}
	
	public Libretto votiUguali (int p) {
		Libretto ris = new Libretto();
		for(Voto v: this.voti) {
			if(v.getVoto() == p) {
				ris.add(v);
			}
		}
		return ris;
	}
	
	public boolean esisteDuplicato(Voto v) {
//		boolean trovato = false;
//		for(Voto voto: this.voti) {
//			if(voto.getCorso().equals(v.getCorso()) && voto.getVoto() == v.getVoto()) {
//				trovato = true;
//				break;
//			}
//		}
//		return trovato;
		
		Voto trovato = this.votiMap.get(v.getCorso());
		if(trovato == null) {
			return false;
		}
		if(trovato.getVoto() == v.getVoto()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean esisteConflitto(Voto v) {
	//	boolean trovato = false;
	//	for(Voto voto: this.voti) {
	//		if(voto.getCorso().equals(v.getCorso()) && voto.getVoto() != v.getVoto()) {
	//			trovato = true;
	//			break;
	//		}
	//	}
	//	return trovato;
		
		Voto trovato = this.votiMap.get(v.getCorso());
		if(trovato == null) {
			return false;
		}
		if(trovato.getVoto() == v.getVoto()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String s = "";
		for(Voto v:this.voti) {
			s = s + v.toString() + "\n";
		}
		return s;
	}
}
