package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {
	
	public static void main(String[] args) {
	
		System.out.println("Test metodi libretto");
		
		Libretto libretto = new Libretto();
		
		Voto v1 = new Voto("Analisi I", 30, LocalDate.of(2019, 2, 15));
		Voto v2 = new Voto("Fisica I", 28, LocalDate.of(2019, 7, 15));
		Voto v3 = new Voto("Informatica", 24, LocalDate.of(2019, 2, 8));
		Voto v4 = new Voto("Chimica", 25, LocalDate.of(2019, 1, 31));
		
		libretto.add(v1);
		libretto.add(v2);
		libretto.add(v3);
		libretto.add(v4);
		System.out.println(libretto);
		
		Libretto lib25 = libretto.votiUguali(25);
		System.out.println("Voti libretto 25\n" + lib25);
		
		}
	
}

