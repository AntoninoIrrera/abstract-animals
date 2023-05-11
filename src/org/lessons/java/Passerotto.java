package org.lessons.java;

import org.lessons.java.astratta.Animale;
import org.lessons.java.interfaccia.Volare;

public class Passerotto extends Animale implements Volare{

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("cip cip");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("erba/vermi");
	}

	
	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("sto volando");
	}
	
	

	
}
