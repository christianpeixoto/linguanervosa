package br.com.musicas.opus04.Iloveyou;

import org.jfugue.Pattern;

public class Guitarra extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=9000 I[DISTORTION_GUITAR]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void intro() {
		partitura.add(new Pattern("Eb3i+Bb4i+Eb4i Eb3i+Bb4i+Eb4i Eb3i+Bb4i+Eb4i Eb3i+Bb4i+Eb4i Bb3i+F4i+Bb4i Bb3i+F4i+Bb4i Bb3i+F4i+Bb4i Bb3i+F4i+Bb4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("Eb3i+Bb4i+Eb4i Eb3i+Bb4i+Eb4i Eb3i+Bb4i+Eb4i Eb3i+Bb4i+Eb4i Bb3i+F4i+Bb4i Bb3i+F4i+Bb4i Bb3i+F4i+Bb4i Bb3i+F4i+Bb4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("Eb3i+Bb4i+Eb4i Eb3i+Bb4i+Eb4i Eb3i+Bb4i+Eb4i Eb3i+Bb4i+Eb4i Bb3i+F4i+Bb4i Bb3i+F4i+Bb4i Bb3i+F4i+Bb4i Bb3i+F4i+Bb4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
	}
	
	@Override
	public void refrao1() {
		partitura.add(new Pattern("C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
	}

	@Override
	public void estrofe1() {
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		

		partitura.add(new Pattern("C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i"), 1);		
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);
		partitura.add(new Pattern("C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i"), 1);		
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);
		partitura.add(new Pattern("C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i"), 1);		
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);
		partitura.add(new Pattern("C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i"), 1);		
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);
	}
	
	@Override
	public void transposicao() {
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		
		partitura.add(new Pattern("F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i F3i+C4i+F4i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i C4i+G4i+C5i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		
	}

	@Override
	public void refrao2() {
		partitura.add(new Pattern("D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		
		partitura.add(new Pattern("D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		
		partitura.add(new Pattern("D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		
		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		
	}

	@Override
	public void estrofe2() {
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i"), 1);		
		partitura.add(new Pattern("A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);		

		partitura.add(new Pattern("D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);
		partitura.add(new Pattern("D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);
		partitura.add(new Pattern("D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);
		partitura.add(new Pattern("D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i A3i+E4i+A4i"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i"), 1);		
		partitura.add(new Pattern("B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i"), 1);		
		partitura.add(new Pattern("B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i B3i+Gb4i+B4i"), 1);		
		partitura.add(new Pattern("G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i G3i+D4i+G4i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i D4i+A4i+D5i"), 1);		
		partitura.add(new Pattern("B3w+Gb4w+B4w"), 1);		
	}
	
}
