package br.com.musicas.opus06.morrisonhotel;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;


public abstract class Estrutura implements Instrumento{
	
	protected Pattern partitura = new Pattern();
	
	public String getNome(){
		return this.getClass().getSimpleName();
	}
	
	public final Pattern getPartitura() {

		partitura.add(new Pattern("T[180] X[CHORUS_LEVEL]=0 X[SOUND_TIMBRE]=0"));
		
		inicio();
		
		intro();
		
		estrofe();
				
		refrao();
		
		solo();

		refrao();
		
		estrofe();
		
		refrao();
		
		solo();
		
		refrao();
		
		estrofe();
		
		refrao();
		
		solo();

		refrao();
		
		estrofe();
		
		refrao();
		
		intro();
		
		fim();

		return partitura;
	}
	
	public abstract void inicio();
	
	public abstract void refrao();
	
	public abstract void solo();
	
	public abstract void intro();
	
	public abstract void estrofe();
	
	public abstract void fim();

}
