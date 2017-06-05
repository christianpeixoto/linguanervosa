package br.com.musicas.opus06.morrisonhotel;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=12000 I[ELECTRIC_BASS_PICK]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("E3i E3i D3i D3i C3i C3i A2i A2i"), 1);		
		partitura.add(new Pattern("G2i G2i E2i E2i G2i E2q Ri"), 1);		
		partitura.add(new Pattern("E3i E3i D3i D3i C3i C3i A2i A2i"), 1);		
		partitura.add(new Pattern("G2i G2i E2i E2i G2i E2q Ri"), 1);		
		partitura.add(new Pattern("E3i E3i D3i D3i C3i C3i A2i A2i"), 1);		
		partitura.add(new Pattern("G2i G2i E2i E2i G2i E2q Ri"), 1);
		partitura.add(new Pattern("D3w"), 1);
		partitura.add(new Pattern("C3w"), 1);
		partitura.add(new Pattern("E3i E3i D3i D3i C3i C3i A2i A2i"), 1);		
		partitura.add(new Pattern("G2i G2i E2i E2i G2i E2q Ri"), 1);		
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("E2h E2h"), 1);		
		partitura.add(new Pattern("A2h A2h"), 1);		
		partitura.add(new Pattern("G2h G2h"), 1);		
		partitura.add(new Pattern("G2h G2h"), 1);		
	}

	@Override
	public void solo() {
		partitura.add(new Pattern("E3i E3i D3i D3i C3i C3i A2i A2i"), 1);		
		partitura.add(new Pattern("G2i G2i E2i E2i G2i E2q Ri"), 1);		
		partitura.add(new Pattern("E3i E3i D3i D3i C3i C3i A2i A2i"), 1);		
		partitura.add(new Pattern("G2i G2i E2i E2i G2i E2q Ri"), 1);		
		partitura.add(new Pattern("E3i E3i D3i D3i C3i C3i A2i A2i"), 1);		
		partitura.add(new Pattern("G2i G2i E2i E2i G2i E2q Ri"), 1);
		partitura.add(new Pattern("D3w"), 1);
		partitura.add(new Pattern("C3w"), 1);
		partitura.add(new Pattern("E3i E3i D3i D3i C3i C3i A2i A2i"), 1);		
		partitura.add(new Pattern("G2i G2i E2i E2i G2i E2q Ri"), 1);		
	}
	
	@Override
	public void intro() {
		partitura.add(new Pattern("E2h E2h"), 1);		
		partitura.add(new Pattern("A2h A2h"), 1);		
		partitura.add(new Pattern("G2h G2h"), 1);		
		partitura.add(new Pattern("G2h G2h"), 1);		
	}
	
	@Override
	public void fim() {
		partitura.add(new Pattern("E2h E2h"), 1);		
		partitura.add(new Pattern("A2h A2h"), 1);		
		partitura.add(new Pattern("G2w"), 1);
	}

}
