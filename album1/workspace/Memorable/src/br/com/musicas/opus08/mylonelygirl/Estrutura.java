package br.com.musicas.opus08.mylonelygirl;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;


public abstract class Estrutura implements Instrumento{
	
	protected Pattern partitura = new Pattern();
	
	public String getNome(){
		return this.getClass().getSimpleName();
	}
	
	public final Pattern getPartitura() {

		partitura.add(new Pattern("T[150] X[CHORUS_LEVEL]=0 X[SOUND_TIMBRE]=0"));
		partitura.add(new Pattern("KGmaj"));	
		
		inicio();
		
		intro();
				
		refrao();
		
		estrofe();
		
		refrao();
			
		estrofe();
		
		refrao();
		
		intro();
		
		refrao();
		
		estrofe();
		
		refrao();

		estrofe();

		fim();

		return partitura;
	}
	
	public abstract void inicio();
	
	public abstract void intro();
	
	public abstract void refrao();
	
	public abstract void estrofe();
	
	public abstract void fim();

}
