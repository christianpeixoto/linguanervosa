package br.com.musicas.opus02;

import org.jfugue.Pattern;


public class Viola extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=8000 I[ALTO_SAX]"));		
	}

	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		
		partitura.add(new Pattern("Rqi G#4q C#5q Ri E5q C#5q Ri"));
		partitura.add(new Pattern("Rqi G#4q C#5q Ri E5q C#5q Ri"));
		
		partitura.add(new Pattern("Rqi D4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi F#5q C#6q B5q A5q F#5q Ri"));		
	}

	@Override
	public void segundaParte() {
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q C#5q Ri B4q C#5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi A4q D5q Ri F#5q D5q Ri"));
		
		partitura.add(new Pattern("Rqi G#4q C#5q Ri E5q C#5q Ri"));
		partitura.add(new Pattern("Rqi G#4q C#5q Ri E5q C#5q Ri"));
		
		partitura.add(new Pattern("Rqi D4q D5q Ri F#5q D5q Ri"));
		partitura.add(new Pattern("Rqi F#5q C#6q B5q A5q F#5q Ri"));		
	}
	
	@Override
	public void fim() {
	}

}
