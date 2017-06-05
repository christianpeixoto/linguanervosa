package br.com.musicas.opus01;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;


public abstract class Estrutura implements Instrumento{
	
	protected Pattern partitura = new Pattern();
	
	public String getNome(){
		return this.getClass().getSimpleName();
	}
	
	public final Pattern getPartitura() {

		partitura.add(new Pattern("T[110] X[CHORUS_LEVEL]=0 X[SOUND_TIMBRE]=0"));
		
		inicio();
		
		primeiraParte();
		
		fim();

		return partitura;
	}
	
	public abstract void inicio();
	
	public abstract void primeiraParte();

	public abstract void fim();

}
