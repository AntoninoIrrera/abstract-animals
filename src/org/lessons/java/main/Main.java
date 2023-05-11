package org.lessons.java.main;

import org.lessons.java.AnimaleManager;
import org.lessons.java.Aquila;
import org.lessons.java.Cane;
import org.lessons.java.Delfino;
import org.lessons.java.Passerotto;
import org.lessons.java.astratta.Animale;

public class Main {
	public static void main(String[] args) {
		
		
		Cane c = new Cane();
		Passerotto p = new Passerotto();
		Aquila a = new Aquila();
		Delfino d = new Delfino();
		
		
		Animale[] animali = {c,p,a,d};
		
		
		for (int i = 0; i < animali.length; i++) {
			
			animali[i].dormi();
			animali[i].verso();
			animali[i].mangia();
			
		}
		
		
		
		AnimaleManager aM = new AnimaleManager();
		
		
		aM.faiVolare(p);
		aM.faiVolare(a);
		aM.faiNuotare(d);
		
	}
}
