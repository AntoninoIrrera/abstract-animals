package org.lessons.java;

//import org.lessons.java.astratta.Animale;
import org.lessons.java.interfaccia.Nuotare;
import org.lessons.java.interfaccia.Volare;

public class AnimaleManager {
	
	
	public void faiVolare(Volare volante) {
		volante.vola();
	}
	
	public void faiNuotare(Nuotare nuotatore) {
		nuotatore.nuota();
	}

	
	
}
