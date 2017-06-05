package br.com.musicas.opus13.nina;

import org.jfugue.Pattern;

public class Coro extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V3 X[Volume]=10000 I[CHOIR_AAHS]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}

	@Override 
	public void intro() {
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);
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

		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		
		partitura.add(new Pattern("G5w"), 1);
		partitura.add(new Pattern("D5w"), 1);  
		partitura.add(new Pattern("C5w"), 1);  
		partitura.add(new Pattern("D5h Ri D5i E5i F#i"), 1);  
		partitura.add(new Pattern("G5w"), 1);
		partitura.add(new Pattern("D5w"), 1);  
		partitura.add(new Pattern("C5w"), 1);  
		partitura.add(new Pattern("D5w"), 1);  

		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
	}

	@Override
	public void solo() {
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 

		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		
		partitura.add(new Pattern("G5w"), 1);
		partitura.add(new Pattern("D5w"), 1);  
		partitura.add(new Pattern("C5w"), 1);  
		partitura.add(new Pattern("D5h Ri D5i E5i F#i"), 1);  
		partitura.add(new Pattern("G5w"), 1);
		partitura.add(new Pattern("D5w"), 1);  
		partitura.add(new Pattern("C5w"), 1);  
		partitura.add(new Pattern("D5w"), 1);  

		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
		partitura.add(new Pattern("Rw"), 1); 
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);

		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rh"), 1);  
		partitura.add(new Pattern("Rw"), 1);
	}

}
