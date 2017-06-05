package br.com.musicas.opus04.Iloveyou;

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
		
		refrao1();
		
		estrofe1();
		
		refrao1();
		
		estrofe1();
		
		refrao1();
		
		transposicao();
		
		refrao2();
		
		estrofe2();
		
		refrao2();
		
		estrofe2();
		
		refrao2();
		
		fim();

		return partitura;
	}
	
	public abstract void inicio();
	
	public abstract void intro();
	
	public abstract void refrao1();
	
	public abstract void estrofe1();
	
	public abstract void transposicao();
	
	public abstract void refrao2();
	
	public abstract void estrofe2();
	
	public abstract void fim();

}
