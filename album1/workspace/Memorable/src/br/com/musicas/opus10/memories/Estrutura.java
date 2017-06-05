package br.com.musicas.opus10.memories;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;


public abstract class Estrutura implements Instrumento{
	
	protected Pattern partitura = new Pattern();
	
	public String getNome(){
		return this.getClass().getSimpleName();
	}
	
	public final Pattern getPartitura() {

		partitura.add(new Pattern("T[140] X[CHORUS_LEVEL]=0 X[SOUND_TIMBRE]=127"));
		partitura.add(new Pattern("KEmaj"));	
		
		inicio();
		
		intro();
		
		estrofe();
		
		refrao();
		
		ponte();
		
		solo();
		
		fim();

		return partitura;
	}
	
	public abstract void inicio();
	
	public abstract void intro();
	
	public abstract void estrofe();
	
	public abstract void refrao();

	public abstract void ponte();
	
	public abstract void solo();
		
	public abstract void fim();

}
