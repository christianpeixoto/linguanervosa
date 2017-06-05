package br.com.musicas.opus13.nina;

import org.jfugue.Pattern;

public class Saxofone extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=10000 I[SOPRANO_SAX]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override 
	public void intro() {
		partitura.add(new Pattern("C5i Ri E5i G5i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i"), 1);  
		partitura.add(new Pattern("G5i Ri G5i B5i G6i G5i B5i Ri"), 1);
		partitura.add(new Pattern("C5i G5i A5i E6i"), 1);  
		partitura.add(new Pattern("D5i A5i B5i D6i"), 1);  
		partitura.add(new Pattern("G5i Ri G5i B5i G6i G5i B5i Ri"), 1);
		partitura.add(new Pattern("C6i A5i E5i G5i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i F#6i A5i D6i Ri"), 1); 
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 

		partitura.add(new Pattern("C5i Ri E5i G5i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i"), 1);  
		partitura.add(new Pattern("G5i Ri G5i B5i G6i G5i B5i Ri"), 1);
		partitura.add(new Pattern("C5i Ri E5i G5i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i"), 1);  
		partitura.add(new Pattern("G5i Ri G5i B5i G6i G5i B5i Ri"), 1);
		partitura.add(new Pattern("C5i Ri E5i G5i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i"), 1);  
		
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);

		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
	}

	@Override
	public void solo() {
		partitura.add(new Pattern("C5i Ri E5i G5i D6i C6i B5i Ri"), 1); 
		partitura.add(new Pattern("A5i G5i A5i D6i F#6i E6i D6i C6i"), 1); 
		partitura.add(new Pattern("C5i Ri G5q C6i E5q G5i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i F#6i A5i D6i Ri"), 1); 
		partitura.add(new Pattern("G5i Ri G5i B5i G6i G5i B5i Ri"), 1);  
		partitura.add(new Pattern("G5i A5i G5i B5i G6i G5i B5i Ri"), 1);
		partitura.add(new Pattern("A5q D5i E5i C#6i F#6i G5i A5i"), 1); 
		partitura.add(new Pattern("D5i Ri A5i D6i F#6i A5i D6i Ri"), 1);

		partitura.add(new Pattern("C5i Ri E5i G5i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i"), 1);  
		partitura.add(new Pattern("G5i Ri G5i B5i G6i G5i B5i Ri"), 1);
		partitura.add(new Pattern("C5i G5i A5i E6i"), 1);  
		partitura.add(new Pattern("D5i A5i B5i D6i"), 1);  
		partitura.add(new Pattern("G5i E5i G5i B5i C6i G5i B5i G6i"), 1);
		partitura.add(new Pattern("C5i Ri E5i G5i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i"), 1);  
		
		partitura.add(new Pattern("G5i Ri G6i B5i G5i A5i B5i C5i"), 1);
		partitura.add(new Pattern("E5i Ri A5i D6i F#6i A5i C6i D6i"), 1);
		partitura.add(new Pattern("F#5i Ri E5i A5i G5i C5i G5i Ri"), 1);  
		partitura.add(new Pattern("A5i Ri G5i C6i D6i F#6i D6i C6i"), 1);
		partitura.add(new Pattern("A5i G5i B5i G5i C6i D6i B5i G5i"), 1);
		partitura.add(new Pattern("D5i Ri A5q F#5i A5i D6q"), 1);
		partitura.add(new Pattern("C5q Ri G5i C6i D6i F#6i D6i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i F#6i A5i D6i Ri"), 1);
		
		partitura.add(new Pattern("C5i Ri E5i G5i C6i E5i G5i Ri"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i F#6i A5i D6i Ri"), 1);
		partitura.add(new Pattern("C5i Ri E5i G5i C6i E5i G5i Ri"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i F#6i A5i D6i Ri"), 1);
		partitura.add(new Pattern("G5i Ri G5s B5s G6s G5s G5s B5s G6s G5s B5i Ri"), 1);
		partitura.add(new Pattern("G5i Ri G5i B5i F6i G5i B5i Ri"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("C5i Ri E5i G5i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i"), 1);  
		partitura.add(new Pattern("G5i Ri G5i B5i G6i G5i B5i Ri"), 1);
		partitura.add(new Pattern("C5i G5i A5i E6i"), 1);  
		partitura.add(new Pattern("D5i A5i B5i D6i"), 1);  
		partitura.add(new Pattern("G5i E5i G5i B5i C6i G5i B5i G6i"), 1);
		
		partitura.add(new Pattern("C5i G5i A5i B5i"), 1);  
		partitura.add(new Pattern("D5i A5i G5i C6i"), 1);  
		partitura.add(new Pattern("G6i F#6i G5i B5i C6i D6i B5i G6i"), 1);
		partitura.add(new Pattern("C5i Ri E5i G5i"), 1);  
		partitura.add(new Pattern("D5i Ri A5i D6i"), 1);  
		partitura.add(new Pattern("G5i Ri G5i B5i G6i G5i B5i Ri"), 1);
	}

}
