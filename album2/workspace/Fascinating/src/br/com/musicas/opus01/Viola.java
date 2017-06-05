package br.com.musicas.opus01;

import org.jfugue.Pattern;


public class Viola extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V8 X[Volume]=9000 I[VIOLA]"));		
	}

	//C C# D D# E F F# G G# A A# B
	@Override
	public void primeiraParte() {		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));		
		partitura.add(new Pattern("A4h. D4i F4i 		| A4h C#4q E4q			| A#4h. D4i F4i 					| G4h C4q E4q"));		
		partitura.add(new Pattern("A4h. D4i F4i 		| A4h C#4q E4q 			| A#4h. D4i F4i 					| G4h C4q E4q"));		
		partitura.add(new Pattern("D4i C#4i D4i Rhi 	| D4i C#4i D4i Rhi 		| G4i F#4i G4i Ri G4i F#4i G4i Ri 	| G4i F#4i G4i Rhi"));		
		partitura.add(new Pattern("D4i C#4i D4i Rhi 	| D4i C#4i D4i Rhi 		| G4i F#4i G4i Ri G4i F#4i G4i Ri 	| G4i F#4i G4i Rhi"));		
		partitura.add(new Pattern("A4h. D4i F4i 		| A4h. C#4i E4i			| A#4h. D4i F4i						| G4h. C4i E4i"));		
		partitura.add(new Pattern("A4h. D4i F4i 		| A4h. C#4i E4i			| A#4h. D4i F4i						| G4h. C4i E4i"));		
		partitura.add(new Pattern("Rq D4i C#4i D4i Rqi 	| Rq D4i C#4i D4i Rqi 	| Rq G4i F#4i G4i Ri G4i F#4i 		| G4i Ri G4i F#4i G4i Rqi"));		
		partitura.add(new Pattern("Rq D4i C#4i D4i Rqi 	| Rq D4i C#4i D4i Rqi 	| Rq G4i F#4i G4i Ri G4i F#4i 		| G4i Ri G4i F#4i G4i Rqi"));		
		partitura.add(new Pattern("E4w 					| Rw 					| A4w 								| Rw"));
		partitura.add(new Pattern("D4w 					| Rw 					| D#4w 								| Rw"));
		partitura.add(new Pattern("E4w 					| Rw 					| A#4w 								| Rw"));		
		partitura.add(new Pattern("A4i G#4i A4i Rhi 	| A4i G#4i A4i Rhi 		| D4i C#4i D4i Ri D4i C#4i D4i Ri 	| D4i C#4i D4i Rhi"));		
		partitura.add(new Pattern("E4i D#4i E4h G4q 	| D4i C#4i D4h F#4q 	| D4i C#4i D4h F4q 					| C4i B4i C4h E4q"));		
		partitura.add(new Pattern("C4i B4i C4h D4q 		| B4i A#4i B4h D4q 		| A#4i A4i A#4h D4q 				| A4i G#4i A4h C4q"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("D4i C#4i D4i Rhi 	| D4i C#4i D4i Rhi 		| G4i F#4i G4i Ri G4i F#4i G4i Ri 	| G4i F#4i G4i Rhi"));		
		partitura.add(new Pattern("Rw 					| Rw 					| Rw 								| Rw"));
		partitura.add(new Pattern("C4h E4q G4q 			| B4h. D4i G4i 			| A#4h D4q G4q						| A4h. C4i F4i"));				
		partitura.add(new Pattern("G4h B4q D5q			| F#4h. A5i D5i			| F4h A5q D5q 						| E4h. G5i C5i"));
		partitura.add(new Pattern("D#4i Rhqi 			| D#4i Rhqi 			| E4i Rhqi							| C4i Rhqi"));		
		partitura.add(new Pattern("C4h. D#4i G4i 		| A#4h. D4i G4i 		| A#4h. C#4i F4i 					| G4h. C4i E4i"));				
		partitura.add(new Pattern("D4i C#4i D4i Rhi 	| D4i C#4i D4i Rhi 		| G4i F#4i G4i Ri G4i F#4i G4i Ri 	| G4i F#4i G4i Rhi"));		
		partitura.add(new Pattern("D4i C#4i D4i Rhi 	| D4i C#4i D4i Rhi 		| G4i F#4i G4i Ri G4i F#4i G4i Ri 	| G4i F#4i G4i Rhi"));
		partitura.add(new Pattern("D4h Rh 				| A4h Rh 				| D#4h Rh 							| C4h Rh"));		
		partitura.add(new Pattern("D4h Rh 				| A4h Rh 				| D#4h Rh 							| C4h Rh"));				
		partitura.add(new Pattern("D4i C#4i D4i Rhi 	| D4i C#4i D4i Rhi 		| G4i F#4i G4i Ri G4i F#4i G4i Ri 	| G4i F#4i G4i Rhi"));		
		partitura.add(new Pattern("Rq D4i C#4i D4i Rqi	| Rq D4i C#4i D4i Rqi 	| Rq G4i F#4i G4i Ri G4i F#4i 		| G4i Ri G4i F#4i G4i Rqi"));		
		partitura.add(new Pattern("F3wd127"));
	}

	@Override
	public void fim() {
	}

}
