package br.com.musicas.opus10.memories;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=11000 I[CONTRABASS]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void intro() {		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2ww"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("B2ww"), 1);		
		partitura.add(new Pattern("G2i A2i A2hq"), 1);		
		partitura.add(new Pattern("D2i E2i E2hq"), 1);		
		partitura.add(new Pattern("F#2ww"), 1);		
		partitura.add(new Pattern("G2i A2i A2hq"), 1);		
		partitura.add(new Pattern("D2i E2i E2hq"), 1);		
		partitura.add(new Pattern("B2ww"), 1);		
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);				
		partitura.add(new Pattern("C#2ww"), 1);				
		partitura.add(new Pattern("B2ww"), 1);				
		partitura.add(new Pattern("F#2w"), 1);				
		partitura.add(new Pattern("Rw"), 1);
		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);				
		partitura.add(new Pattern("C#2ww"), 1);				
		partitura.add(new Pattern("B2ww"), 1);				
		partitura.add(new Pattern("F#2w"), 1);				
		partitura.add(new Pattern("Rw"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2ww"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("B2ww"), 1);		
		partitura.add(new Pattern("G2i A2i A2hq"), 1);		
		partitura.add(new Pattern("D2i E2i E2hq"), 1);		
		partitura.add(new Pattern("F#2ww"), 1);		
		partitura.add(new Pattern("G2i A2i A2hq"), 1);		
		partitura.add(new Pattern("D2i E2i E2hq"), 1);		
		partitura.add(new Pattern("B2ww"), 1);		
	}

	@Override
	public void ponte() {	
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("B2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("B2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("D2q D2q C2q B2q"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2q A2q G2q F#2q"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("D2q D2q C2q B2q"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2q A2q G2q F#2q"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("D2q D2q C2q B2q"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2q A2q G2q F#2q"), 1);		
		partitura.add(new Pattern("F#2w"), 1);		
		partitura.add(new Pattern("F#2w"), 1);		
	}

	@Override
	public void solo() {		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2ww"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("B2ww"), 1);		
		partitura.add(new Pattern("G2i A2i A2hq"), 1);		
		partitura.add(new Pattern("D2i E2i E2hq"), 1);		
		partitura.add(new Pattern("F#2ww"), 1);		
		partitura.add(new Pattern("G2i A2i A2hq"), 1);		
		partitura.add(new Pattern("D2i E2i E2hq"), 1);		
		partitura.add(new Pattern("B2ww"), 1);		
	}
	
	@Override
	public void fim() {
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("B2w"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("F#2w"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("B2w"), 1);		
		partitura.add(new Pattern("A2ww"), 1);		
		partitura.add(new Pattern("A2ww"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("D2q D2q C2q B2q"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2q A2q G2q F#2q"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("D2q D2q C2q B2q"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2q A2q G2q F#2q"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("D2q D2q C2q B2q"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2q A2q G2q F#2q"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("D2q D2q C2q B2q"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2q A2q G2q F#2q"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("D2q D2q C2q B2q"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2q A2q G2q F#2q"), 1);		
		partitura.add(new Pattern("E2w"), 1);		
		partitura.add(new Pattern("D2q D2q C2q B2q"), 1);		
		partitura.add(new Pattern("A2w"), 1);		
		partitura.add(new Pattern("A2q A2q G2q F#2q"), 1);		
	}

}
