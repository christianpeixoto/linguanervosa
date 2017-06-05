package br.com.musicas.opus16.kindoflove;

import org.jfugue.Pattern;

public class Gaita extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=13000 I[HARMONICA]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override 
	public void intro() {
		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("F#5i A5i B5i F#5i"), 1);

		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("F#5i A5i B5i F#5i"), 1);
		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("Rh"), 1);

		partitura.add(new Pattern("C5q C5q"), 1);
		partitura.add(new Pattern("C5q C5q"), 1);
		partitura.add(new Pattern("D5q Rq"), 1);
		partitura.add(new Pattern("Rh"), 1);
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("Rh"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("C5q C5q"), 1);
		partitura.add(new Pattern("C5q C5q"), 1);
		partitura.add(new Pattern("D5q Rq"), 1);
		partitura.add(new Pattern("Rh"), 1);

		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("Rh"), 1);
	}

	@Override
	public void solo() {
		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("F#5i A5i B5i F#5i"), 1);
		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("B5i D5i E5i F#5i"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("C5q C5q"), 1);
		partitura.add(new Pattern("C5q C5q"), 1);
		partitura.add(new Pattern("D5q Rq"), 1);
		partitura.add(new Pattern("Rh"), 1);

		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("B5i D5i E5i F#5i"), 1);

		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("Rh"), 1);
		partitura.add(new Pattern("D5i E5i F#5i A5i"), 1);
		partitura.add(new Pattern("B5i A5i B5i E5i"), 1);
		partitura.add(new Pattern("E5i D5i F#5i D5i"), 1);
		partitura.add(new Pattern("B5i D5i E5i F#5i"), 1);
	}

}
