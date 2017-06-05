package br.com.musicas.opus07.iwontbeyourlover;

import org.jfugue.Pattern;

public class Coro extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V3 X[Volume]=7000 I[VOICE_OOHS]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
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
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("G4majw"), 1);		
		partitura.add(new Pattern("A4minw"), 1);		
		partitura.add(new Pattern("E4minw"), 1);		
		partitura.add(new Pattern("C4majh D4majh"), 1);		
		partitura.add(new Pattern("G4majw"), 1);		
		partitura.add(new Pattern("A4minw"), 1);		
		partitura.add(new Pattern("E4minw"), 1);		
		partitura.add(new Pattern("C4majh D4majh"), 1);
	}

	@Override
	public void ponte() {
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
	public void fim() {
	}

	@Override
	public void solo() {
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
	
}
