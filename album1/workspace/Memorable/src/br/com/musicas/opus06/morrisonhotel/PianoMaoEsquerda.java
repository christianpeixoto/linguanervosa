package br.com.musicas.opus06.morrisonhotel;

import org.jfugue.Pattern;

public class PianoMaoEsquerda extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 I[PIANO] X[Volume]=9000"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("C4majq C4maji C4maji Rh"), 1);		
		
		partitura.add(new Pattern("C4majq C4maji C4maji Rh"), 1);		
		
		partitura.add(new Pattern("D4majq D4maji D4maji Rh"), 1);		
		
		partitura.add(new Pattern("C4majq C4maji C4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("C4majq C4maji C4maji Rh"), 1);		
		
		partitura.add(new Pattern("D4majq D4maji D4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
	}
	
	@Override
	public void solo() {
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("C4majq C4maji C4maji Rh"), 1);		
		
		partitura.add(new Pattern("C4majq C4maji C4maji Rh"), 1);		
		
		partitura.add(new Pattern("D4majq D4maji D4maji Rh"), 1);		
		
		partitura.add(new Pattern("C4majq C4maji C4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
	}
	
	@Override
	public void intro() {
		partitura.add(new Pattern("C4majq C4maji C4maji Rh"), 1);		
		
		partitura.add(new Pattern("D4majq D4maji D4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
		
		partitura.add(new Pattern("G4majq G4maji G4maji Rh"), 1);		
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("C4majq C4maji C4maji Rh"), 1);		
		
		partitura.add(new Pattern("D4majq D4maji D4maji Rh"), 1);
		
		partitura.add(new Pattern("G4majw"), 1);
	}

}
