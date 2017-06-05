package br.com.musicas.opus01;

import org.jfugue.Pattern;


public class Cello extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V0 X[Volume]=9000 I[CELLO]"));		
	}

	//C C# D D# E F F# G G# A A# B
	@Override
	public void primeiraParte() {		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("A3h. D4i F4i 		| A3h C#4q E4q		 	| A#3h. D4i F4i 						| G3h C4q E4q"));		
		partitura.add(new Pattern("A3h. D4i F4i 		| A3h C#4q E4q 			| A#3h. D4i F4i 						| G3h C4q E4q"));		
		partitura.add(new Pattern("Rq D4i C#4i D4i Rqi 	| Rq D4i C#4i D4i Rqi	| Rq G3i F#3i G3i Ri G3i F#3i		| G3i Ri G3i F#3i G3i Ri Rq"));
		partitura.add(new Pattern("Rq D4i C#4i D4i Rqi 	| Rq D4i C#4i D4i Rqi	| Rq G3i F#3i G3i Ri G3i F#3i		| G3i Ri G3i F#3i G3i Ri Rq"));
		partitura.add(new Pattern("A3h. D4i F4i 		| A3h. C#4i E4i			| A#3h. D4i F4i						| G3h. C4i E4i"));		
		partitura.add(new Pattern("A3h. D4i F4i 		| A3h. C#4i E4i			| A#3h. D4i F4i						| G3h. C4i E4i"));		
		partitura.add(new Pattern("D4i C#4i D4i Ri Rh 	| D4i C#4i D4i Ri Rh 	| G3i F#3i G3i Ri G3i F#3i G3i Ri	| G3i F#3i G3i Ri Rh"));				
		partitura.add(new Pattern("D4i C#4i D4i Ri Rh 	| D4i C#4i D4i Ri Rh 	| G3i F#3i G3i Ri G3i F#3i G3i Ri	| G3i F#3i G3i Ri Rh"));				
		partitura.add(new Pattern("A4w 					| Rw 					| D4w 								| Rw"));
		partitura.add(new Pattern("D4w 					| Rw 					| D#4w 								| Rw"));
		partitura.add(new Pattern("A4w 					| Rw 					| A#4w 								| Rw"));		
		partitura.add(new Pattern("A3i G#3i A3i Ri Rh 	| A3i G#3i A3i Ri Rh 	| D4i C#4i D4i Ri D4i C#4i D4i Ri 	| D4i C#4i D4i Ri Rh"));		
		partitura.add(new Pattern("E4i D#4i E4h G3q 	| D4i C#4i D4h F#3q 	| D4i C#4i D4h F3q 					| C4i B3i C4h E3q"));		
		partitura.add(new Pattern("C4i B3i C4h D4q 		| B3i A#3i B3h D4q 		| A#3i A3i A#3h D4q 				| A3i G#3i A3h C4q"));		
		partitura.add(new Pattern("D3h. G3i A#3i 		| D3h. F#3i A3i 		| D#3h. G3i A#3i 					| C3h. F3i A3i"));		
		partitura.add(new Pattern("D3h. G3i A#3i 		| D3h. F#3i A3i 		| D#3h. G3i A#3i 					| C3h. F3i A3i"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("C3h E3q G3q 			| B3h. D3i G3i 			| A#3h D3q G3q						| A3h. C3i F3i"));				
		partitura.add(new Pattern("G3h B3q D4q			| F#3h. A4i D4i			| F3h A4q D4q 						| E3h. G4i C4i"));
		partitura.add(new Pattern("D#3i Rhqi 			| D#3i Rhqi 			| E3i Rhqi							| C3i Rhqi"));		
		partitura.add(new Pattern("C4h. D#4i G3i 		| A#3h. D4i G3i 		| A#3h. C#4i F3i 					| G3h. C4i E3i"));				
		partitura.add(new Pattern("Rq D4i C#4i D4i Rqi 	| Rq D4i C#4i D4i Rqi	| Rq G3i F#3i G3i Ri G3i F#3i		| G3i Ri G3i F#3i G3i Ri Rq"));
		partitura.add(new Pattern("Rq D4i C#4i D4i Rqi 	| Rq D4i C#4i D4i Rqi	| Rq G3i F#3i G3i Ri G3i F#3i		| G3i Ri G3i F#3i G3i Ri Rq"));
		partitura.add(new Pattern("D4h Rh 				| A4h Rh 				| D#4h Rh 							| C4h Rh"));		
		partitura.add(new Pattern("D4h Rh 				| A4h Rh 				| D#4h Rh 							| C4h Rh"));				
		partitura.add(new Pattern("Rq D4i C#4i D4i Rqi 	| Rq D4i C#4i D4i Ri Rq | Rq G3i F#3i G3i Ri G3i F#3i 		| G3i Ri G3i F#3i G3i Ri Rq"));
		partitura.add(new Pattern("D4i C#4i D4i Ri Rh 	| D4i C#4i D4i Ri Rh 	| G3i F#3i G3i Ri G3i F#3i G3i Ri 	| G3i F#3i G3i Ri Rh"));				
		partitura.add(new Pattern("F3wd127"));
	}

	@Override
	public void fim() {
	}

}
