package br.com.musicas.opus17.timetodie;

import org.jfugue.Pattern;

public class Cordas extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V4 X[Volume]=10000 I[STRING_ENSEMBLE_1]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);

		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
	}

	@Override //G A B D E
	public void estrofe() {
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
		
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
		partitura.add(new Pattern("Rww"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		
		partitura.add(new Pattern("D5w"), 1);
		partitura.add(new Pattern("A5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("D5w"), 1);
		partitura.add(new Pattern("A5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("D5w"), 1);
		partitura.add(new Pattern("A5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
	}

	@Override
	public void solo() {
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("D5w"), 1);
		partitura.add(new Pattern("A5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("D5w"), 1);
		partitura.add(new Pattern("A5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("D5w"), 1);
		partitura.add(new Pattern("A5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
	}

}
