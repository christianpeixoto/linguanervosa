package br.com.musicas.opus05.havinaball;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;


public abstract class Estrutura implements Instrumento{
	
	protected Pattern partitura = new Pattern();
	
	public String getNome(){
		return this.getClass().getSimpleName();
	}
	
	public final Pattern getPartitura() {

		partitura.add(new Pattern("T[160] X[CHORUS_LEVEL]=0 X[SOUND_TIMBRE]=0"));
		
		inicio();
		
		estrofe();
		
		refrao();
		
		estrofe();
		
		refrao();
		
		estrofe();
		
		refrao();
		
		estrofe();
		
		refrao();
		
		fim();

		return partitura;
	}
	
	public abstract void inicio();
	
	public abstract void estrofe();
	
	public abstract void refrao();
	
	public abstract void fim();

}
