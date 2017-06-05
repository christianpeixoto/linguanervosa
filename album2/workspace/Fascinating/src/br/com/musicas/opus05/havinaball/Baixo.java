package br.com.musicas.opus05.havinaball;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=10000 I[ELECTRIC_BASS_PICK]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("G2i G2i D3i D3i C3i C3i B2i B2i"), 1);		
		partitura.add(new Pattern("G2i G2i D3i D3i C3i C3i B2i B2i"), 1);		
		partitura.add(new Pattern("G2i G2i D3i D3i C3i C3i B2i B2i"), 1);		
		partitura.add(new Pattern("G2i G2i D3i D3i C3i C3i B2i B2i"), 1);		
		partitura.add(new Pattern("G2i G2i D3i D3i C3i C3i B2i B2i"), 1);		
		partitura.add(new Pattern("G2i G2i D3i D3i C3i C3i B2i B2i"), 1);		
		partitura.add(new Pattern("G2i G2i D3i D3i C3i C3i B2i B2i"), 1);		
		partitura.add(new Pattern("G2i G2i D3i D3i C3i C3i B2i B2i"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("C3i C3i E3i E3i F3i F3i G3i G3i"), 1);		
		partitura.add(new Pattern("C3i C3i E3i E3i F3i F3i G3i G3i"), 1);		
		partitura.add(new Pattern("G2i G2i D3i D3i C3i C3i B2i B2i"), 1);		
		partitura.add(new Pattern("G2i G2i D3i D3i C3i C3i B2i B2i"), 1);		
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("Rq Rq"), 1);
		partitura.add(new Pattern("G2qa0d127"), 1);
	}

}
