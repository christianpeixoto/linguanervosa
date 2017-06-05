package br.com.musicas.opus09.madman;

import org.jfugue.Pattern;


public class Violino extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V3 X[Volume]=8000 I[VIOLIN]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("B6q Rhq"), 1);
		partitura.add(new Pattern("A6q Rhq"), 1);
		partitura.add(new Pattern("B6q Rhq"), 1);
		partitura.add(new Pattern("A6q Rhq"), 1);
		partitura.add(new Pattern("B6q Rhq"), 1);
		partitura.add(new Pattern("A6q Rhq"), 1);
		partitura.add(new Pattern("G6w"), 1);
		partitura.add(new Pattern("A6w"), 1);
		partitura.add(new Pattern("B6q Rhq"), 1);
		partitura.add(new Pattern("A6q Rhq"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("D6w"), 1);
		partitura.add(new Pattern("G6w"), 1);
		partitura.add(new Pattern("A6w"), 1);
		partitura.add(new Pattern("A6q D6q A6q E6q"), 1);
		partitura.add(new Pattern("D6w"), 1);
		partitura.add(new Pattern("G6w"), 1);
		partitura.add(new Pattern("E6ww"), 1);
		partitura.add(new Pattern("D6w"), 1);
		partitura.add(new Pattern("G6w"), 1);
		partitura.add(new Pattern("A6w"), 1);
		partitura.add(new Pattern("A6q D6q A6q E6q"), 1);
		partitura.add(new Pattern("D6w"), 1);
		partitura.add(new Pattern("G6w"), 1);
		partitura.add(new Pattern("E6ww"), 1);
	}

	@Override
	public void ponte() {		
		partitura.add(new Pattern("D7i C7q D7i Rh"), 1);		
		partitura.add(new Pattern("C#7i B6q C#7i Rh"), 1);		
		partitura.add(new Pattern("B6i A6q B6i Rh"), 1);		
		partitura.add(new Pattern("B6i A6q B6i Rh"), 1);		
		partitura.add(new Pattern("D7i C7q D7i Rh"), 1);		
		partitura.add(new Pattern("C#7i B6q C#7i Rh"), 1);		
		partitura.add(new Pattern("B6i A6q B6i Rh"), 1);		
		partitura.add(new Pattern("B6i A6q B6i Rh"), 1);		
		partitura.add(new Pattern("A#6ww"), 1);		
		partitura.add(new Pattern("F7q E7q D7q C7q"), 1);		
	}

	@Override
	public void fim() {
	}

}
