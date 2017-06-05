package br.com.musicas.opus11.lucille;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=12000 I[CELLO]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void intro() {
		partitura.add(new Pattern("G3ww"), 1);		
		partitura.add(new Pattern("D3ww"), 1);		
		partitura.add(new Pattern("A3ww"), 1);		
		partitura.add(new Pattern("D3ww"), 1);		

		partitura.add(new Pattern("G3ww"), 1);		
		partitura.add(new Pattern("D3ww"), 1);		
		partitura.add(new Pattern("A3ww"), 1);		
		partitura.add(new Pattern("A3ww"), 1);		
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("D3ww"), 1);		
		partitura.add(new Pattern("A3ww"), 1);		
		partitura.add(new Pattern("A3ww"), 1);		
		partitura.add(new Pattern("D3ww"), 1);		
		
		partitura.add(new Pattern("D3ww"), 1);		
		partitura.add(new Pattern("A3ww"), 1);		
		partitura.add(new Pattern("A3ww"), 1);		
		partitura.add(new Pattern("D3ww"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("G3ww"), 1);		
		partitura.add(new Pattern("A3ww"), 1);		
		partitura.add(new Pattern("D3ww"), 1);		
		partitura.add(new Pattern("D3ww"), 1);		
		
		partitura.add(new Pattern("G3ww"), 1);		
		partitura.add(new Pattern("A3ww"), 1);		
		partitura.add(new Pattern("G3w"), 1);		
		partitura.add(new Pattern("A3w"), 1);		
		partitura.add(new Pattern("D3ww"), 1);		
	}

	@Override
	public void ponte() {
		partitura.add(new Pattern("B3w"), 1);		
		partitura.add(new Pattern("A3h G3h"), 1);		
		partitura.add(new Pattern("A3w"), 1);		
		partitura.add(new Pattern("E3w"), 1);		
		partitura.add(new Pattern("D3w"), 1);		
		partitura.add(new Pattern("A3w"), 1);		
		partitura.add(new Pattern("G3h F#3w"), 1);		
		partitura.add(new Pattern("E3q D3q"), 1);	
		
		partitura.add(new Pattern("B3w"), 1);		
		partitura.add(new Pattern("A3h G3h"), 1);		
		partitura.add(new Pattern("A3w"), 1);		
		partitura.add(new Pattern("E3w"), 1);		
		partitura.add(new Pattern("D3w"), 1);		
		partitura.add(new Pattern("A3w"), 1);		
		partitura.add(new Pattern("G3h F#3w"), 1);		
		partitura.add(new Pattern("E3q D3q"), 1);	

		partitura.add(new Pattern("G3ww"), 1);		
		partitura.add(new Pattern("A3ww"), 1);		
		partitura.add(new Pattern("D3ww"), 1);		
		partitura.add(new Pattern("D3ww"), 1);		
	}

	@Override
	public void solo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("D3w"), 1);		
	}

}
