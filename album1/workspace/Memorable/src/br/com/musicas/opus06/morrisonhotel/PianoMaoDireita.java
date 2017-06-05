package br.com.musicas.opus06.morrisonhotel;

import org.jfugue.Pattern;

public class PianoMaoDireita extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 I[PIANO] X[Volume]=12000"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("G6i A6i B6i D6i E6i G6i A6i B6i"), 1);
		
		partitura.add(new Pattern("G6i B6i A6i Ri G6i B6i A6i Ri"), 1);
		
		partitura.add(new Pattern("A6i B6i G6i D6i E6i G6i B6i A6i"), 1);
		
		partitura.add(new Pattern("G6i D6i E6i Ri G6i D6i E6i Ri"), 1);
		
		partitura.add(new Pattern("C6i D6i E6i G6i A6i C6i D6i E6i"), 1);
		
		partitura.add(new Pattern("C6i A6i G6i E6i D6i C6i E6i D6i"), 1);
		
		partitura.add(new Pattern("D6i E6i F#6i A6i B6i D6i E6i F#6i"), 1);
		
		partitura.add(new Pattern("C6i D6i G6i E6i G6i Ri D6i E6i"), 1);
		
		partitura.add(new Pattern("E6i G6i B6i A6i D6i E6i A6i B6i"), 1);
		
		partitura.add(new Pattern("G6i A6i B6i D6i E6i D6i B6i G6i"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("A6i Ri E6i D6i C6i A6i G6i E6i"), 1);
		
		partitura.add(new Pattern("B6i A6i F#6i E6i D6i B6i A6i F#6i"), 1);
		
		partitura.add(new Pattern("E6i Ri B6i A6i G6i E6i D6i B6i"), 1);
		
		partitura.add(new Pattern("E6i D6i B6i A6i G6i E6i D6i B6i"), 1);
	}
	
	@Override
	public void solo() {
		partitura.add(new Pattern("G7i A7i B7i D7i E7i G7i A7i B7i"), 1);
		
		partitura.add(new Pattern("D7i E7i D7i B7i A7i G7i E7i D7i"), 1);
		
		partitura.add(new Pattern("G7i A7i B7i Ri G7i A7i B7i E7i"), 1);
		
		partitura.add(new Pattern("D7i E7i D7i E7i Ri G7i A7i G7i"), 1);
		
		partitura.add(new Pattern("A7i B7i E7i G7i A7i B7i D7i E7i"), 1);
		
		partitura.add(new Pattern("D7i B7i A7i G7i E7i D7i A7i G7i"), 1);
		
		partitura.add(new Pattern("E7i D7i F#7i A7i B7q G7i F#7i"), 1);
		
		partitura.add(new Pattern("A7i G7i E7i Ri A7i B7i D7i E7i"), 1);
		
		partitura.add(new Pattern("D7i B7i A7i G7i E7i D7i A7i G7i"), 1);
		
		partitura.add(new Pattern("E7i A7i B7i D7i E7i G7i A7i G7i"), 1);		
	}
	
	@Override
	public void intro() {
		partitura.add(new Pattern("C7i E7i G7i Ri C7i E7i G7i A7i"), 1);
		
		partitura.add(new Pattern("D7i E7i F#7i A7i B7i F#7i A7i D7i"), 1);
		
		partitura.add(new Pattern("G7i A7i B7i Ri E7i C7i D7i A7i"), 1);
		
		partitura.add(new Pattern("E7i A7i B7i D7i E7i G7i A7i G7i"), 1);		
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("C7i E7i G7i D7i E7i G7i A7i C7i"), 1);
		
		partitura.add(new Pattern("D7i E7i F#7i A7i B7i F#7i A7i D7i"), 1);
		
		partitura.add(new Pattern("G5majw"), 1);		
	}

}
