package br.com.musicas.opus11.lucille;

import org.jfugue.Pattern;


public class Pandeireta extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V9 X[Volume]=10000"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void intro() {
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		

		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
	}

	@Override
	public void ponte() {
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		

		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
		partitura.add(new Pattern("[TAMBOURINE]ww"), 1);		
	}

	@Override
	public void solo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("[TAMBOURINE]w"), 1);		
	}

}
