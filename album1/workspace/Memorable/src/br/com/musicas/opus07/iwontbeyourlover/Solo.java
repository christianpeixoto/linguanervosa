package br.com.musicas.opus07.iwontbeyourlover;

import org.jfugue.Pattern;

public class Solo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=9000 I[DISTORTION_GUITAR]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("X[Volume]=6000"), 1);
		
		partitura.add(new Pattern("G5q+D5q+G6q G5q+D5q+G6q G5q+D5q+G6q G5q+D5q+G6q"), 1);		
		partitura.add(new Pattern("E5h+B5h+E6h E5h+B5h+E6h"), 1);		
		partitura.add(new Pattern("C5h+G5h+C6h Rh"), 1);		
		partitura.add(new Pattern("G5h E5q G5q"), 1);		
		partitura.add(new Pattern("D5q+A5q+D6q D5q+A5q+D6q D5q+A5q+D6q D5q+A5q+D6q"), 1);		
		partitura.add(new Pattern("E5h+B5h+E6h E5h+B5h+E6h"), 1);		
		partitura.add(new Pattern("A5h+E5h+A6h Rh"), 1);		
		partitura.add(new Pattern("D5h A5q D5q"), 1);	
		
		partitura.add(new Pattern("X[Volume]=9000"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("G5i B5i D5i B5i G5i B5i D5i B5i"), 1);		
		partitura.add(new Pattern("A5i C5i E5i C5i A5i C5i E5i C5i"), 1);		
		partitura.add(new Pattern("E5i G5i B5i G5i E5i G5i B5i G5i"), 1);		
		partitura.add(new Pattern("C5i E5i G5i E5i D5i F#5i A5i F#5i"), 1);		
		partitura.add(new Pattern("G5i B5i D5i B5i G5i B5i D5i B5i"), 1);		
		partitura.add(new Pattern("A5i C5i E5i C5i A5i C5i E5i C5i"), 1);		
		partitura.add(new Pattern("E5i G5i B5i G5i E5i G5i B5i G5i"), 1);		
		partitura.add(new Pattern("C5i E5i G5i E5i D5i F#5i A5i F#5i"), 1);		
	}
	
	@Override
	public void ponte() {
		partitura.add(new Pattern("C3i E4i G4i C5i G5i C6i E6i C5i"), 1);		
		partitura.add(new Pattern("C5q Rhq"), 1);		
		partitura.add(new Pattern("G3i B4i D4i G5i D6i G6i B6i G6i"), 1);		
		partitura.add(new Pattern("G6q Rhq"), 1);		
		partitura.add(new Pattern("C3i E4i G4i C5i G5i C6i E6i C5i"), 1);		
		partitura.add(new Pattern("C5q Rhq"), 1);		
		partitura.add(new Pattern("G3i B4i D4i G5i D6i G6i B6i D7i"), 1);		
		partitura.add(new Pattern("D7q Rhq"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
	}

	@Override
	public void fim() {
	}

	@Override
	public void solo() {
		partitura.add(new Pattern("G6s B6s D6s A6s C6s E6s G6s A6s G6s A6s G6s D6s C6s F6s E6s D6s"), 1); 		
		partitura.add(new Pattern("G6s D6s C6s B6s A6s F6s G6s B6s A6s C6s E6s C6s D6s G6s E6s F6s"), 1);	
		partitura.add(new Pattern("C6q B6i G6i A6i D6i E6i G6i"), 1);	
		partitura.add(new Pattern("Rw"), 1);	
		partitura.add(new Pattern("D6s E6s A6s B6s G6s F6s C6s D6s B6s F6s G6s E6s D6s C6s G6s F6s"), 1);	
		partitura.add(new Pattern("E6s F6s E6s F6s B6s G6S D6s F6s D6s F6s A6s B6s C6s F6s G6s E6s"), 1);	
		partitura.add(new Pattern("C6q B6i G6i A6i D6i E6i G6i"), 1);	
		partitura.add(new Pattern("Rw Rq"), 1);		
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("G6i B6i D6i A6q D6i B6i E6i"), 1); 	
		partitura.add(new Pattern("B6i E6i G6i B6i F6i G6i E6i C6i"), 1);	
		partitura.add(new Pattern("C6i A6i D6i E6i G6i D6i A6q"), 1);	
		partitura.add(new Pattern("Rw"), 1);	
		partitura.add(new Pattern("D6i F6i A6i B6i D6q F6s E6s F6s E6s"), 1); 
		partitura.add(new Pattern("G6q C6i A6i B6i C6i G6i E6i"), 1); 		
		partitura.add(new Pattern("B6q A6i B6i C6i B6i E6q"), 1);		
		partitura.add(new Pattern("Rw"), 1);	
	}
	
}
