package br.com.musicas.opus15.loveanddeath;

import org.jfugue.Pattern;

public class Guitarra extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=6000 I[DISTORTION_GUITAR]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void solo() {
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("F3q+C4q+F4q F3q+C4q+F4q F3q+C4q+F4q F3q+C4q+F4q"), 1);		
		partitura.add(new Pattern("G3h+D4h+G4h Rq G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("F3q+C4q+F4q F3q+C4q+F4q F3q+C4q+F4q F3q+C4q+F4q"), 1);		
		partitura.add(new Pattern("G3h+D4h+G4h Rq G3q+D4q+G4q"), 1);		
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("F3q+C4q+F4q F3q+C4q+F4q F3q+C4q+F4q F3q+C4q+F4q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("F3q+C4q+F4q F3q+C4q+F4q F3q+C4q+F4q F3q+C4q+F4q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
	}
	

	@Override
	public void fim() {
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
		partitura.add(new Pattern("G3qi+D4qi+G4qi"), 1);
	}

}
