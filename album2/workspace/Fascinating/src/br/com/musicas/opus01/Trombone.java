package br.com.musicas.opus01;

import org.jfugue.Pattern;


public class Trombone extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V4 X[Volume]=8000 I[TROMBONE]"));		
	}

	//C C# D D# E F F# G G# A A# B
	@Override
	public void primeiraParte() {		
		partitura.add(new Pattern("A3h. D4i F4i		| A3h. C#4i E4i		| A#3h. D4i F4i 					| G3h. C4i E4i"));		
		partitura.add(new Pattern("A3h. D4i F4i		| A3h. C#4i E4i 	| A#3h. D4i F4i 					| G3h. C4i E4i"));		
		partitura.add(new Pattern("A3h.	Rq			| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("A3h. D4i F4i		| A3h. C#4i E4i		| A#3h. D4i F4i 					| G3h. C4i E4i"));		
		partitura.add(new Pattern("A3h. D4i F4i		| A3h. C#4i E4i 	| A#3h. D4i F4i 					| G3h. C4i E4i"));		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("A3w 				| A3q D3q Rh 		| D3w 								| G3q C3q Rh"));		
		partitura.add(new Pattern("D3w 				| D3q B3q Rh 		| D#3w 								| C3q F3q Rh"));
		partitura.add(new Pattern("A3w 				| A3q C#3q Rh 		| A#3w 								| G3q C3q Rh"));		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("B3h. D4i G4i 	| A3h D4q F#4q 		| A3h. D4i F4i 						| G3h C4q E4q"));		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("C3i Rhqi 		| B3i Rhqi 			| A#3i Rhqi 						| A3i Rhqi")); 		
		partitura.add(new Pattern("A#3h. C4i G4i	| A#3h. C#4i G4i	| B3h D4q F#4q						| G3h C#4q E4q"));		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 	
		partitura.add(new Pattern("A3w 				| A3q F#3q Rh 		| A#3w 								| C3q G3q Rh"));		
		partitura.add(new Pattern("A3w 				| A3q F#3q Rh 		| A#3w 								| C3q G3q Rh"));		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 								| Rw")); 		
		partitura.add(new Pattern("D3i C#3i D3i Rhi | D3i C#3i D3i Rhi	| G3i F#3i G3i Ri G3i F#3i G3i Ri 	| G3i F#3i G3i Rhi"));		
		partitura.add(new Pattern("F3wd127"));
	}

	@Override
	public void fim() {
	}

}
