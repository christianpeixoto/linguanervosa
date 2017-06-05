package br.com.musicas.opus07.iwontbeyourlover;

import org.jfugue.Pattern;

public class Guitarra extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=8000 I[OVERDRIVEN_GUITAR]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("G4majq G4majq G4majq G4majq"), 1);		
		partitura.add(new Pattern("E4minh E4minh"), 1);		
		partitura.add(new Pattern("C4majh Rh"), 1);		
		partitura.add(new Pattern("G4majh E4minq G4majq"), 1);		
		partitura.add(new Pattern("D4majq D4majq D4majq D4majq"), 1);		
		partitura.add(new Pattern("E4minh E4minh"), 1);		
		partitura.add(new Pattern("A4minh Rh"), 1);		
		partitura.add(new Pattern("D4majh A4minq D4majq"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("G4majh Rh"), 1);		
		partitura.add(new Pattern("A4minh Rh"), 1);		
		partitura.add(new Pattern("E4minh Rh"), 1);		
		partitura.add(new Pattern("C4majh D4majh"), 1);		
		partitura.add(new Pattern("G4majh Rh"), 1);		
		partitura.add(new Pattern("A4minh Rh"), 1);		
		partitura.add(new Pattern("E4minh Rh"), 1);		
		partitura.add(new Pattern("C4majh D4majh"), 1);		
	}

	@Override
	public void ponte() {
		partitura.add(new Pattern("C4majw"), 1);		
		partitura.add(new Pattern("E4minw"), 1);		
		partitura.add(new Pattern("G4majw"), 1);		
		partitura.add(new Pattern("B4minw"), 1);		
		partitura.add(new Pattern("C4majw"), 1);		
		partitura.add(new Pattern("E4minw"), 1);		
		partitura.add(new Pattern("G4majw"), 1);		
		partitura.add(new Pattern("F#4minw"), 1);		
		partitura.add(new Pattern("E4mini E4mini E4mini E4mini"), 1);		
		partitura.add(new Pattern("E4minq Rq"), 1);		
		partitura.add(new Pattern("E4mini E4mini E4mini E4mini"), 1);		
		partitura.add(new Pattern("E4minq Rq"), 1);		
	}

	@Override
	public void fim() {
	}

	@Override
	public void solo() {
		partitura.add(new Pattern("G4majq G4majq G4majq G4majq"), 1);		
		partitura.add(new Pattern("E4minh E4minh"), 1);		
		partitura.add(new Pattern("C4majh Rh"), 1);		
		partitura.add(new Pattern("G4majh E4minq G4majq"), 1);		
		partitura.add(new Pattern("D4majq D4majq D4majq D4majq"), 1);		
		partitura.add(new Pattern("E4minh E4minh"), 1);		
		partitura.add(new Pattern("A4minh Rh"), 1);		
		partitura.add(new Pattern("D4majh A4minq D4majq"), 1);		
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("G4majq G4majq G4majq G4majq"), 1);		
		partitura.add(new Pattern("E4minh E4minh"), 1);		
		partitura.add(new Pattern("C4majh Rh"), 1);		
		partitura.add(new Pattern("G4majh E4minq G4majq"), 1);		
		partitura.add(new Pattern("D4majq D4majq D4majq D4majq"), 1);		
		partitura.add(new Pattern("E4minh E4minh"), 1);		
		partitura.add(new Pattern("A4minh Rh"), 1);		
		partitura.add(new Pattern("D4majh A4minq D4majq"), 1);		
	}
	
}
