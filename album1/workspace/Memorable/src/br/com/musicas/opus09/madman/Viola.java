package br.com.musicas.opus09.madman;

import org.jfugue.Pattern;


public class Viola extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=9000 I[VIOLA]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
		
	@Override
	public void estrofe() {
		partitura.add(new Pattern("B4q Rhq"), 1);
		partitura.add(new Pattern("A4q Rhq"), 1);
		partitura.add(new Pattern("B4q Rhq"), 1);
		partitura.add(new Pattern("A4q Rhq"), 1);
		partitura.add(new Pattern("B4q Rhq"), 1);
		partitura.add(new Pattern("A4q Rhq"), 1);
		partitura.add(new Pattern("G4w"), 1);
		partitura.add(new Pattern("A4w"), 1);
		partitura.add(new Pattern("B4q Rhq"), 1);
		partitura.add(new Pattern("A4q Rhq"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("D5w"), 1);
		partitura.add(new Pattern("G5w"), 1);
		partitura.add(new Pattern("A5w"), 1);
		partitura.add(new Pattern("A5q D5q A5q E5q"), 1);
		partitura.add(new Pattern("D5w"), 1);
		partitura.add(new Pattern("G5w"), 1);
		partitura.add(new Pattern("E5ww"), 1);
		partitura.add(new Pattern("D5w"), 1);
		partitura.add(new Pattern("G5w"), 1);
		partitura.add(new Pattern("A5w"), 1);
		partitura.add(new Pattern("A5q D5q A5q E5q"), 1);
		partitura.add(new Pattern("D5w"), 1);
		partitura.add(new Pattern("G5w"), 1);
		partitura.add(new Pattern("E5ww"), 1);
	}

	@Override
	public void ponte() {			
		partitura.add(new Pattern("D5i C5q D5i Rh"), 1);		
		partitura.add(new Pattern("C#5i B4q C#5i Rh"), 1);		
		partitura.add(new Pattern("B4i A4q B4i Rh"), 1);		
		partitura.add(new Pattern("B4i A4q B4i Rh"), 1);		
		partitura.add(new Pattern("D5i C5q D5i Rh"), 1);		
		partitura.add(new Pattern("C#5i B4q C#5i Rh"), 1);		
		partitura.add(new Pattern("B4i A4q B4i Rh"), 1);		
		partitura.add(new Pattern("B4i A4q B4i Rh"), 1);		
		partitura.add(new Pattern("A#4ww"), 1);		
		partitura.add(new Pattern("F5q E5q D5q C5q"), 1);			
	}
	 
	@Override
	public void fim() {
	}

}
