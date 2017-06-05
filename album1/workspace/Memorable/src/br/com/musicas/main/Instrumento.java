package br.com.musicas.main;

import org.jfugue.Pattern;

public interface Instrumento {

	public Pattern getPartitura();
	
	public String getNome();
	
}
