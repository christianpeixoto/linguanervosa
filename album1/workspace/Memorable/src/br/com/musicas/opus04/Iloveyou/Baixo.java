package br.com.musicas.opus04.Iloveyou;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=10000 I[ELECTRIC_BASS_PICK]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void intro() {
		partitura.add(new Pattern("Eb2i Eb2i Eb2i Eb2i Bb2i Bb2i Bb2i Bb2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);		
		partitura.add(new Pattern("Eb2i Eb2i Eb2i Eb2i Bb2i Bb2i Bb2i Bb2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);		
		partitura.add(new Pattern("Eb2i Eb2i Eb2i Eb2i Bb2i Bb2i Bb2i Bb2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);		
	}
	
	@Override
	public void refrao1() {
		partitura.add(new Pattern("C3i C3i C3i C3i C3i C3i C3i C3i"), 1);		
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("C3i C3i C3i C3i C3i C3i C3i C3i"), 1);		
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("C3i C3i C3i C3i C3i C3i C3i C3i"), 1);		
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);		
		
		partitura.add(new Pattern("F2i F2i F2i F2i F2i F2i F2i Bb2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);		
		partitura.add(new Pattern("F2i F2i F2i F2i F2i F2i F2i Bb2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);		
	}

	@Override
	public void estrofe1() {
		partitura.add(new Pattern("F2i F2i F2i F2i F2i F2i F2i F2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);		
		partitura.add(new Pattern("F2i F2i F2i F2i F2i F2i F2i F2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);		

		partitura.add(new Pattern("C3i C3i C3i C3i C3i C3i C3i C3i"), 1);		
		partitura.add(new Pattern("F2i F2i F2i F2i G2i G2i G2i G2i"), 1);		
		partitura.add(new Pattern("C3i C3i C3i C3i C3i C3i C3i C3i"), 1);		
		partitura.add(new Pattern("F2i F2i F2i F2i G2i G2i G2i G2i"), 1);		
		partitura.add(new Pattern("C3i C3i C3i C3i C3i C3i C3i C3i"), 1);		
		partitura.add(new Pattern("F2i F2i F2i F2i G2i G2i G2i G2i"), 1);		
		partitura.add(new Pattern("C3i C3i C3i C3i C3i C3i C3i C3i"), 1);		
		partitura.add(new Pattern("F2i F2i F2i F2i G2i G2i G2i G2i"), 1);		
	}
	
	@Override
	public void transposicao() {
		partitura.add(new Pattern("F2i F2i F2i F2i C3i C3i C3i C3i"), 1);		
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);		
		partitura.add(new Pattern("F2i F2i F2i F2i C3i C3i C3i C3i"), 1);		
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);		
		partitura.add(new Pattern("F2i F2i F2i F2i C3i C3i C3i C3i"), 1);		
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);		
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);		
	}

	@Override
	public void refrao2() {
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("E3i E3i E3i E3i E3i E3i E3i E3i"), 1);		
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("E3i E3i E3i E3i E3i E3i E3i E3i"), 1);		
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("E3i E3i E3i E3i E3i E3i E3i E3i"), 1);		
		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i C2i"), 1);		
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i C2i"), 1);		
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);		
	}

	@Override
	public void estrofe2() {
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);		
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);		
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);		

		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i A2i A2i A2i A2i"), 1);		
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i A2i A2i A2i A2i"), 1);		
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i A2i A2i A2i A2i"), 1);		
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i A2i A2i A2i A2i"), 1);		
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("G2i G2i G2i G2i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("B2i B2i B2i B2i B2i B2i B2i B2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("B2i B2i B2i B2i B2i B2i B2i B2i"), 1);		
		partitura.add(new Pattern("G2i G2i G2i G2i D3i D3i D3i D3i"), 1);		
		partitura.add(new Pattern("B2w"), 1);		
	}
	
}
