package br.com.musicas.opus03;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=9000 I[ACOUSTIC_BASS]"));
	}
	
	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("Ri Ri Ri Ri Rq"), 2);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q"), 6);
		partitura.add(new Pattern("Ri C3i C3i F3i G3q"), 3);
		partitura.add(new Pattern("Ri C3i C3i F3i G3q"), 1);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q"), 4);
		partitura.add(new Pattern("Ri D3i D3i A3i G3q"), 2); 
		partitura.add(new Pattern("Ri C3i C3i G3i F3q"), 2);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q"), 4);
	}

	@Override
	public void segundaParte() {
		partitura.add(new Pattern("Ri G2i G2i C3i D3q"), 8);
		partitura.add(new Pattern("Ri C3i C3i F3i G3q"), 3);
		partitura.add(new Pattern("I[SLAP_BASS_2] Ri C3ia80 C3ia80 F3ia80 G3qa80"), 1);
		partitura.add(new Pattern("I[ACOUSTIC_BASS] Ri G2i G2i C3i D3q"), 4);
		partitura.add(new Pattern("Ri D3i D3i A3i G3q"), 2); 
		partitura.add(new Pattern("Ri C3i C3i G3i F3q"), 2);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q"), 4);
	}

	@Override
	public void terceiraParte() {
		partitura.add(new Pattern("Ri G2i G2i C3i D3q F3q D3i C3i G2q"), 4);
		partitura.add(new Pattern("Ri C3i C3i F3i G3q A#3q G3i F3i C3q"), 2);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q F3q D3i C3i G2q"), 2);
		partitura.add(new Pattern("Ri D3i D3i A3i G3q"), 2); 
		partitura.add(new Pattern("Ri C3i C3i G3i F3q"), 2);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q F3q D3i C3i G2q"), 2);
	}

	@Override
	public void quartaParte() {
		partitura.add(new Pattern("Ri G2i G2i C3i D3q F3q D3i C3i G2q"), 4);
		partitura.add(new Pattern("Ri C3i C3i F3i G3q"), 3);
		partitura.add(new Pattern("I[SLAP_BASS_2] Ri C3ia80 C3ia80 F3ia80 G3qa80"), 1);
		partitura.add(new Pattern("I[ACOUSTIC_BASS] Ri G2i G2i C3i D3q B2i* C3i* D3i* B2i* C3i* D3i* Rq"), 2);
		partitura.add(new Pattern("Ri D3i D3i A3i G3q A3i G3q A3i G3q"), 1); 
		partitura.add(new Pattern("Ri C3i C3i G3i F3q G3i F3q G3i F3q"), 1);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q"), 4);
	}

	@Override
	public void quintaParte() {
		partitura.add(new Pattern("Ri G2i G2i C3i D3q F3q D3i C3i G2q"), 4);
		partitura.add(new Pattern("Ri C3i C3i F3i G3q A#3q G3i F3i C3q"), 2);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q F3q D3i C3i G2q"), 2);
		partitura.add(new Pattern("Ri D3i D3i A3i G3q"), 2); 
		partitura.add(new Pattern("Ri C3i C3i G3i F3q"), 2);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q F3q D3i C3i G2q"), 1);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q"), 1);
		partitura.add(new Pattern("Ri G2i G2i C3i D3q"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Ri Ri Ri D3qa80d0"));
	}

}
