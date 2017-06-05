package br.com.musicas.opus03;

import org.jfugue.Pattern;


public class Bateria extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V9 X[Volume]=10000"));
	}

	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("Ri Rq Ri Rq"), 8);
		partitura.add(new Pattern("Ri Rq Ri Rq"), 4);
		partitura.add(new Pattern("Ri [BASS_DRUM]q+[SIDE_STICK]q Ri Rq"), 4);
		partitura.add(new Pattern("Ri [BASS_DRUM]q+[SIDE_STICK]q Ri Rq"), 2);
		partitura.add(new Pattern("Ri [BASS_DRUM]q+[SIDE_STICK]q Ri Rq"), 2);
		partitura.add(new Pattern("Ri [BASS_DRUM]q+[SIDE_STICK]q Ri Rq"), 3);
		partitura.add(new Pattern("[LOW_FLOOR_TOM]s [HIGH_FLOOR_TOM]s [LOW_TOM]s [HIGH_TOM]s [LOW_FLOOR_TOM]s [HIGH_FLOOR_TOM]s [LOW_TOM]s [HIGH_TOM]s [CRASH_CYMBAL_1]qa100"), 1);
	}

	@Override
	public void segundaParte() {
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [SIDE_STICK]q+[CLOSED_HI_HAT]q [BASS_DRUM]i+[CLOSED_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 8);
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [SIDE_STICK]q+[CLOSED_HI_HAT]q [BASS_DRUM]i+[CLOSED_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 4);
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [SIDE_STICK]q+[CLOSED_HI_HAT]q [BASS_DRUM]i+[CLOSED_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 4);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]i [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [BASS_DRUM]i+[RIDE_CYMBAL_2]i [BASS_DRUM]q+[RIDE_CYMBAL_2]q"), 2);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]i [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [BASS_DRUM]i+[RIDE_CYMBAL_2]i [BASS_DRUM]q+[RIDE_CYMBAL_2]q"), 2);
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [SIDE_STICK]q+[CLOSED_HI_HAT]q [BASS_DRUM]i+[CLOSED_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 3);		
		partitura.add(new Pattern("[LOW_FLOOR_TOM]i [HIGH_FLOOR_TOM]i [LOW_TOM]i [HIGH_TOM]i [CRASH_CYMBAL_1]qa100"), 1);
	}

	@Override
	public void terceiraParte() {		
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [BASS_DRUM]i+[OPEN_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 7);
		partitura.add(new Pattern("[LOW_FLOOR_TOM]s [HIGH_FLOOR_TOM]s [LOW_TOM]i [LOW_FLOOR_TOM]s [HIGH_FLOOR_TOM]s [LOW_TOM]i [CRASH_CYMBAL_1]qa100"), 1);
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [BASS_DRUM]i+[OPEN_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 4);
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [BASS_DRUM]i+[OPEN_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 4);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]i [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [BASS_DRUM]i+[RIDE_CYMBAL_2]i [BASS_DRUM]q+[RIDE_CYMBAL_2]q"), 2);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]i [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [BASS_DRUM]i+[RIDE_CYMBAL_2]i [BASS_DRUM]q+[RIDE_CYMBAL_2]q"), 2);
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [BASS_DRUM]i+[OPEN_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 3);		
		partitura.add(new Pattern("[LOW_TOM]q [HIGH_TOM]q [CRASH_CYMBAL_2]qa100"), 1);
	}

	@Override
	public void quartaParte() {
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [BASS_DRUM]i+[CLOSED_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 8);
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [BASS_DRUM]i+[CLOSED_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 4);
		partitura.add(new Pattern("[LOW_TOM]i [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [HIGH_TOM]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 4);
		partitura.add(new Pattern("Ri [ACOUSTIC_SNARE]q+[HAND_CLAP]q Ri [BASS_DRUM]q+[HAND_CLAP]q"), 2);
		partitura.add(new Pattern("Ri [ACOUSTIC_SNARE]q+[HAND_CLAP]q Ri [BASS_DRUM]q+[HAND_CLAP]q"), 1);
		partitura.add(new Pattern("[LOW_TOM]q [HIGH_TOM]q [CRASH_CYMBAL_2]qa100"), 1);
		partitura.add(new Pattern("[LOW_TOM]i [ACOUSTIC_SNARE]q+[CLOSED_HI_HAT]q [HIGH_TOM]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 3);		
		partitura.add(new Pattern("[LOW_FLOOR_TOM]i [HIGH_FLOOR_TOM]i [LOW_TOM]i [HIGH_TOM]i [CRASH_CYMBAL_2]qa100"), 1);
	}

	@Override
	public void quintaParte() {
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [ACOUSTIC_SNARE]q+[OPEN_HI_HAT]q [BASS_DRUM]i+[CLOSED_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 8);
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [ACOUSTIC_SNARE]q+[OPEN_HI_HAT]q [BASS_DRUM]i+[CLOSED_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 4);
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [ACOUSTIC_SNARE]q+[OPEN_HI_HAT]q [BASS_DRUM]i+[CLOSED_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 4);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]i [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [BASS_DRUM]i+[RIDE_CYMBAL_2]i [BASS_DRUM]q+[RIDE_CYMBAL_2]q"), 2);
		partitura.add(new Pattern("[RIDE_CYMBAL_2]i [ACOUSTIC_SNARE]q+[RIDE_CYMBAL_2]q [BASS_DRUM]i+[RIDE_CYMBAL_2]i [BASS_DRUM]q+[RIDE_CYMBAL_2]q"), 2);
		partitura.add(new Pattern("[CLOSED_HI_HAT]i [ACOUSTIC_SNARE]q+[OPEN_HI_HAT]q [BASS_DRUM]i+[CLOSED_HI_HAT]i [BASS_DRUM]q+[CLOSED_HI_HAT]q"), 3);		
		partitura.add(new Pattern("[LOW_FLOOR_TOM]i [HIGH_FLOOR_TOM]i [LOW_TOM]i [HIGH_TOM]i [CRASH_CYMBAL_2]qa100"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("Rq Rq Rq"), 1);
		partitura.add(new Pattern("Rq Rq Rq"), 1);
		partitura.add(new Pattern("Rq Rq Rq"), 1);
		partitura.add(new Pattern("Ri Ri Ri [BASS_DRUM]q+[ACOUSTIC_SNARE]q+[CRASH_CYMBAL_2]qa80d0"), 1);
	}
		
}
