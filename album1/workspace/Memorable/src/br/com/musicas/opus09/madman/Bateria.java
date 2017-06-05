package br.com.musicas.opus09.madman;

import org.jfugue.Pattern;


public class Bateria extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V9 X[Volume]=10000"));
		partitura.add(new Pattern("[SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q"), 1);		
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CRASH_CYMBAL_1]q "), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CRASH_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CRASH_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CRASH_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[OPEN_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CRASH_CYMBAL_2]q "), 1);
	}

	@Override
	public void ponte() {
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]s [ACOUSTIC_SNARE]s [ACOUSTIC_SNARE]s [ACOUSTIC_SNARE]s [CRASH_CYMBAL_1]q "), 1);
	}
		
	@Override
	public void fim() {
	}

}
