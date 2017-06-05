package br.com.musicas.opus07.iwontbeyourlover;

import org.jfugue.Pattern;


public class Baixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=11000 I[ELECTRIC_BASS_FINGER]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);				
		partitura.add(new Pattern("E2i E2i E2i E2i E2i E2i E2i E2i"), 1);				
		partitura.add(new Pattern("C3i C3i C3i C3i C3i C3i C3i C3i"), 1);				
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);				
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);				
		partitura.add(new Pattern("E2i E2i E2i E2i E2i E2i E2i E2i"), 1);				
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);				
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);				
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("D3q A2i* G2i* G2i* Rh"), 1);		
		partitura.add(new Pattern("A2h Rh"), 1);		
		partitura.add(new Pattern("A3q F#2i* E2i* E2i* Rh"), 1);		
		partitura.add(new Pattern("C3q C3q D3q D3q"), 1);		
		partitura.add(new Pattern("D3q A2i* G2i* G2i* Rh"), 1);		
		partitura.add(new Pattern("A2h Rh"), 1);		
		partitura.add(new Pattern("A3q F#2i* E2i* E2i* Rh"), 1);		
		partitura.add(new Pattern("C3h D3h"), 1);		
	}

	@Override
	public void ponte() {	
		partitura.add(new Pattern("C3w"), 1);		
		partitura.add(new Pattern("E3w"), 1);		
		partitura.add(new Pattern("G2w"), 1);		
		partitura.add(new Pattern("B2w"), 1);		
		partitura.add(new Pattern("C3w"), 1);		
		partitura.add(new Pattern("E3w"), 1);		
		partitura.add(new Pattern("G2w"), 1);		
		partitura.add(new Pattern("F2w"), 1);		
		partitura.add(new Pattern("E3mini E3mini E3mini E3mini"), 1);		
		partitura.add(new Pattern("E3minq Rq"), 1);		
		partitura.add(new Pattern("E3mini E3mini E3mini E3mini"), 1);		
		partitura.add(new Pattern("E3minq Rq"), 1);		
	}

	@Override
	public void fim() {
	}

	@Override
	public void solo() {
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);				
		partitura.add(new Pattern("E2i E2i E2i E2i E2i E2i E2i E2i"), 1);				
		partitura.add(new Pattern("C3i C3i C3i C3i C3i C3i C3i C3i"), 1);				
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);				
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);				
		partitura.add(new Pattern("E2i E2i E2i E2i E2i E2i E2i E2i"), 1);				
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);				
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);				
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);				
		partitura.add(new Pattern("E2i E2i E2i E2i E2i E2i E2i E2i"), 1);				
		partitura.add(new Pattern("C3i C3i C3i C3i C3i C3i C3i C3i"), 1);				
		partitura.add(new Pattern("G2i G2i G2i G2i G2i G2i G2i G2i"), 1);				
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);				
		partitura.add(new Pattern("E2i E2i E2i E2i E2i E2i E2i E2i"), 1);				
		partitura.add(new Pattern("A2i A2i A2i A2i A2i A2i A2i A2i"), 1);				
		partitura.add(new Pattern("D3i D3i D3i D3i D3i D3i D3i D3i"), 1);				
	}

}
