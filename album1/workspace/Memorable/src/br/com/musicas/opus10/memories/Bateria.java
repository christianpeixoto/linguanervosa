package br.com.musicas.opus10.memories;

import org.jfugue.Pattern;


public class Bateria extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V9 X[Volume]=10000"));
		partitura.add(new Pattern("[SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q"), 1);		
	}

	@Override
	public void intro() {	
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("Rw"), 1);
		partitura.add(new Pattern("[ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i Ri [ACOUSTIC_SNARE]i Ri [ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i [CRASH_CYMBAL_2]i"), 1);
		
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [LOW_TOM]i+[HIGH_TOM]i [LOW_TOM]i+[HIGH_TOM]i [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_2]q "), 1);
	}
	
	@Override
	public void estrofe() {
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [SPLASH_CYMBAL]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[LOW_TOM]i [LOW_TOM]i Ri [HIGH_TOM]i Ri [LOW_TOM]i [HIGH_TOM]i [CRASH_CYMBAL_2]i"), 1);
		
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [SPLASH_CYMBAL]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]q [ACOUSTIC_BASS_DRUM]q+[CLOSED_HI_HAT]q [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [CLOSED_HI_HAT]q "), 1);
		partitura.add(new Pattern("[LOW_TOM]s [HIGH_TOM]s [ACOUSTIC_SNARE]s Rs [LOW_TOM]s [HIGH_TOM]s [ACOUSTIC_SNARE]s Rs [ACOUSTIC_SNARE]q [CRASH_CYMBAL_2]q"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [LOW_TOM]i [HIGH_TOM]i [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [CRASH_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [LOW_TOM]i+[HIGH_TOM]i [LOW_TOM]i+[HIGH_TOM]i [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [CRASH_CYMBAL_2]q "), 1);
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
		partitura.add(new Pattern("[CRASH_CYMBAL_1]w+[CRASH_CYMBAL_2]w"), 1);
		partitura.add(new Pattern("[HAND_CLAP]q [HAND_CLAP]q [HAND_CLAP]q [HAND_CLAP]q"), 1);
		partitura.add(new Pattern("[HAND_CLAP]q [HAND_CLAP]q [HAND_CLAP]q [ACOUSTIC_BASS_DRUM]q+[CRASH_CYMBAL_2]q"), 1);
		partitura.add(new Pattern("[CRASH_CYMBAL_1]hq+[CRASH_CYMBAL_2]hq [LOW_TOM]i [HIGH_TOM]i"), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i Ri [ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i Rq "), 1);
		partitura.add(new Pattern("[ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i Ri [ACOUSTIC_SNARE]i [ACOUSTIC_SNARE]i [CRASH_CYMBAL_2]q "), 1);
	}
		
	@Override
	public void solo() {		
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [LOW_TOM]i [HIGH_TOM]i [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [CRASH_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [LOW_TOM]i+[HIGH_TOM]i [LOW_TOM]i+[HIGH_TOM]i [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [RIDE_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_1]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_1]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_1]q [CRASH_CYMBAL_2]q "), 1);
	}
	
	@Override
	public void fim() {
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[CRASH_CYMBAL_1]w+[CRASH_CYMBAL_2]w"), 1);
		partitura.add(new Pattern("[SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q"), 1);
		partitura.add(new Pattern("[SIDE_STICK]q [SIDE_STICK]q [SIDE_STICK]q [ACOUSTIC_BASS_DRUM]q"), 1);
		partitura.add(new Pattern("[CRASH_CYMBAL_1]hq+[CRASH_CYMBAL_2]hq [LOW_TOM]i [HIGH_TOM]i"), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_1]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [CRASH_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]q [ACOUSTIC_BASS_DRUM]q+[RIDE_CYMBAL_2]q [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [RIDE_CYMBAL_2]q "), 1);
	}

}
