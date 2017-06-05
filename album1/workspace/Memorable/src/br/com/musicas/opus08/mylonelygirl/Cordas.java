package br.com.musicas.opus08.mylonelygirl;

import org.jfugue.Pattern;


public class Cordas extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=8000 I[STRING_ENSEMBLE_1]"));
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
		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("Rw"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("F#6ww"), 1);
		partitura.add(new Pattern("G6ww"), 1);
		
		partitura.add(new Pattern("F#6w Rq D7q A6q F#6q"), 1);
		partitura.add(new Pattern("G6ww"), 1);
	}

	@Override
	public void fim() {
	}	

}
