package br.com.musicas.opus01;

import org.jfugue.Pattern;


public class Timpano extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V3 X[Volume]=8000 I[TIMPANI]"));		
	}

	//C C# D D# E F F# G G# A A# B
	@Override
	public void primeiraParte() {		
		partitura.add(new Pattern("A3q A3q A3q Rq			| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("A3q A3q A3q Rq			| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("A3q A3q A3q Rq			| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("A3q A3q A3q Rq			| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("A3h.	Rq					| A3h. Rq					| A#3h. Rq 					| G3h. Rq"));		
		partitura.add(new Pattern("A3h.	Rq					| A3h. Rq					| A#3h. Rq					| G3h. Rq"));		
		partitura.add(new Pattern("A3s A3s A3s A3s Rhq 		| Rw 						| Rw				 		| Rw"));		
		partitura.add(new Pattern("A3s A3s A3s A3s Rhq 		| Rw 						| Rw				 		| Rw"));		
		partitura.add(new Pattern("A3h Rh					| Rw 						| D3h Rh				 	| Rw"));
		partitura.add(new Pattern("D3h Rh					| Rw 						| D#3h Rh				 	| Rw"));		
		partitura.add(new Pattern("A3h Rh					| Rw 						| A#3h Rh				 	| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("C3q C3q C3q Rq			| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("A3q A3q A3q Rq			| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("Rw 						| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("A3q A3q A3q Rq			| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("A3q A3q A3q Rq			| Rw 						| Rw 						| Rw"));
		partitura.add(new Pattern("F3q F3q F3q Rq"));
	}

	@Override
	public void fim() {
	}

}
