package br.com.musicas.opus07.iwontbeyourlover;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;

public abstract class Estrutura implements Instrumento{
	
	protected Pattern partitura = new Pattern();
	
	public String getNome(){
		return this.getClass().getSimpleName();
	}

	public Pattern getPartitura() {

		partitura.add(new Pattern("T[150] X[CHORUS_LEVEL]=0 X[SOUND_TIMBRE]=0"));
		partitura.add(new Pattern("KGmaj"));	
		
		inicio();
		
		intro();
		
		refrao();
		
		estrofe();
		
		refrao();
		
		ponte();
		
		solo();

		refrao();
		
		estrofe();
				
		refrao();
		
		refrao();
		
		fim();

		return partitura;
	}
	
	public abstract void inicio();
	
	public abstract void refrao();
	
	public abstract void estrofe();

	public abstract void intro();
	
	public abstract void solo();
	
	public abstract void ponte();
	
	public abstract void fim();

}
