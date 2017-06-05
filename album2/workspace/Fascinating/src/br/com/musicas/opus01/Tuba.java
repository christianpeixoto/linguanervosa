package br.com.musicas.opus01;

import org.jfugue.Pattern;


public class Tuba extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V7 X[Volume]=8000 I[TUBA]"));		
	}

	//C C# D D# E F F# G G# A A# B
	@Override
	public void primeiraParte() {		
		partitura.add(new Pattern("A2h. Rq		| A2h. Rq		| A#2h. Rq 			| G2h. Rq"));		
		partitura.add(new Pattern("A2h. Rq		| A2h. Rq		| A#2h. Rq 			| G2h. Rq"));		
		partitura.add(new Pattern("A2h.	Rq		| Rw 			| Rw 				| Rw"));		
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));		
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));		
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));		
		partitura.add(new Pattern("A2h. Rq		| A2h. Rq		| A#2h. Rq 			| G2h. Rq"));		
		partitura.add(new Pattern("A2h. Rq		| A2h. Rq		| A#2h. Rq 			| G2h. Rq"));		
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));	
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));	
		partitura.add(new Pattern("A2w 			| A2q D2q Rh 	| D2w 				| G2q C2q Rh"));		
		partitura.add(new Pattern("D2w 			| D2q B2q Rh 	| D#2w 				| C2q F2q Rh"));
		partitura.add(new Pattern("A2w 			| A2q C#2q Rh 	| A#2w 				| G2q C2q Rh"));		
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));
		partitura.add(new Pattern("C2h Rh 		| B2h. Rq 		| A#2h Rh			| A2h. Rq"));				
		partitura.add(new Pattern("G2h Rh		| F#2h. Rq		| F2h Rh 			| E2h. Rq"));
		partitura.add(new Pattern("D#2i Rhqi	| D#2i Rhqi		| E2i Rhqi			| C2i Rhqi"));		
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));		
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));	
		partitura.add(new Pattern("A2w 			| A2q C#2q Rh 	| A#2w 				| G2q C2q Rh"));		
		partitura.add(new Pattern("A2w 			| A2q C#2q Rh 	| A#2w 				| G2q C2q Rh"));		
		partitura.add(new Pattern("Rw 			| Rw 			| Rw 				| Rw"));		
		partitura.add(new Pattern("D2i Rhqi 	| D2i Rhqi 		| G2i Rqi G2i Rqi 	| G2i Rhqi"));		
		partitura.add(new Pattern("F2wd127"));
	}

	@Override
	public void fim() {
	}

}
