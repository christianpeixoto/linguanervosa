package br.com.musicas.opus16.kindoflove;

import org.jfugue.Pattern;

public class Guitarra extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=6000 I[ELECTRIC_CLEAN_GUITAR] X[CHORUS_LEVEL]=64"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);

		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);

		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("D4maji D4maji Rq"), 1);
		partitura.add(new Pattern("Rh"), 1);
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("D4maji D4maji Rq"), 1);
		partitura.add(new Pattern("Rh"), 1);

		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
	}

	@Override
	public void solo() {
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("D4maji D4maji Rq"), 1);
		partitura.add(new Pattern("Rh"), 1);

		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);

		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);
		partitura.add(new Pattern("D4maji D4maji D4maji D4maji"), 1);
		partitura.add(new Pattern("C4maji C4maji C4maji C4maji"), 1);
		partitura.add(new Pattern("G3maji G3maji G3maji G3maji"), 1);
		partitura.add(new Pattern("A3maji A3maji A3maji A3maji"), 1);		
	}

}
