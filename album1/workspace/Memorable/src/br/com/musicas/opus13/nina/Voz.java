package br.com.musicas.opus13.nina;

import org.jfugue.Pattern;

public class Voz extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=12000 I[GUITAR]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1); 
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1); 
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1); 
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1); 
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("A3i Ri E4i A4i C#5i E4i A4i Ri"), 1); 
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);

		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("G3i Ri G4i B4i F5i G4i B4i Ri"), 1);
	}

	@Override
	public void solo() {
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1); 
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1); 
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1); 
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("A3i Ri E4i A4i C#5i E4i A4i Ri"), 1); 
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);

		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i C5i E4i G4i Ri"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i F#5i A4i D5i Ri"), 1);
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("G3i Ri G4i B4i F5i G4i B4i Ri"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);

		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
		partitura.add(new Pattern("C4i Ri E4i G4i"), 1);  
		partitura.add(new Pattern("D4i Ri A4i D5i"), 1);  
		partitura.add(new Pattern("G3i Ri G4i B4i G5i G4i B4i Ri"), 1);
	}

}
