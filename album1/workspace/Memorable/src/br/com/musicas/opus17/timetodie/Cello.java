package br.com.musicas.opus17.timetodie;

import org.jfugue.Pattern;


public class Cello extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V3 X[Volume]=10000 I[CELLO]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("G3i A3i B3i D4i E4i B3i A3i G3i E4i G3i G3i A3i B3i A3i G3i E4i"), 1);
		partitura.add(new Pattern("D4i D4i B3i A3i G3i E4i B3i A3i B3i D3i G3i E4i E4i D4i A3i G3i"), 1);
		partitura.add(new Pattern("G3i A3i B3i D4i E4i B3i A3i G3i E4i G3i G3i A3i B3i A3i G3i E3i"), 1);
		partitura.add(new Pattern("D4i D4i B3i A3i G3i E4i B3i A3i B3i D3i G3i E4i E4i D4i A3i G3i"), 1);
		
		partitura.add(new Pattern("B3i B3i D4i E4i F#4i G4i D4i E4i A3i A3i B3i G3i E3i D3i B3i B3i"), 1);
		partitura.add(new Pattern("E3i G3i G3i A3i B3i A3i G3i D3i E3i G3i G3i A3i B3i A3i G3i D3i E3i"), 1);
		partitura.add(new Pattern("B3i B3i D4i E4i F#4i G4i D4i E4i A3i A3i B3i G3i E3i D3i B3i B3i"), 1);
		partitura.add(new Pattern("E3i G3i G3i A3i B3i A3i G3i D3i E3i G3i G3i A3i B3s A3s G3s B3s A3s G3s D3i E3i"), 1);
	}

	@Override
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
		partitura.add(new Pattern("G3w"), 1);
		partitura.add(new Pattern("F#3w"), 1);
		partitura.add(new Pattern("E3w"), 1);
		partitura.add(new Pattern("E3w"), 1);
		
		partitura.add(new Pattern("D3q F#3i A3i D3i F#3i A3i D3i"), 1);
		partitura.add(new Pattern("A3i C#3i E3i A3i C#3i E3i C#3i A3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
		partitura.add(new Pattern("D3q F#3i A3i D3i F#3i A3i D3i"), 1);
		partitura.add(new Pattern("A3i C#3i E3i A3i C#3i E3i C#3i A3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
		partitura.add(new Pattern("D3q F#3i A3i D3i F#3i A3i D3i"), 1);
		partitura.add(new Pattern("A3i C#3i E3i A3i C#3i E3i C#3i A3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
	}

	@Override
	public void solo() {
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("D3q F#3i A3i D3i F#3i A3i D3i"), 1);
		partitura.add(new Pattern("A3i C#3i E3i A3i C#3i E3i C#3i A3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
		partitura.add(new Pattern("D3q F#3i A3i D3i F#3i A3i D3i"), 1);
		partitura.add(new Pattern("A3i C#3i E3i A3i C#3i E3i C#3i A3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
		partitura.add(new Pattern("D3q F#3i A3i D3i F#3i A3i D3i"), 1);
		partitura.add(new Pattern("A3i C#3i E3i A3i C#3i E3i C#3i A3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
		partitura.add(new Pattern("E3i G#3i B3i E3i G#3i B3i G#3i E3i"), 1);
	}
	
}
