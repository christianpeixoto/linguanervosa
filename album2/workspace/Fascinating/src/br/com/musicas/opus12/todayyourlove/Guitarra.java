package br.com.musicas.opus12.todayyourlove;

import org.jfugue.Pattern;

public class Guitarra extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=6000 I[DISTORTION_GUITAR]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void refrao() {
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
		partitura.add(new Pattern("G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q G3q+D4q+G4q"), 1);		
		partitura.add(new Pattern("C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q C4q+G4q+C5q"), 1);		
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q"), 1);		
		partitura.add(new Pattern("A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q"), 1);		
		partitura.add(new Pattern("D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q"), 1);				
		partitura.add(new Pattern("D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q"), 1);				
		partitura.add(new Pattern("A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q"), 1);		
		partitura.add(new Pattern("A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q"), 1);		
		partitura.add(new Pattern("D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q"), 1);				
		partitura.add(new Pattern("D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q"), 1);				
		partitura.add(new Pattern("A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q"), 1);		
		partitura.add(new Pattern("A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q"), 1);		
		partitura.add(new Pattern("D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q"), 1);				
		partitura.add(new Pattern("D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q"), 1);				
		partitura.add(new Pattern("A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q"), 1);		
		partitura.add(new Pattern("A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q A3q+E4q+A4q"), 1);		
		partitura.add(new Pattern("D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q"), 1);				
		partitura.add(new Pattern("D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q D4q+A4q+D5q"), 1);				
	}
	

	@Override
	public void fim() {
	}

	@Override
	public void ponte() {
		partitura.add(new Pattern("Rq E4q+B4q+E5q A3q+E4q+A4q D4q+A4q+D5q"), 1);
	}
	
}
