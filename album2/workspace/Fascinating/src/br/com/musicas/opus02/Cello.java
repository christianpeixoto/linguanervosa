package br.com.musicas.opus02;

import org.jfugue.Pattern;


public class Cello extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=8000 I[TENOR_SAX]"));		
	}

	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("E3whi"));
		partitura.add(new Pattern("E3whi"));
		partitura.add(new Pattern("A3whi"));
		partitura.add(new Pattern("A3whi"));
		partitura.add(new Pattern("E3whi"));
		partitura.add(new Pattern("E3whi"));
		partitura.add(new Pattern("A3whi"));
		partitura.add(new Pattern("A3whi"));
		
		partitura.add(new Pattern("A3whi"));
		partitura.add(new Pattern("A3whi"));
		
		partitura.add(new Pattern("A3whi"));
		partitura.add(new Pattern("A3q Ri F#3q C#4q B3q A3q F#3q Ri"));		
	}
	
	@Override
	public void segundaParte() {
		partitura.add(new Pattern("E3w Rhi"));
		partitura.add(new Pattern("E3w Rhi"));
		partitura.add(new Pattern("A3w Rhi"));
		partitura.add(new Pattern("A3w Rhi"));
		partitura.add(new Pattern("E3w Rhi"));
		partitura.add(new Pattern("E3w Rhi"));
		partitura.add(new Pattern("A3w Rhi"));
		partitura.add(new Pattern("A3w Rhi"));
		
		partitura.add(new Pattern("E3w Rhi"));
		partitura.add(new Pattern("E3w Rhi"));
		partitura.add(new Pattern("A3w Rhi"));
		partitura.add(new Pattern("A3w Rhi"));
		partitura.add(new Pattern("E3w Rhi"));
		partitura.add(new Pattern("E3w Rhi"));
		partitura.add(new Pattern("A3w Rhi"));
		partitura.add(new Pattern("A3w Rhi"));
		
		partitura.add(new Pattern("A3w Rhi"));
		partitura.add(new Pattern("A3w Rhi"));
		
		partitura.add(new Pattern("A3w Rhi"));
		partitura.add(new Pattern("A3q Ri F#3q C#4q B3q A3q F#3q Ri"));		
	}

	@Override
	public void fim() {
	}

}
