package br.com.musicas.opus05.havinaball;

import org.jfugue.Pattern;


public class Bateria extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V9 X[Volume]=8600"));
		partitura.add(new Pattern("[SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q"), 1);		
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [CRASH_CYMBAL_1]i "), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [CRASH_CYMBAL_2]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i "), 1);
		partitura.add(new Pattern("[ACOUSTIC_BASS_DRUM]i+[OPEN_HI_HAT]i [OPEN_HI_HAT]i [ACOUSTIC_SNARE]i+[OPEN_HI_HAT]i [CRASH_CYMBAL_2]i "), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("[ACOUSTIC_SNARE]s [ACOUSTIC_SNARE]s [ACOUSTIC_SNARE]s Rs [ACOUSTIC_SNARE]s [ACOUSTIC_SNARE]s [ACOUSTIC_SNARE]s Rs"), 1);
		partitura.add(new Pattern("[CRASH_CYMBAL_2]h"), 1);
	}
		
}
