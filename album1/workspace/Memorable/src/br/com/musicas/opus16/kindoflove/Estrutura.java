package br.com.musicas.opus16.kindoflove;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;


public abstract class Estrutura implements Instrumento{
	
	protected Pattern partitura = new Pattern();
	
	public String getNome(){
		return this.getClass().getSimpleName();
	}
	
	public final Pattern getPartitura() {

		partitura.add(new Pattern("T[140] X[CHORUS_LEVEL]=0 X[SOUND_TIMBRE]=0"));
		
		inicio();
		
		intro();
		
		estrofe();
		
		refrao();
	
		estrofe();
		
		refrao();
	
		solo();
		
		refrao();
		
		estrofe();
		
		refrao();
	
		refrao();
		
		fim();

		return partitura;
	}
	
	public abstract void inicio();
	
	public abstract void intro();
	
	public abstract void refrao();
	
	public abstract void solo();
	
	public abstract void estrofe();
	
	public abstract void fim();

}