package org.lessons.java;

import org.lessons.java.astratta.Animale;
import org.lessons.java.interfaccia.Volare;

public class Aquila extends Animale implements Volare {

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("verso aquila");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("carne");
	}

	
	@Override
	public void vola() {
		// TODO Auto-generated method stub
		System.out.println("sto volando");
	}
}
