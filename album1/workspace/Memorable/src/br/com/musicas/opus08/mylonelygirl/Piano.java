package br.com.musicas.opus08.mylonelygirl;

import org.jfugue.Pattern;

public class Piano extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=9000 I[PIANO]"));
		partitura.add(new Pattern("L1 Rq Rq Rq Rq"), 1);
		partitura.add(new Pattern("L2 Rq Rq Rq Rq"), 1);
	}
	
	@Override
	public void intro() {
		partitura.add(new Pattern("L1 G4majw"), 1);		
		partitura.add(new Pattern("L2 G6i B6i D7i B6i G6i B6i D7i B6i"), 1);		
		partitura.add(new Pattern("L1 D4majw"), 1);		
		partitura.add(new Pattern("L2 D6i F#6i A6i F#6i D6i F#6i A6i F#6i"), 1);		
		partitura.add(new Pattern("L1 C4majhq E4minh         B4minh         G4majq"), 1);		
		partitura.add(new Pattern("L2 C6hq    E6i E6i E6i Ri B6i B6i B6i Ri G6i G6i"), 1);		
		partitura.add(new Pattern("L1 G4majw"), 1);		
		partitura.add(new Pattern("L2 G6i B6i D7i B6i G6i B6i D7i B6i"), 1);		
		partitura.add(new Pattern("L1 A4minw"), 1);		
		partitura.add(new Pattern("L2 A6i C6i E6i C6i A6i C6i E6i C6i"), 1);		
		partitura.add(new Pattern("L1 C4majww"), 1);
		partitura.add(new Pattern("L2 C6i E6i G6i E6i C6i E6i G6i E6i"), 1);
		partitura.add(new Pattern("L2 C6i E6i G6i E6i C6i E6i G6i E6i"), 1);
	}

	@Override
	public void estrofe() {
		partitura.add(new Pattern("L1 G4majw"), 1);		
		partitura.add(new Pattern("L2 G6i B6i D7i B6i G6i B6i D7i B6i"), 1);		
		partitura.add(new Pattern("L1 D4majw"), 1);		
		partitura.add(new Pattern("L2 D6i F#6i A6i F#6i D6i F#6i A6i F#6i"), 1);		
		partitura.add(new Pattern("L1 C4majhq E4minh         B4minh         G4majq"), 1);		
		partitura.add(new Pattern("L2 C6hq    E6i E6i E6i Ri B6i B6i B6i Ri G6i G6i"), 1);		
		partitura.add(new Pattern("L1 G4majw"), 1);		
		partitura.add(new Pattern("L2 G6i B6i D7i B6i G6i B6i D7i B6i"), 1);		
		partitura.add(new Pattern("L1 A4minw"), 1);		
		partitura.add(new Pattern("L2 A6i C6i E6i C6i A6i C6i E6i C6i"), 1);		
		partitura.add(new Pattern("L1 C4majww"), 1);
		partitura.add(new Pattern("L2 C6i E6i G6i E6i C6i E6i G6i E6i"), 1);
		partitura.add(new Pattern("L2 C6i E6i G6i E6i C6i E6i G6i E6i"), 1);
		
		partitura.add(new Pattern("L1 G4majw"), 1);		
		partitura.add(new Pattern("L2 G6i B6i D7i B6i G6i B6i D7i B6i"), 1);		
		partitura.add(new Pattern("L1 D4majw"), 1);		
		partitura.add(new Pattern("L2 D6i F#6i A6i F#6i D6i F#6i A6i F#6i"), 1);		
		partitura.add(new Pattern("L1 C4majhq E4minh         B4minh         G4majq"), 1);		
		partitura.add(new Pattern("L2 C6hq    E6i E6i E6i Ri B6i B6i B6i Ri G6i G6i"), 1);		
		partitura.add(new Pattern("L1 G4majw"), 1);		
		partitura.add(new Pattern("L2 G6i B6i D7i B6i G6i B6i D7i B6i"), 1);		
		partitura.add(new Pattern("L1 A4minw"), 1);		
		partitura.add(new Pattern("L2 A6i C6i E6i C6i A6i C6i E6i C6i"), 1);		
		partitura.add(new Pattern("L1 C4majw"), 1);
		partitura.add(new Pattern("L2 C6i E6i G6i E6i C6i E6i G6i E6i"), 1);
		partitura.add(new Pattern("L1 C4maj7w"), 1);
		partitura.add(new Pattern("L2 C6i E6i G6i B6i C6i E6i G6i B6i"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("L1 D4majww"), 1);
		partitura.add(new Pattern("L2 D6i F#6i A6i F#6i D6i F#6i A6i F#6i"), 1);		
		partitura.add(new Pattern("L2 D6i A6i F#6i A6i D6i F#6i A6i F#6i"), 1);		
		partitura.add(new Pattern("L1 C4majww"), 1);
		partitura.add(new Pattern("L2 C6i E6i G6i E6i C6i E6i G6i E6i"), 1);
		partitura.add(new Pattern("L2 C6i G6i E6i G6i C6i E6i G6i E6i"), 1);
		
		partitura.add(new Pattern("L1 D4majww"), 1);
		partitura.add(new Pattern("L2 D6i F#6i A6i F#6i D6i F#6i A6i F#6i"), 1);		
		partitura.add(new Pattern("L2 D6i A6i F#6i A6i D6i F#6i A6i F#6i"), 1);		
		partitura.add(new Pattern("L1 C4majww"), 1);
		partitura.add(new Pattern("L2 C6i E6i G6i E6i C6i E6i G6i E6i"), 1);
		partitura.add(new Pattern("L2 C6i G6i E6i G6i C6i E6i G6i E6i"), 1);
	}

	@Override
	public void fim() {
	}

}
