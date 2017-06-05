package br.com.musicas.opus11.lucille;

import org.jfugue.Pattern;

public class Violao extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=10000 I[GUITAR]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("G3q G4q B4q E5q"), 1);		
		partitura.add(new Pattern("G3q G4q D5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q G5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		

		partitura.add(new Pattern("G3q G4q B4q E5q"), 1);		
		partitura.add(new Pattern("G3q G4q D5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q G5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q G4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q G4q C#5q E5q"), 1);		
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q B4q E5q"), 1);		
		partitura.add(new Pattern("A3q G4q C#5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);
		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q B4q E5q"), 1);		
		partitura.add(new Pattern("A3q G4q C#5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("G3q G4q B4q E5q"), 1);		
		partitura.add(new Pattern("G3q G4q B4q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);		
		
		partitura.add(new Pattern("G3q G4q D4q E5q"), 1);		
		partitura.add(new Pattern("G3q G4q D4q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("G3q G4q B4q F5q"), 1);		
		partitura.add(new Pattern("A3q G4q C#5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
	}

	@Override
	public void ponte() {
		partitura.add(new Pattern("G3q G4q D5q E5q"), 1);		
		partitura.add(new Pattern("G3q G4q B4q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q D5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);				
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);				

		partitura.add(new Pattern("G3q G4q D5q E5q"), 1);		
		partitura.add(new Pattern("G3q G4q B4q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q D5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);				
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);				

		partitura.add(new Pattern("G3q G4q D5q E5q"), 1);		
		partitura.add(new Pattern("G3q G4q B4q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q C#5q E5q"), 1);		
		partitura.add(new Pattern("A3q A4q D5q E5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q F#5q"), 1);		
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);				
		partitura.add(new Pattern("D4q A4q D5q E5q"), 1);				
	}

	@Override
	public void solo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("D4majw"), 1);				
	}
	
}
