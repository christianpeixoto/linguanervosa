package br.com.musicas.opus10.memories;

import org.jfugue.Pattern;

public class Orgao_mao_esquerda extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=9000 I[CHURCH_ORGAN]"));
		partitura.add(new Pattern("Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void intro() {
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("F#3majww"), 1);		
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("B3majww"), 1);		
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("F#3majww"), 1);		
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("B3majww"), 1);		
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("F#3majh F#3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("F#3majh F#3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("C#3majww"), 1);				
		partitura.add(new Pattern("B3majww"), 1);				
		partitura.add(new Pattern("F#3majw"), 1);				
		partitura.add(new Pattern("Rw"), 1);
		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("F#3majh F#3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("F#3majh F#3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("C#3majww"), 1);				
		partitura.add(new Pattern("B3majww"), 1);				
		partitura.add(new Pattern("F#3majw"), 1);				
		partitura.add(new Pattern("Rw"), 1);				
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("F#3majww"), 1);		
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("B3majww"), 1);
		
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("F#3majww"), 1);		
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("B3majww"), 1);				
	}

	@Override
	public void ponte() {
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("F#3majh F#3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("B3majh B3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("F#3majh F#3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("B3majh B3majh"), 1);		
		partitura.add(new Pattern("A3majww"), 1);		
		partitura.add(new Pattern("A3majww"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("F#3majh Rh"), 1);		
		partitura.add(new Pattern("F#3majh Rh"), 1);		
	}
	
	@Override
	public void solo() {
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("F#3majww"), 1);		
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("B3majww"), 1);		
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("F#3majww"), 1);		
		partitura.add(new Pattern("A3majw"), 1);		
		partitura.add(new Pattern("E3majw"), 1);		
		partitura.add(new Pattern("B3majww"), 1);			
	}
	
	@Override
	public void fim() {
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("F#3majh F#3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("B3majh B3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("F#3majh F#3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("B3majh B3majh"), 1);		
		partitura.add(new Pattern("A3majww"), 1);		
		partitura.add(new Pattern("A3majww"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);			
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);			
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);			
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("E3majh E3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);		
		partitura.add(new Pattern("A3majh A3majh"), 1);			
	}

}
