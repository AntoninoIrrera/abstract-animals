package org.lessons.java;

import org.lessons.java.astratta.Animale;
import org.lessons.java.interfaccia.IVolare;

public class Aquila extends Animale implements IVolare {

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
