package br.com.musicas.opus08.mylonelygirl;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=11000 I[CELLO]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void intro() {
		partitura.add(new Pattern("G3w"), 1);		
		partitura.add(new Pattern("D3w"), 1);		
		partitura.add(new Pattern("C3hq E3i E3i E3i Ri B3i B3i B3i Ri G3i G3i G3w"), 1);		
		partitura.add(new Pattern("A3w"), 1);		
		partitura.add(new Pattern("C3w"), 1);
		partitura.add(new Pattern("B3i A3i G3i Ri B3i A3i G3i Ri"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("G3w"), 1);		
		partitura.add(new Pattern("D3w"), 1);		
		partitura.add(new Pattern("C3hq E3i E3i E3i Ri B3i B3i B3i Ri G3i G3i G3w"), 1);		
		partitura.add(new Pattern("A3w"), 1);		
		partitura.add(new Pattern("C3w"), 1);
		partitura.add(new Pattern("B3i A3i G3i Ri B3i A3i G3i Ri"), 1);
		
		partitura.add(new Pattern("G3w"), 1);		
		partitura.add(new Pattern("D3w"), 1);		
		partitura.add(new Pattern("C3hq E3i E3i E3i Ri B3i B3i B3i Ri G3i G3i G3w"), 1);		
		partitura.add(new Pattern("A3w"), 1);		
		partitura.add(new Pattern("C3w"), 1);
		partitura.add(new Pattern("C3q G3q A3h"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("D3ww"), 1);
		partitura.add(new Pattern("C3ww"), 1);
		
		partitura.add(new Pattern("D3ww"), 1);
		partitura.add(new Pattern("C3ww"), 1);
	}

	@Override
	public void fim() {
	}	

}
