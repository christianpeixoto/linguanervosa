package br.com.musicas.opus05.havinaball;

import org.jfugue.Pattern;

public class Guitarra extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=7000 I[OVERDRIVEN_GUITAR]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("C4q+G5q+C5q C4q+G5q+C5q C4q+G5q+C5q C4q+G5q+C5q"), 1);		
		partitura.add(new Pattern("C4q+G5q+C5q C4q+G5q+C5q C4q+G5q+C5q C4q+G5q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
	}
	

	@Override
	public void fim() {
		partitura.add(new Pattern("Rq Rq"), 1);
		partitura.add(new Pattern("G4majq"), 1);
	}

}
