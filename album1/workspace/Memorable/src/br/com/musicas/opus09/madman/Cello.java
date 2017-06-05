package br.com.musicas.opus09.madman;

import org.jfugue.Pattern;


public class Cello extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V4 X[Volume]=11000 I[CELLO]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("B3q Rhq"), 1);
		partitura.add(new Pattern("A3q Rhq"), 1);
		partitura.add(new Pattern("B3q Rhq"), 1);
		partitura.add(new Pattern("A3q Rhq"), 1);
		partitura.add(new Pattern("B3q Rhq"), 1);
		partitura.add(new Pattern("A3q Rhq"), 1);
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("B3q Rhq"), 1);
		partitura.add(new Pattern("A3q Rhq"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("D4w"), 1);
		partitura.add(new Pattern("G4w"), 1);
		partitura.add(new Pattern("A4w"), 1);
		partitura.add(new Pattern("A4q D4q A4q E4q"), 1);
		partitura.add(new Pattern("D4w"), 1);
		partitura.add(new Pattern("G4w"), 1);
		partitura.add(new Pattern("E4ww"), 1);
		partitura.add(new Pattern("D4w"), 1);
		partitura.add(new Pattern("G4w"), 1);
		partitura.add(new Pattern("A4w"), 1);
		partitura.add(new Pattern("A4q D4q A4q E4q"), 1);
		partitura.add(new Pattern("D4w"), 1);
		partitura.add(new Pattern("G4w"), 1);
		partitura.add(new Pattern("E4ww"), 1);
	}

	@Override
	public void ponte() {		
		partitura.add(new Pattern("D4i C4q D4i Rh"), 1);		
		partitura.add(new Pattern("C#4i B3q C#4i Rh"), 1);		
		partitura.add(new Pattern("B3i A3q B3i Rh"), 1);		
		partitura.add(new Pattern("B3i A3q B3i Rh"), 1);		
		partitura.add(new Pattern("D4i C4q D4i Rh"), 1);		
		partitura.add(new Pattern("C#4i B3q C#4i Rh"), 1);		
		partitura.add(new Pattern("B3i A3q B3i Rh"), 1);		
		partitura.add(new Pattern("B3i A3q B3i Rh"), 1);		
		partitura.add(new Pattern("A#3ww"), 1);		
		partitura.add(new Pattern("F4q E4q D4q C4q"), 1);			
	}

	@Override
	public void fim() {
	}

}
