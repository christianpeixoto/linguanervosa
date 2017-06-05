package br.com.musicas.opus11.lucille;

import org.jfugue.Pattern;


public class Flautim extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=9000 I[PICCOLO]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void intro() { 
		partitura.add(new Pattern("E6w"), 1);		
		partitura.add(new Pattern("A6h D6h"), 1);		
		partitura.add(new Pattern("E6h F#6h"), 1);		
		partitura.add(new Pattern("D6w"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("E6w"), 1);		
		partitura.add(new Pattern("F#6w"), 1);		
		partitura.add(new Pattern("D6w"), 1);		

		partitura.add(new Pattern("G6wh"), 1);		
		partitura.add(new Pattern("A6h"), 1);		
		partitura.add(new Pattern("F#6h E6q F#6q"), 1);		
		partitura.add(new Pattern("E6q D6q E6h"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("F#6w"), 1);		
		partitura.add(new Pattern("D6h E6h"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("F#6w"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("E6ww"), 1);		
		partitura.add(new Pattern("F#6w"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("D6ww"), 1);		
		
		partitura.add(new Pattern("F#6w"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("E6ww"), 1);		
		partitura.add(new Pattern("F#6w"), 1);		
		partitura.add(new Pattern("A6w"), 1);		
		partitura.add(new Pattern("D6ww"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("E6w"), 1);		
		partitura.add(new Pattern("D6h E6h"), 1);		
		partitura.add(new Pattern("F#6h D6wh"), 1);		
		partitura.add(new Pattern("E6ww"), 1);		
		partitura.add(new Pattern("D6ww"), 1);		
		
		partitura.add(new Pattern("E6w"), 1);		
		partitura.add(new Pattern("D6h E6h"), 1);		
		partitura.add(new Pattern("F#6h D6wh"), 1);		
		partitura.add(new Pattern("E6ww"), 1);		
		partitura.add(new Pattern("D6ww"), 1);		
	}

	@Override
	public void ponte() {	
		partitura.add(new Pattern("E6w"), 1);		
		partitura.add(new Pattern("D6h C6h"), 1);		
		partitura.add(new Pattern("D6w"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("D6w"), 1);		
		partitura.add(new Pattern("C6h B5w"), 1);		
		partitura.add(new Pattern("A5q G5q"), 1);		

		partitura.add(new Pattern("E6w"), 1);		
		partitura.add(new Pattern("D6h C6h"), 1);		
		partitura.add(new Pattern("D6w"), 1);		
		partitura.add(new Pattern("A5w"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("D6w"), 1);		
		partitura.add(new Pattern("C6h B5w"), 1);		
		partitura.add(new Pattern("A5q G5q"), 1);		

		partitura.add(new Pattern("G5ww"), 1);		
		partitura.add(new Pattern("A5ww"), 1);		
		partitura.add(new Pattern("D5ww"), 1);		
		partitura.add(new Pattern("D5ww"), 1);		
	}

	@Override
	public void solo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("D5w"), 1);				
	}

}
