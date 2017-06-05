package br.com.musicas.opus12.todayyourlove;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=10000 I[ELECTRIC_BASS_PICK]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void refrao() {
		partitura.add(new Pattern("C3q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("B2q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("C3q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("B2q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("C3q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("B2q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("C3q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("B2q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("C3q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("B2q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("C3q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("B2q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("C3q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("B2q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("C3q. C3q C3i C3i C3i"), 1);		
		partitura.add(new Pattern("B2q. C3q C3i C3i C3i"), 1);		
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("A2q. A2q A2i A2i A2i"), 1);		
		partitura.add(new Pattern("F2q. F2q F2i F2i F2i"), 1);		
		partitura.add(new Pattern("G2q. G2q G2i G2i G2i"), 1);		
		partitura.add(new Pattern("G2q. G2q G2i G2i G2i"), 1);		
		partitura.add(new Pattern("A2q. A2q A2i A2i A2i"), 1);		
		partitura.add(new Pattern("F2q. F2q F2i F2i F2i"), 1);		
		partitura.add(new Pattern("G2q. G2q G2i G2i G2i"), 1);		
		partitura.add(new Pattern("G2q. G2q G2i G2i G2i"), 1);		
		partitura.add(new Pattern("A2q. A2q A2i A2i A2i"), 1);		
		partitura.add(new Pattern("F2q. F2q F2i F2i F2i"), 1);		
		partitura.add(new Pattern("G2q. G2q G2i G2i G2i"), 1);		
		partitura.add(new Pattern("G2q. G2q G2i G2i G2i"), 1);		
		partitura.add(new Pattern("A2q. A2q A2i A2i A2i"), 1);		
		partitura.add(new Pattern("F2q. F2q F2i F2i F2i"), 1);		
		partitura.add(new Pattern("G2q. G2q G2i G2i G2i"), 1);		
		partitura.add(new Pattern("G2q. G2q G2i G2i G2i"), 1);		
	}

	@Override
	public void fim() {
	}

	@Override
	public void ponte() {
		partitura.add(new Pattern("Rq E2q A2q D3q"), 1);
	}

}
