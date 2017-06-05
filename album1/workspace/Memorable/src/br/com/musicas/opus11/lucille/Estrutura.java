package br.com.musicas.opus11.lucille;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;


public abstract class Estrutura implements Instrumento{
	
	protected Pattern partitura = new Pattern();
	
	public String getNome(){
		return this.getClass().getSimpleName();
	}
	
	public final Pattern getPartitura() {

		partitura.add(new Pattern("T[200] X[CHORUS_LEVEL]=0 X[SOUND_TIMBRE]=127"));
		
		inicio();
		
		intro();
		
		estrofe();
		
		refrao();
		
		estrofe();
		
		refrao();
		
		ponte();
		
		estrofe();
		
		refrao();
		
		ponte();
		
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
