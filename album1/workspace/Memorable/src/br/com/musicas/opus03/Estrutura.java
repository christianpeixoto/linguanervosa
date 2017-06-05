package br.com.musicas.opus03;

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
		
		primeiraParte();
		
		segundaParte();
		
		terceiraParte();

		quartaParte();
		
		quintaParte();

		segundaParte();
		
		terceiraParte();

		quartaParte();
		
		quintaParte();

		fim();

		return partitura;
	}
	
	public abstract void inicio();
	
	public abstract void primeiraParte();
	
	public abstract void segundaParte();

	public abstract void terceiraParte();
	
	public abstract void quartaParte();
	
	public abstract void quintaParte();
	
	public abstract void fim();

}
