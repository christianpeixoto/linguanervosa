package br.com.musicas.opus08.mylonelygirl;

import java.util.Random;

import org.jfugue.Pattern;


public class Bateria extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V9 X[Volume]=10000"));
		partitura.add(new Pattern("[SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q"), 1);		
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern(trocaVirada()), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CRASH_CYMBAL_2]q "), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern(trocaVirada()), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CRASH_CYMBAL_1]q "), 1);
		
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern(trocaVirada()), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CRASH_CYMBAL_2]q "), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CRASH_CYMBAL_2]q "), 1);
	}

	@Override
	public void fim() {
	}

	private String trocaVirada(){
		String escolhas[] = { 
							  "[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [LOW_FLOOR_TOM]i  [LOW_MID_TOM]i    [LOW_TOM]i        Ri         [HIGH_FLOOR_TOM]i [HI_MID_TOM]i     [HIGH_TOM]i       Ri          [ACOUSTIC_SNARE]i      [CRASH_CYMBAL_1]i ",
							  "[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [LOW_FLOOR_TOM]i  [LOW_MID_TOM]i    [LOW_TOM]i        [LOW_TOM]i [HIGH_FLOOR_TOM]i [HI_MID_TOM]i     [HIGH_TOM]i       [HIGH_TOM]i [ACOUSTIC_SNARE]i      [CRASH_CYMBAL_2]i ",
							  "[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i Ri         [ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i Ri          [LOW_TOM]i+[HIGH_TOM]i [CRASH_CYMBAL_1]i "
							 };
						
		Random rand = new Random();
		
		return escolhas[rand.nextInt(escolhas.length)];
	}
	
}
