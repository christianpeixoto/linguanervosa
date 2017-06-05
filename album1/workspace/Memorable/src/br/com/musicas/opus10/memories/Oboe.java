package br.com.musicas.opus10.memories;

import org.jfugue.Pattern;


public class Oboe extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=8000 I[OBOE]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void intro() {		
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		
		partitura.add(new Pattern("Rh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("E6h B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("F#6w"), 1);
		partitura.add(new Pattern("E6w"), 1);
		partitura.add(new Pattern("Rh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("E6h B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("F#6hq F#6q"), 1);
		partitura.add(new Pattern("E6w"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("G#6 E#6q C#6h"), 1);	
		partitura.add(new Pattern("E#6q G#6q C#6h"), 1);	
		partitura.add(new Pattern("F#6q D#6q B6h"), 1);				
		partitura.add(new Pattern("D#6q F#6q B6h"), 1);				
		partitura.add(new Pattern("C#6q A#6q F#6hq"), 1);				
		partitura.add(new Pattern("Rhq"), 1);
		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);				
		partitura.add(new Pattern("G#6 E#6q C#6h"), 1);	
		partitura.add(new Pattern("E#6q G#6q C#6h"), 1);	
		partitura.add(new Pattern("F#6q D#6q B6h"), 1);				
		partitura.add(new Pattern("D#6q F#6q B6h"), 1);				
		partitura.add(new Pattern("C#6q A#6q F#6hq"), 1);				
		partitura.add(new Pattern("Rhq"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("Rh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("Eh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("F#6w"), 1);
		partitura.add(new Pattern("E6w"), 1);
		partitura.add(new Pattern("Rh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("Eh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("F#6hq F#6q"), 1);
		partitura.add(new Pattern("E6w"), 1);
		
		partitura.add(new Pattern("Rh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("Eh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("F#6w"), 1);
		partitura.add(new Pattern("E6w"), 1);
		partitura.add(new Pattern("Rh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("Eh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("F#6hq F#6q"), 1);
		partitura.add(new Pattern("E6w"), 1);
	}

	@Override
	public void ponte() {		
		partitura.add(new Pattern("E6h Rh"), 1);		
		partitura.add(new Pattern("F#6h Rh"), 1);		
		partitura.add(new Pattern("A6h G#6q A6q"), 1);		
		partitura.add(new Pattern("B6h Rh"), 1);		
		partitura.add(new Pattern("E6h Rh"), 1);		
		partitura.add(new Pattern("F#6h Rh"), 1);		
		partitura.add(new Pattern("A6h Rh"), 1);		
		partitura.add(new Pattern("B6h F6q G6q"), 1);		
		partitura.add(new Pattern("A6ww"), 1);		
		partitura.add(new Pattern("A6ww"), 1);		
		partitura.add(new Pattern("B6w"), 1);		
		partitura.add(new Pattern("B6q C#7q B6q C#7q"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("A6q C#7q F#7q C#7q"), 1);		
		partitura.add(new Pattern("B6w"), 1);		
		partitura.add(new Pattern("B6q C#7q B6q C#7q"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("A6q C#7q F#7q C#7q"), 1);		
		partitura.add(new Pattern("B6w"), 1);		
		partitura.add(new Pattern("B6q C#7q B6q C#7q"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("A6q C#7q F#7q C#7q"), 1);		
		partitura.add(new Pattern("F#6w"), 1);		
		partitura.add(new Pattern("F#6w"), 1);		
	}

	@Override
	public void solo() {		
		partitura.add(new Pattern("Rh B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("E6h B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("B5w"), 1);
		partitura.add(new Pattern("E6i D#6i E6i F#6i A6i G#6i A6i B6i"), 1);
		partitura.add(new Pattern("E6i D#6i E6i F#6i D#6q B5q"), 1);
		partitura.add(new Pattern("E6q B6q F#6q G#6q"), 1);
		partitura.add(new Pattern("D#6hq F#6q"), 1);
		partitura.add(new Pattern("E6w"), 1);
		
		partitura.add(new Pattern("B6q G#6q F#6i D#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("E6h D#6i F#6i D#6i G#6i"), 1);
		partitura.add(new Pattern("B5w"), 1);
		partitura.add(new Pattern("E6i D#6i E6i F#6i A6i G#6i A6i B6i"), 1);
		partitura.add(new Pattern("E6i D#6i E6i F#6i D#6q B5q"), 1);
		partitura.add(new Pattern("E6h B6i G#6i F#6i D#6i"), 1);
		partitura.add(new Pattern("F#6hq F#6q"), 1);
		partitura.add(new Pattern("E6w"), 1);
	}
	
	@Override
	public void fim() {
		partitura.add(new Pattern("E6h Rh"), 1);		
		partitura.add(new Pattern("F#6h Rh"), 1);		
		partitura.add(new Pattern("A6h G#6q A6q"), 1);		
		partitura.add(new Pattern("B6h Rh"), 1);		
		partitura.add(new Pattern("E6h Rh"), 1);		
		partitura.add(new Pattern("F#6h Rh"), 1);		
		partitura.add(new Pattern("A6h Rh"), 1);		
		partitura.add(new Pattern("B6h F6q G6q"), 1);		
		partitura.add(new Pattern("A6ww"), 1);		
		partitura.add(new Pattern("A6ww"), 1);		
		partitura.add(new Pattern("B6w"), 1);		
		partitura.add(new Pattern("B6q C#7q B6q C#7q"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("A6q C#7q F#7q C#7q"), 1);		
		partitura.add(new Pattern("B6w"), 1);		
		partitura.add(new Pattern("B6q C#7q B6q C#7q"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("A6q C#7q F#7q C#7q"), 1);		
		partitura.add(new Pattern("B6w"), 1);		
		partitura.add(new Pattern("B6q C#7q B6q C#7q"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("A6q C#7q F#7q C#7q"), 1);		
		partitura.add(new Pattern("B6w"), 1);		
		partitura.add(new Pattern("B6q C#7q B6q C#7q"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("A6q C#7q F#7q C#7q"), 1);		
		partitura.add(new Pattern("B6w"), 1);		
		partitura.add(new Pattern("B6q C#7q B6q C#7q"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("A6q C#7q F#7q C#7q"), 1);		
		partitura.add(new Pattern("B6w"), 1);		
		partitura.add(new Pattern("B6q C#7q B6q C#7q"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("A6q C#7q F#7q C#7q"), 1);		
	}

}
