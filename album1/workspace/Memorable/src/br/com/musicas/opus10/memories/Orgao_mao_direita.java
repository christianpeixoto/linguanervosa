package br.com.musicas.opus10.memories;

import org.jfugue.Pattern;


public class Orgao_mao_direita extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V3 X[Volume]=10000 I[CHURCH_ORGAN]"));
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
		
		partitura.add(new Pattern("Rh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("E5h B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("F#5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("Rh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("E5h B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("F#5hq F#5q"), 1);
		partitura.add(new Pattern("E5w"), 1);
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
		partitura.add(new Pattern("G#5 E#5q C#5h"), 1);	
		partitura.add(new Pattern("E#5q G#5q C#5h"), 1);	
		partitura.add(new Pattern("F#5q D#5q B5h"), 1);				
		partitura.add(new Pattern("D#5q F#5q B5h"), 1);				
		partitura.add(new Pattern("C#5q A#5q F#5hq"), 1);				
		partitura.add(new Pattern("Rhq"), 1);
		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);				
		partitura.add(new Pattern("G#5 E#5q C#5h"), 1);	
		partitura.add(new Pattern("E#5q G#5q C#5h"), 1);	
		partitura.add(new Pattern("F#5q D#5q B5h"), 1);				
		partitura.add(new Pattern("D#5q F#5q B5h"), 1);				
		partitura.add(new Pattern("C#5q A#5q F#5hq"), 1);				
		partitura.add(new Pattern("Rhq"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("Rh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("Eh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("F#5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("Rh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("Eh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("F#5hq F#5q"), 1);
		partitura.add(new Pattern("E5w"), 1);
		
		partitura.add(new Pattern("Rh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("Eh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("F#5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("Rh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("Eh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("F#5hq F#5q"), 1);
		partitura.add(new Pattern("E5w"), 1);
	}

	@Override
	public void ponte() {		
		partitura.add(new Pattern("E5h Rh"), 1);		
		partitura.add(new Pattern("F#5h Rh"), 1);		
		partitura.add(new Pattern("A5h G#5q A5q"), 1);		
		partitura.add(new Pattern("B5h Rh"), 1);		
		partitura.add(new Pattern("E5h Rh"), 1);		
		partitura.add(new Pattern("F#5h Rh"), 1);		
		partitura.add(new Pattern("A5h Rh"), 1);		
		partitura.add(new Pattern("B5h F5q G5q"), 1);		
		partitura.add(new Pattern("A5ww"), 1);		
		partitura.add(new Pattern("A5ww"), 1);		
		partitura.add(new Pattern("B5w"), 1);		
		partitura.add(new Pattern("B5q C#6q B5q C#6q"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("A5q C#6q F#6q C#6q"), 1);		
		partitura.add(new Pattern("B5w"), 1);		
		partitura.add(new Pattern("B5q C#6q B5q C#6q"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("A5q C#6q F#6q C#6q"), 1);		
		partitura.add(new Pattern("B5w"), 1);		
		partitura.add(new Pattern("B5q C#6q B5q C#6q"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("A5q C#6q F#6q C#6q"), 1);		
		partitura.add(new Pattern("F#5w"), 1);		
		partitura.add(new Pattern("F#5w"), 1);		
	}

	@Override
	public void solo() {		
		partitura.add(new Pattern("Rh B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("E5h B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("B4w"), 1);
		partitura.add(new Pattern("E5i D#5i E5i F#5i A5i G#5i A5i B5i"), 1);
		partitura.add(new Pattern("E5i D#5i E5i F#5i D#5q B4q"), 1);
		partitura.add(new Pattern("E5q B5q F#5q G#5q"), 1);
		partitura.add(new Pattern("D#5hq F#5q"), 1);
		partitura.add(new Pattern("E5w"), 1);
		
		partitura.add(new Pattern("B5q G#5q F#5i D#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("E5h D#5i F#5i D#5i G#5i"), 1);
		partitura.add(new Pattern("B4w"), 1);
		partitura.add(new Pattern("E5i D#5i E5i F#5i A5i G#5i A5i B5i"), 1);
		partitura.add(new Pattern("E5i D#5i E5i F#5i D#5q B4q"), 1);
		partitura.add(new Pattern("E5h B5i G#5i F#5i D#5i"), 1);
		partitura.add(new Pattern("F#5hq F#5q"), 1);
		partitura.add(new Pattern("E5w"), 1);
	}
	
	@Override
	public void fim() {
		partitura.add(new Pattern("E5h Rh"), 1);		
		partitura.add(new Pattern("F#5h Rh"), 1);		
		partitura.add(new Pattern("A5h G#5q A5q"), 1);		
		partitura.add(new Pattern("B5h Rh"), 1);		
		partitura.add(new Pattern("E5h Rh"), 1);		
		partitura.add(new Pattern("F#5h Rh"), 1);		
		partitura.add(new Pattern("A5h Rh"), 1);		
		partitura.add(new Pattern("B5h F5q G5q"), 1);		
		partitura.add(new Pattern("A5ww"), 1);		
		partitura.add(new Pattern("A5ww"), 1);		
		partitura.add(new Pattern("B5w"), 1);		
		partitura.add(new Pattern("B5q C#6q B5q C#6q"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("A5q C#6q F#6q C#6q"), 1);		
		partitura.add(new Pattern("B5w"), 1);		
		partitura.add(new Pattern("B5q C#6q B5q C#6q"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("A5q C#6q F#6q C#6q"), 1);		
		partitura.add(new Pattern("B5w"), 1);		
		partitura.add(new Pattern("B5q C#6q B5q C#6q"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("A5q C#6q F#6q C#6q"), 1);		
		partitura.add(new Pattern("B5w"), 1);		
		partitura.add(new Pattern("B5q C#6q B5q C#6q"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("A5q C#6q F#6q C#6q"), 1);		
		partitura.add(new Pattern("B5w"), 1);		
		partitura.add(new Pattern("B5q C#6q B5q C#6q"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("A5q C#6q F#6q C#6q"), 1);		
		partitura.add(new Pattern("B5w"), 1);		
		partitura.add(new Pattern("B5q C#6q B5q C#6q"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("A5q C#6q F#6q C#6q"), 1);		
	}

}
