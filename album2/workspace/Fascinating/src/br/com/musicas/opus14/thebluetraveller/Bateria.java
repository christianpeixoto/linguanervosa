package br.com.musicas.opus14.thebluetraveller;

import org.jfugue.Pattern;


public class Bateria extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V9 X[Volume]=8600"));
		partitura.add(new Pattern("[SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q"), 1);		
	}

	@Override
	public void solo() {
	}

	@Override
	public void estrofe() {
		for(int i = 1; i <= 18; i++){
			partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[CLOSED_HI_HAT]i [CLOSED_HI_HAT]i [ACOUSTIC_SNARE]i+[CLOSED_HI_HAT]i [CLOSED_HI_HAT]i "), 1);
			partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[CLOSED_HI_HAT]i [CLOSED_HI_HAT]i [ACOUSTIC_SNARE]i+[CLOSED_HI_HAT]i [CLOSED_HI_HAT]i "), 1);
			partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[CLOSED_HI_HAT]i [CLOSED_HI_HAT]i [ACOUSTIC_SNARE]i+[CLOSED_HI_HAT]i [CLOSED_HI_HAT]i "), 1);
			partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[CLOSED_HI_HAT]i [CLOSED_HI_HAT]i [ACOUSTIC_SNARE]i+[CLOSED_HI_HAT]i [CLOSED_HI_HAT]i "), 1);
		}
	}

	@Override
	public void fim() {
	}
		
}
