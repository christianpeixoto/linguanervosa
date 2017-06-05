package br.com.musicas.opus15.loveanddeath;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=10000 I[ELECTRIC_BASS_PICK] X[SOUND_TIMBRE]=0"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void solo() {
		partitura.add(new Pattern("C3q C3q D3q A2q"), 1);		
		partitura.add(new Pattern("G2q G2q G2q G2q"), 1);		
		partitura.add(new Pattern("C3q C3q D3q A2q"), 1);		
		partitura.add(new Pattern("G2q G2q G2q G2q"), 1);		
		partitura.add(new Pattern("C3q C3q D3q A2q"), 1);		
		partitura.add(new Pattern("G2q G2q G2q G2q"), 1);		
		partitura.add(new Pattern("F2q F2q F2q A2q"), 1);		
		partitura.add(new Pattern("G2q G2q G2q G2q"), 1);		
		partitura.add(new Pattern("C3q C3q D3q A2q"), 1);		
		partitura.add(new Pattern("G2q G2q G2q G2q"), 1);		
		partitura.add(new Pattern("C3q C3q D3q A2q"), 1);		
		partitura.add(new Pattern("G2q G2q G2q G2q"), 1);		
		partitura.add(new Pattern("C3q C3q D3q A2q"), 1);		
		partitura.add(new Pattern("G2q G2q G2q G2q"), 1);		
		partitura.add(new Pattern("F2q F2q F2q A2q"), 1);		
		partitura.add(new Pattern("G2q G2q G2q G2q"), 1);		
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("F2q F2q F2q F#2q"), 1);		
		partitura.add(new Pattern("G2q G2q G2q G2q"), 1);		
		partitura.add(new Pattern("F2q F2q F2q F#2q"), 1);		
		partitura.add(new Pattern("G2q G2q G2q G2q"), 1);		
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
		partitura.add(new Pattern("G2qi"), 1);
	}

}
