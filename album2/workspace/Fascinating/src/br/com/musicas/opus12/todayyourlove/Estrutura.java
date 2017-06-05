package br.com.musicas.opus12.todayyourlove;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;


public abstract class Estrutura  implements Instrumento{
	
	protected Pattern partitura = new Pattern();
	
	public String getNome(){
		return this.getClass().getSimpleName();
	}
	
	public final Pattern getPartitura() {

		partitura.add(new Pattern("T[180] X[CHORUS_LEVEL]=0 X[SOUND_TIMBRE]=0"));
		partitura.add(new Pattern("KCmaj"));
		
		inicio();
		
		refrao();
		
		estrofe();
		
		ponte();
		
		partitura.add(new Pattern("KFmaj"));
		
		refrao();
		
		estrofe();

		ponte();
		
		partitura.add(new Pattern("KBbmaj"));
		
		refrao();
		
		fim();

		return partitura;
	}
	
	public abstract void inicio();
	
	public abstract void refrao();
	
	public abstract void estrofe();
	
	public abstract void ponte();
	
	public abstract void fim();

}
