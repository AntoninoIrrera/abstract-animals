package org.lessons.java;

import org.lessons.java.astratta.Animale;
import org.lessons.java.interfaccia.INuotare;


public class Delfino extends Animale implements INuotare {

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("verso delfino");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("plancton/pesce");
	}
	
	@Override
	public void nuota() {
		// TODO Auto-generated method stub
		System.out.println("sto nuotando");
	}
	
	
}
