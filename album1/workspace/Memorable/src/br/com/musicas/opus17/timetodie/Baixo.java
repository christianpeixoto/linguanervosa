package br.com.musicas.opus17.timetodie;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=10000 I[CONTRABASS]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("G3w E3w"), 1);
		partitura.add(new Pattern("D3w B2w"), 1);
		partitura.add(new Pattern("G3w E3w"), 1);
		partitura.add(new Pattern("D3w B2w"), 1);

		partitura.add(new Pattern("A2w D3w"), 1);
		partitura.add(new Pattern("E3ww"), 1);
		partitura.add(new Pattern("A2w D3w"), 1);
		partitura.add(new Pattern("E3ww"), 1);
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("G3w E3w"), 1);
		partitura.add(new Pattern("D3w B2w"), 1);
		partitura.add(new Pattern("G3w E3w"), 1);
		partitura.add(new Pattern("D3w B2w"), 1);

		partitura.add(new Pattern("A2w D3w"), 1);
		partitura.add(new Pattern("E3ww"), 1);
		partitura.add(new Pattern("A2w D3w"), 1);
		partitura.add(new Pattern("E3ww"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("F#3w"), 1);
		partitura.add(new Pattern("E3w"), 1);
		partitura.add(new Pattern("E3w"), 1);
		
		partitura.add(new Pattern("D4w"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("E4ww"), 1);
		partitura.add(new Pattern("D4w"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("E4ww"), 1);
		partitura.add(new Pattern("D4w"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("E4ww"), 1);
	}

	@Override
	public void solo() {
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("D4w"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("E4ww"), 1);
		partitura.add(new Pattern("D4w"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("E4ww"), 1);
		partitura.add(new Pattern("D4w"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("E4ww"), 1);
	}
	
}
