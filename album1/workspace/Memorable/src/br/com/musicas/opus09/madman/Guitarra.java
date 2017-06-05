package br.com.musicas.opus09.madman;

import org.jfugue.Pattern;

public class Guitarra extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=7000 I[ELECTRIC_MUTED_GUITAR]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("B4minq B4minh Rq"), 1);		
		partitura.add(new Pattern("A4majq A4majh Rq"), 1);		
		partitura.add(new Pattern("B4minq B4minh Rq"), 1);		
		partitura.add(new Pattern("A4majq A4majh Rq"), 1);		
		partitura.add(new Pattern("B4minq B4minh Rq"), 1);		
		partitura.add(new Pattern("A4majq A4majh Rq"), 1);		
		partitura.add(new Pattern("G4majw"), 1);		
		partitura.add(new Pattern("A4majw"), 1);		
		partitura.add(new Pattern("B4minq B4minh Rq"), 1);		
		partitura.add(new Pattern("A4majq A4majh Rq"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("D4majw"), 1);		
		partitura.add(new Pattern("G4majw"), 1);		
		partitura.add(new Pattern("A4majw"), 1);		
		partitura.add(new Pattern("A4sus4w"), 1);		
		partitura.add(new Pattern("D4majw"), 1);		
		partitura.add(new Pattern("G4majw"), 1);		
		partitura.add(new Pattern("A4majw"), 1);		
		partitura.add(new Pattern("A4sus4w"), 1);		
		partitura.add(new Pattern("D4majw"), 1);		
		partitura.add(new Pattern("G4majw"), 1);		
		partitura.add(new Pattern("A4majw"), 1);		
		partitura.add(new Pattern("A4sus4w"), 1);		
		partitura.add(new Pattern("D4majw"), 1);		
		partitura.add(new Pattern("G4majw"), 1);		
		partitura.add(new Pattern("A4majw"), 1);		
		partitura.add(new Pattern("A4sus4w"), 1);		
	}

	@Override
	public void ponte() {
		partitura.add(new Pattern("B4minq B4minh Rq"), 1);		
		partitura.add(new Pattern("A4majq A4majh Rq"), 1);		
		partitura.add(new Pattern("G4majq G4majh Rq"), 1);		
		partitura.add(new Pattern("G4majq G4majh Rq"), 1);		
		partitura.add(new Pattern("B4minq B4minh Rq"), 1);		
		partitura.add(new Pattern("A4majq A4majh Rq"), 1);		
		partitura.add(new Pattern("G4majq G4majh Rq"), 1);		
		partitura.add(new Pattern("G4majq G4majh Rq"), 1);		
		partitura.add(new Pattern("F#4majw"), 1);		
		partitura.add(new Pattern("F#4majw"), 1);		
		partitura.add(new Pattern("F#4majw"), 1);		
	}

	@Override
	public void fim() {
	}

}
