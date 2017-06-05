package br.com.musicas.opus17.timetodie;

import org.jfugue.Pattern;

public class Piano extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=11000 I[PIANO]"));
		partitura.add(new Pattern("L1 Rq Rq Rq Rq"), 1);
		partitura.add(new Pattern("L2 Rq Rq Rq Rq"), 1);
	}

	@Override
	public void intro() {
		partitura.add(new Pattern("L1 G4q+G5q B4q D5q B4q E4q+E5q G4q B4q G4q"), 1);
		partitura.add(new Pattern("L2 G6maji Ri Ri G6majh Ri E6mini Ri Ri E6minh Ri"), 1);
		partitura.add(new Pattern("L1 D4q+D5q B4q G4q B4q B4q+B5q G4q E5q G4q"), 1);
		partitura.add(new Pattern("L2 D6i D6i B5i A5i G5i E6i B5i A5i B5i D5i G5i E6i E6i D6i A5i G5i"), 1);
		partitura.add(new Pattern("L1 G4q+G5q B4q D5q B4q E4q+E5q G4q B4q G4q"), 1);
		partitura.add(new Pattern("L2 G6maji Ri Ri G6majh Ri E6mini Ri Ri E6minh Ri"), 1);
		partitura.add(new Pattern("L1 D4q+D5q B4q G4q B4q B4q+B5q G4q E5q G4q"), 1);
		partitura.add(new Pattern("L2 D6i D6i B5i A5i G5i E6i B5i A5i B5i D5i G5i E6i E6i D6i A5i G5i"), 1);
		
		partitura.add(new Pattern("L1 B4q+B5q D5q F#5q D5q A4q+A5q B4q E5q B4q"), 1);
		partitura.add(new Pattern("L2 B6mini Ri Ri B6minh Ri A6mini Ri Ri A6minh Ri"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G4q B4q G4q E4q+E5q G4q B4q G4q"), 1);
		partitura.add(new Pattern("L2 E5i G5i G5i A5i B5i A5i G5i D5i E5i G5i G5i A5i B5i A5i G5i D5i E5i"), 1);
		partitura.add(new Pattern("L1 B4q+B5q D5q F#5q D5q A4q+A5q B4q E5q B4q"), 1);
		partitura.add(new Pattern("L2 B6mini Ri Ri B6minh Ri A6mini Ri Ri A6minh Ri"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G4q B4q G4q E4q+E5q G4q B4q G4q"), 1);
		partitura.add(new Pattern("L2 E6mini Ri Ri E6minh Ri E6mini Ri Ri E6minh Ri"), 1);
	}

	@Override //G A B D E
	public void estrofe() {
		partitura.add(new Pattern("L1 G4q+G5q B4q D5q B4q E4q+E5q G4q B4q G4q"), 1);
		partitura.add(new Pattern("L2 G6maji Ri Ri G6majh Ri E6mini Ri Ri E6minh Ri"), 1);
		partitura.add(new Pattern("L1 D4q+D5q B4q G4q B4q B4q+B5q G4q E5q G4q"), 1);
		partitura.add(new Pattern("L2 D6q+D7q B6i G6i D6i B6i G6i D6i B6q+B7q G6i E7i B6i G6i E7i B6i"), 1);
		partitura.add(new Pattern("L1 G4q+G5q B4q D5q B4q E4q+E5q G4q B4q G4q"), 1);
		partitura.add(new Pattern("L2 G6maji Ri Ri G6majh Ri E6mini Ri Ri E6minh Ri"), 1);
		partitura.add(new Pattern("L1 D4q+D5q B4q G4q B4q B4q+B5q G4q E5q G4q"), 1);
		partitura.add(new Pattern("L2 D6q+D7q B6i G6i D6i B6i G6i D6i B6q+B7q G6i E7i B6i G6i E7i B6i"), 1);
		
		partitura.add(new Pattern("L1 B4q+B5q D5q F#5q D5q A4q+A5q B4q E5q B4q"), 1);
		partitura.add(new Pattern("L2 B6q+B7q D7i F#7i B7i D7i F#7i B7i A6q+A7q B6i E7i A7i B6i E7i A7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G4q B4q G4q E4q+E5q G4q B4q G4q"), 1);
		partitura.add(new Pattern("L2 E6q+E7q G6i B6i E7i G6i B6i E7i E6q+E7q G6i B6i E7i G6i B6i E7i"), 1);
		partitura.add(new Pattern("L1 B4q+B5q D5q F#5q D5q A4q+A5q B4q E5q B4q"), 1);
		partitura.add(new Pattern("L2 B6q+B7q D7i F#7i B7i D7i F#7i B7i A6q+A7q B6i E7i A7i B6i E7i A7i"), 1);
		partitura.add(new Pattern("L1 Rww"), 1);
		partitura.add(new Pattern("L2 Rww"), 1);
	}

	@Override
	public void refrao() {
		partitura.add(new Pattern("L1 G4q+G5q B4q D5q B4q"), 1);
		partitura.add(new Pattern("L2 G6q+G7q B6i D7i G7i B6i D7i G7i"), 1);
		partitura.add(new Pattern("L1 F#4q+F#5q A4q C#5q A4q"), 1);
		partitura.add(new Pattern("L2 F#6q+F#7q A6i C#7i F#7i A6i C#7i F#7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i E7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i E7i"), 1);
		
		partitura.add(new Pattern("L1 D4q+D5q F#4q A4q F#4q"), 1);
		partitura.add(new Pattern("L2 D6q+D7q F#6i A6i D7i F#6i A6i D7i"), 1);
		partitura.add(new Pattern("L1 A4q+A5q C#5q E5q C#5q"), 1);
		partitura.add(new Pattern("L2 A6i+A7i C#7i E7i A7i C#7i E7i C#7i A7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
		partitura.add(new Pattern("L1 D4q+D5q F#4q A4q F#4q"), 1);
		partitura.add(new Pattern("L2 D6q+D7q F#6i A6i D7i F#6i A6i D7i"), 1);
		partitura.add(new Pattern("L1 A4q+A5q C#5q E5q C#5q"), 1);
		partitura.add(new Pattern("L2 A6i+A7i C#7i E7i A7i C#7i E7i C#7i A7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
		partitura.add(new Pattern("L1 D4q+D5q F#4q A4q F#4q"), 1);
		partitura.add(new Pattern("L2 D6q+D7q F#6i A6i D7i F#6i A6i D7i"), 1);
		partitura.add(new Pattern("L1 A4q+A5q C#5q E5q C#5q"), 1);
		partitura.add(new Pattern("L2 A6i+A7i C#7i E7i A7i C#7i E7i C#7i A7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
	}

	@Override
	public void solo() {
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("L1 D4q+D5q F#4q A4q F#4q"), 1);
		partitura.add(new Pattern("L2 D6q+D7q F#6i A6i D7i F#6i A6i D7i"), 1);
		partitura.add(new Pattern("L1 A4q+A5q C#5q E5q C#5q"), 1);
		partitura.add(new Pattern("L2 A6i+A7i C#7i E7i A7i C#7i E7i C#7i A7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
		partitura.add(new Pattern("L1 D4q+D5q F#4q A4q F#4q"), 1);
		partitura.add(new Pattern("L2 D6q+D7q F#6i A6i D7i F#6i A6i D7i"), 1);
		partitura.add(new Pattern("L1 A4q+A5q C#5q E5q C#5q"), 1);
		partitura.add(new Pattern("L2 A6i+A7i C#7i E7i A7i C#7i E7i C#7i A7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
		partitura.add(new Pattern("L1 D4q+D5q F#4q A4q F#4q"), 1);
		partitura.add(new Pattern("L2 D6q+D7q F#6i A6i D7i F#6i A6i D7i"), 1);
		partitura.add(new Pattern("L1 A4q+A5q C#5q E5q C#5q"), 1);
		partitura.add(new Pattern("L2 A6i+A7i C#7i E7i A7i C#7i E7i C#7i A7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
		partitura.add(new Pattern("L1 E4q+E5q G#4q B4q G#4q"), 1);
		partitura.add(new Pattern("L2 E6i+E7i G#6i B6i E7i G#6i B6i G#6i E7i"), 1);
	}

}
