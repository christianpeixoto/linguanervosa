package br.com.musicas.opus13.nina;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=10000 I[CELLO]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("D3w"), 1);
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("G3w"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("A3w"), 1); 
		partitura.add(new Pattern("D3w"), 1);

		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  

		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3h Ri D3i E3i F#3i"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3w"), 1);  
		
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("G3w"), 1);
	}

	@Override
	public void solo() {
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("G3w"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("A3w"), 1); 
		partitura.add(new Pattern("D3w"), 1);

		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  

		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3h Ri D3i E3i F#3i"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3w"), 1);  
		
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("C3w"), 1);  
		partitura.add(new Pattern("D3w"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("G3w"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("G3w"), 1);

		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("C3h"), 1);  
		partitura.add(new Pattern("D3h"), 1);  
		partitura.add(new Pattern("G3w"), 1);
	}
		
}
