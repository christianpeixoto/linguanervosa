package br.com.musicas.opus17.timetodie;

import org.jfugue.Pattern;

public class Viola extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=12000 I[VIOLA]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("G5s A5s B5s G5s A5s B5s D5s E5s D5s E5s B5i A5i G5i E5i G5i G5i A5i B5i A5i G5i E5i"), 1);
		partitura.add(new Pattern("D5i D5i B5i A5i G5i B5s A5s B5s A5s B5s A5s B5i D5i G5i E5i E5i D5i A5i G5i"), 1);
		partitura.add(new Pattern("G5s A5s B5s D5s E5s B5s G5s A5s B5s D5s E5s B5s A5s G5s E5s G5s G5s A5s G5s E5s G5s G5s A5i B5i A5i G5i E5i"), 1);
		partitura.add(new Pattern("D5i D5i B5i A5i G5i E5i B5i A5i B5i D5i G5i E5i E5i D5i A5i G5i"), 1);
		
		partitura.add(new Pattern("B5i B5i D5i E5i F#5i G5i D5i E5i A5i A5s B5s G5s E5s A5s B5s G5s E5s D5i B5i B5i"), 1);
		partitura.add(new Pattern("E5s G5i A5s B5s A5s G5s E5s G5i A5s B5s A5s G5s D5i E5i G5i G5i A5i B5i A5i G5i D5i E5i"), 1);
		partitura.add(new Pattern("B5i B5i D5i E5i F#5i G5i D5i E5i A5i A5i B5i G5i E5i D5i B5i B5i"), 1);
		partitura.add(new Pattern("E5i G5i G5i A5i B5i A5i G5i D5s E5s G5i A5s D5s E5s G5i A5s B5s A5s G5s B5s A5s G5s E5i"), 1);
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
		partitura.add(new Pattern("G5w"), 1);
		partitura.add(new Pattern("F#5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		partitura.add(new Pattern("E5w"), 1);
		
		partitura.add(new Pattern("D5q F#5i A5i D5i F#5i A5i D5i"), 1);
		partitura.add(new Pattern("A5i C#5i E5i A5i C#5i E5i C#5i A5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
		partitura.add(new Pattern("D5q F#5i A5i D5i F#5i A5i D5i"), 1);
		partitura.add(new Pattern("A5i C#5i E5i A5i C#5i E5i C#5i A5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
		partitura.add(new Pattern("D5q F#5i A5i D5i F#5i A5i D5i"), 1);
		partitura.add(new Pattern("A5i C#5i E5i A5i C#5i E5i C#5i A5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
	}

	@Override
	public void solo() {
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("D5q F#5i A5i D5i F#5i A5i D5i"), 1);
		partitura.add(new Pattern("A5i C#5i E5i A5i C#5i E5i C#5i A5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
		partitura.add(new Pattern("D5q F#5i A5i D5i F#5i A5i D5i"), 1);
		partitura.add(new Pattern("A5i C#5i E5i A5i C#5i E5i C#5i A5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
		partitura.add(new Pattern("D5q F#5i A5i D5i F#5i A5i D5i"), 1);
		partitura.add(new Pattern("A5i C#5i E5i A5i C#5i E5i C#5i A5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
		partitura.add(new Pattern("E5i G#5i B5i E5i G#5i B5i G#5i E5i"), 1);
	}

}
