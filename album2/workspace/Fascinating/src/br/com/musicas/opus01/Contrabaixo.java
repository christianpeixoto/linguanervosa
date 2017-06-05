package br.com.musicas.opus01;

import org.jfugue.Pattern;


public class Contrabaixo extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=8500 I[CONTRABASS]"));
	}

	//C C# D D# E F F# G G# A A# B
	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 			| Rw"));		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 			| Rw"));		
		partitura.add(new Pattern("A2h. Rq	 		| A2h Rh		 	| A#2h. Rq	 	| G2h Rh"));		
		partitura.add(new Pattern("A2h. Rq 			| A2h Rh 			| A#2h. Rq 		| G2h Rh"));		
		partitura.add(new Pattern("D2w 				| Rw 				| G2w 			| Rw"));
		partitura.add(new Pattern("D2w 				| Rw 				| G2w 			| Rw"));
		partitura.add(new Pattern("A2h. Rq	 		| A2h. Rq		 	| A#2h. Rq	 	| G2h. Rq"));		
		partitura.add(new Pattern("A2h. Rq 			| A2h. Rq 			| A#2h. Rq 		| G2h. Rq"));		
		partitura.add(new Pattern("D2w 				| Rw 				| G2w 			| Rw"));		
		partitura.add(new Pattern("D2w 				| Rw 				| G2w 			| Rw"));		
		partitura.add(new Pattern("E2w 				| Rw				| A2w 			| Rw"));		
		partitura.add(new Pattern("D2w 				| Rw 				| D#2w 			| Rw"));		
		partitura.add(new Pattern("E2w 				| Rw 				| A#2w 			| Rw"));		
		partitura.add(new Pattern("A2w 				| Rw 				| A#2w 			| D2i C#2i D2i Ri Rh"));		
		partitura.add(new Pattern("G#2h Rh 			| F#2h Rh 			| F2h Rh 		| E2h Rh"));		
		partitura.add(new Pattern("C2h Rh 			| B2h Rh 			| A#2h Rh 		| A2h Rh"));				
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 			| Rw"));		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 			| Rw"));		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 			| Rw"));		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 			| Rw"));
		partitura.add(new Pattern("C2h Rh 			| B2h. Rq 			| A#2h Rh		| A2h. Rq"));				
		partitura.add(new Pattern("G2h Rh			| F#2h. Rq			| F2h Rh 		| E2h. Rq"));
		partitura.add(new Pattern("D#2i Rhqi 		| D#2i Rhqi			| E2i Rhqi		| C2i Rhqi"));		
		partitura.add(new Pattern("Rw 				| Rw 				| Rw 			| Rw"));
		partitura.add(new Pattern("D2w 				| Rw 				| G2w 			| Rw"));
		partitura.add(new Pattern("D2w 				| Rw 				| G2w 			| Rw"));
		partitura.add(new Pattern("B2h Rh 			| F#2h Rh 			| C2h Rh 		| A2h Rh"));		
		partitura.add(new Pattern("B2h Rh 			| F#2h Rh 			| C2h Rh 		| A2h Rh"));		
		partitura.add(new Pattern("A2h Rh 			| A2h Rh 			| A#2h Rh 		| G2h Rh"));		
		partitura.add(new Pattern("A2h Rh 			| A2h Rh 			| A#2h Rh 		| G2h Rh"));		
		partitura.add(new Pattern("D2wd127"));
	}

	@Override
	public void fim() {
	}
		
}
