package br.com.musicas.opus01;

import org.jfugue.Pattern;


public class Violino extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V10 X[Volume]=7000 I[VIOLIN]"));		
	}

	//C C# D D# E F F# G G# A A# B
	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("L1 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L1 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L1 A5h. D6i F6i 	| A5h C#6q E6q 	| A#5h. D6i F6i	| G5h C6q E6q"));		
		partitura.add(new Pattern("L1 A5h. D6i F6i 	| A5h C#6q E6q 	| A#5h. D6i F6i	| G5h C6q E6q"));		
		partitura.add(new Pattern("L1 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L1 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L1 A5h. D6i F6i 	| A5h. C#6i E6i	| A#5h. D6i F6i	| G5h. C6i E6i"));		
		partitura.add(new Pattern("L1 A5h. D6i F6i 	| A5h. C#6i E6i	| A#5h. D6i F6i	| G5h. C6i E6i"));		
		partitura.add(new Pattern("L1 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L1 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L1 E6w			| Rw 			| A6w 			| Rw"));
		partitura.add(new Pattern("L1 D6w			| Rw 			| D#6w			| Rw"));
		partitura.add(new Pattern("L1 E6w			| Rw 			| A#6w			| Rw"));		
		partitura.add(new Pattern("L1 A5i Rh Rq Ri 	| A5i Rh Rq Ri 	| D5i Rh Rq Ri 	| D5i Rh Rq Ri"));		
		partitura.add(new Pattern("L1 G#5h Rh 		| F#5h Rh 		| F5h Rh 		| E5h Rh"));		
		partitura.add(new Pattern("L1 C5h Rh 		| B4h Rh 		| A#4h Rh 		| A4h Rh"));				
		partitura.add(new Pattern("L1 D5h. G5i A#5i | D5h. F#5i A5i	| D#5h. G5i A#5i | C5h. F5i A5i"));		
		partitura.add(new Pattern("L1 D5h. G5i A#5i | D5h. F#5i A5i | D#5h. G5i A#5i | C5h. F5i A5i"));		
		partitura.add(new Pattern("L1 A5i Rh Rq Ri 	| Rw 			| A#5i Rh Rq Ri | D5i C#5i D5i Ri Rh")); 
		partitura.add(new Pattern("L1 B5h. D6i G6i 	| A5h D6q F#6q 	| A5h. D6i F6i 	| G5h C6q E6q"));		
		partitura.add(new Pattern("L1 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L1 C5i Rhqi 		| B5i Rhqi 		| A#5i Rhqi 	| A5i Rhqi")); 		
		partitura.add(new Pattern("L1 A#5h. C6i G6i | A#5h. C#6i G6i | B5h D6q F#6q	| G5h C#6q E6q"));		
		partitura.add(new Pattern("L1 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L1 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L1 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L1 D5h. G5i A#5i | A5h F#5q D5q	| D#5h. G5i A#5i | C5h F5q D5q"));		
		partitura.add(new Pattern("L1 D5h G5q A#5q 	| A5h. F#5i D5i	| D#5h G5q A#5q | C5h. F5i D5i"));		
		partitura.add(new Pattern("L1 A5h. D6i F6i 	| A5h C#6q E6q 	| A#5h. D6i F6i | G5h C6q E6q"));		
		partitura.add(new Pattern("L1 A5h. D6i F6i 	| A5h. C#6i E6i	| A#5h. D6i F6i | G5h. C6i E6i"));		
		partitura.add(new Pattern("L1 F6wd127"));

		//Segundo violino
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 A4h. D5i F5i 	| A4h C#5q E5q 	| A#4h. D5i F5i 	| G4h C5q E5q"));		
		partitura.add(new Pattern("L2 A4h. D5i F5i 	| A4h C#5q E5q 	| A#4h. D5i F5i 	| G4h C5q E5q"));		
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 A4h D5q F5q 	| A4h C#5q E5q 	| A#4h D5q F5q 	| G4h C5q E5q"));		
		partitura.add(new Pattern("L2 A4h D5q F5q 	| A4h C#5q E5q 	| A#4h D5q F5q 	| G4h C5q E5q"));		
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 E5w			| Rw 			| A5w 			| Rw"));
		partitura.add(new Pattern("L2 D5w			| Rw 			| D#5w			| Rw"));
		partitura.add(new Pattern("L2 E5w			| Rw 			| A#5w			| Rw"));		
		partitura.add(new Pattern("L2 A4i Rh Rq Ri 	| A4i Rh Rq Ri 	| D4i Rh Rq Ri 	| D4i Rh Rq Ri"));		
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 D4h. G4i A#4i | D4h. F#4i A4i	| D#4h. G4i A#4i | C4h. F4i A4i"));		
		partitura.add(new Pattern("L2 D4h. G4i A#4i | D4h. F#4i A4i | D#4h. G4i A#4i | C4h. F4i A4i"));		
		partitura.add(new Pattern("L2 A4i Rh Rq Ri 	| Rw 			| A#4i Rh Rq Ri | D4i C#4i D4i Ri Rh")); 
		partitura.add(new Pattern("L2 B4h. D5i G5i 	| A4h D5q F#5q 	| A4h. D5i F5i 	| G4h C5q E5q"));		
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 C4i Rhqi 		| B4i Rhqi 		| A#4i Rhqi 	| A4i Rhqi")); 		
		partitura.add(new Pattern("L2 A#4h. C5i G5i	| A#4h. C#5i G5i | B4h D5q F#5q | G4h C#5q E5q"));	
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));		
		partitura.add(new Pattern("L2 Rw 			| Rw 			| Rw 			| Rw"));
		partitura.add(new Pattern("L2 D4h. G4i A#4i | A4h F#4q D4q 		| D#4h. G4i A#4i 	| C4h F4q D4q"));		
		partitura.add(new Pattern("L2 D4h G4q A#4q 	| A4h. F#4i D4i 	| D#4h G4q A#4q 	| C4h. F4i D4i"));		
		partitura.add(new Pattern("L2 A4h. D5i F5i 	| A4h C#5q E5q 		| A#4h. D5i F5i 	| G4h C5q E5q"));		
		partitura.add(new Pattern("L2 A4h. D5i F5i 	| A4h. C#5i E5i 	| A#4h. D5i F5i 	| G4h. C5i E5i"));		
		partitura.add(new Pattern("L2 F5wd127"));
	}

	@Override
	public void fim() {
	}

}
