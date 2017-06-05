package br.com.musicas.opus09.madman;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=12000 I[ELECTRIC_BASS_FINGER]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("B2i D3q Ri F#3q A3q"), 1);
		partitura.add(new Pattern("F#3q E3i E3i F#3i E3i D3q"), 1);
		partitura.add(new Pattern("B2i D3q Ri F#3q A3q"), 1);
		partitura.add(new Pattern("F#3q E3i E3i F#3i E3i D3q"), 1);
		partitura.add(new Pattern("B2i D3q Ri F#3q A3q"), 1);
		partitura.add(new Pattern("F#3q E3i E3i F#3i E3i D3q"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);		
		partitura.add(new Pattern("B2i D3q Ri F#3q A3q"), 1);
		partitura.add(new Pattern("F#3q E3i E3i F#3i E3i D3q"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("D3w"), 1);
		partitura.add(new Pattern("G3i G3q Ri B2i B2q Ri"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("D3i D3q Ri A2i A2q Ri"), 1);
		partitura.add(new Pattern("D3w"), 1);
		partitura.add(new Pattern("G3i G3q Ri B2i B2q Ri"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("D3i D3q Ri A2i A2q Ri"), 1);
		partitura.add(new Pattern("D3w"), 1);
		partitura.add(new Pattern("G3i G3q Ri B2i B2q Ri"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("D3i D3q Ri A2i A2q Ri"), 1);
		partitura.add(new Pattern("D3w"), 1);
		partitura.add(new Pattern("G3i G3q Ri B2i B2q Ri"), 1);
		partitura.add(new Pattern("A3w"), 1);
		partitura.add(new Pattern("D3i D3q Ri A2i A2q Ri"), 1);
	}

	@Override
	public void ponte() {	
		partitura.add(new Pattern("D3w"), 1);		
		partitura.add(new Pattern("C#3w"), 1);		
		partitura.add(new Pattern("B2w"), 1);		
		partitura.add(new Pattern("B2w"), 1);		
		partitura.add(new Pattern("D3w"), 1);		
		partitura.add(new Pattern("C#3w"), 1);		
		partitura.add(new Pattern("B2w"), 1);		
		partitura.add(new Pattern("B2w"), 1);		
		partitura.add(new Pattern("A#2w"), 1);		
		partitura.add(new Pattern("A#2w"), 1);		
		partitura.add(new Pattern("F3q E3q D3q C3q"), 1);		
	}

	@Override
	public void fim() {
	}

}
