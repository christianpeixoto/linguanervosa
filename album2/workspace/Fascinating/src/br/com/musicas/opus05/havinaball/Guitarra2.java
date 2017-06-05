package br.com.musicas.opus05.havinaball;

import org.jfugue.Pattern;

public class Guitarra2 extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=6000 I[DISTORTION_GUITAR]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q"), 1);		
		partitura.add(new Pattern("G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q"), 1);		
		partitura.add(new Pattern("G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q"), 1);		
		partitura.add(new Pattern("G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q"), 1);		
		partitura.add(new Pattern("G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q"), 1);		
		partitura.add(new Pattern("G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q"), 1);		
		partitura.add(new Pattern("G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q"), 1);		
		partitura.add(new Pattern("G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("C5q+G6q+C6q C5q+G6q+C6q C5q+G6q+C6q C5q+G6q+C6q"), 1);		
		partitura.add(new Pattern("C5q+G6q+C6q C5q+G6q+C6q C5q+G6q+C6q C5q+G6q+C6q"), 1);		
		partitura.add(new Pattern("G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q"), 1);		
		partitura.add(new Pattern("G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q G4q+D5q+G5q"), 1);		
	}
	

	@Override
	public void fim() {
		partitura.add(new Pattern("Rq Rq"), 1);
		partitura.add(new Pattern("G4majq"), 1);
	}

}
