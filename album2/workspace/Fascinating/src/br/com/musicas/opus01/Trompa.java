package br.com.musicas.opus01;

import org.jfugue.Pattern;


public class Trompa extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V5 X[Volume]=8000 I[FRENCH_HORN]"));		
	}

	//C C# D D# E F F# G G# A A# B
	@Override
	public void primeiraParte() {		
		partitura.add(new Pattern("A3h. D3i F3i			| A3h. C#3i E3i		 	| A#3h. D3i F3i 					| G3h. C3i E3i"));		
		partitura.add(new Pattern("A3h. D3i F3i		 	| A3h. C#3i E3i 		| A#3h. D3i F3i 					| G3h. C3i E3i"));		
		partitura.add(new Pattern("A3h.	Rq				| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("A3h. D4i F4i			| A3h. C#4i E4i		 	| A#3h. D4i F4i 					| G3h. C4i E4i"));		
		partitura.add(new Pattern("A3h. D4i F4i		 	| A3h. C#4i E4i 		| A#3h. D4i F4i 					| G3h. C4i E4i"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("A3w 					| A3q D3q Rh 			| D3w 								| G3q C3q Rh"));		
		partitura.add(new Pattern("D3w 					| D3q B3q Rh 			| D#3w 								| C3q F3q Rh"));
		partitura.add(new Pattern("A3w 					| A3q C#3q Rh 			| A#3w 								| G3q C3q Rh"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("C3h E3q G3q 			| B3h. D3i G3i 			| A#3h D3q G3q						| A3h. C3i F3i"));				
		partitura.add(new Pattern("G3h B3q D4q			| F#3h. A4i D4i			| F3h A4q D4q 						| E3h. G4i C4i"));
		partitura.add(new Pattern("D#3i Rhqi 			| D#3i Rhqi 			| E3i Rhqi							| C3i Rhqi"));		
		partitura.add(new Pattern("C4h. D#4i G3i 		| A#3h. D4i G3i 		| A#3h. C#4i F3i 					| G3h. C4i E3i"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("A4w 					| A4q F#4q Rh 			| A#4w 								| C4q G4q Rh"));		
		partitura.add(new Pattern("A4w 					| A4q F#4q Rh 			| A#4w 								| C4q G4q Rh"));		
		partitura.add(new Pattern("Rq D4i C#4i D4i Rqi	| Rq D4i C#4i D4i Rqi	| Rq G3i F#3i G3i Ri G3i F#3i 		| G3i Ri G3i F#3i G3i Rqi"));		
		partitura.add(new Pattern("D4i C#4i D4i Rhi 	| D4i C#4i D4i Rhi		| G3i F#3i G3i Ri G3i F#3i G3i Ri 	| G3i F#3i G3i Rhi"));		
		partitura.add(new Pattern("F3wd127"));
	}

	@Override
	public void fim() {
	}

}
