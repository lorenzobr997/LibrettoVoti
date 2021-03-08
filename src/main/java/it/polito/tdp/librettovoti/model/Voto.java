package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class Voto {
	private String corso;
	private int voto;
	private LocalDate data;
	
	public Voto(String corso, int voto, LocalDate data) {
		super();
		this.corso = corso;
		this.voto = voto;
		this.data = data;
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Esame " + corso + " superato con " + voto + " in data " + data;
	} 

	
}
