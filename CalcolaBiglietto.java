package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		
        
        //scanner
        
Scanner scanner;
		
		scanner = new Scanner(System.in);
		// inizializzazione
		double prezzoBigliettoKm = 0.21; 
        double prezzoMinorenni = 0.2;
        double prezzoOver = 0.4;
        
        
		
        System.out.print("Inserisci i km da percorrere:");
		double kmDaPercorrere = scanner.nextDouble();
		
		System.out.print("Inserisci età passeggero: ");
		int etaPasseggero = scanner.nextInt();
		
//		System.out.println(kmDaPercorrere); // debug
//		System.out.println(etaPasseggero);
		 double prezzoTotale = prezzoBigliettoKm * kmDaPercorrere;
		 double scontoMinorenni = prezzoTotale * prezzoMinorenni;
		 double scontoOver = prezzoTotale * prezzoOver;
		 
		 
		if(etaPasseggero < 18)  {
			System.out.println("il prezzo del biglietto è: " + (prezzoTotale - scontoMinorenni) + " euro");
			
		} else if( etaPasseggero > 65) {
			System.out.println(" il prezzo del biglietto è: " + (prezzoTotale - scontoOver) + " euro");
		} else {
			System.out.println("il prezzo del biglietto è: " + prezzoTotale + " euro");
		}
		
		
		// close scanner
		scanner.close();

	}

}
