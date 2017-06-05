package br.com.musicas.opus03;

import org.jfugue.Pattern;


public class Intervencoes extends Estrutura {

	@Override
	public void inicio() {
		partitura.add(new Pattern("V5 X[Volume]=9000 I[TRUMPET]"));
	}

	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
	}

	@Override
	public void segundaParte() {
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Rq Rq C5q D5h Rh"), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Rq Rq B5s A5s G5s B5s A5s G5s B5s A5s G5s B5s A5s G5s B5s A5i. Rq"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1); 
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Rq D5i D5q D5i D5q C5i C5q D5i D5q"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Rq Rq D5h Rw"), 1);
	}

	@Override
	public void terceiraParte() {
		partitura.add(new Pattern("Rw Rh Rq C5q E5q C5q D5h"), 1);
		partitura.add(new Pattern("Rw Rh Rq C5i A5i G5i E5i D5i G5i A5i E5i D5i Ri"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rh D5i D5q D5i D5q C5i C5q D5i D5q"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rh G5q E5q Rw"), 1);
	}

	@Override
	public void quartaParte() {
		partitura.add(new Pattern("Rw Rq Ri B5q A5i G5i F5i E5i D5i C5i C5q Ri"), 1);
		partitura.add(new Pattern("Rw Rh Rq C5q D5h Rh"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw C5s D5s E5s G5s A5s C5s E5s G5s D5s A5s G5s E5s D5s C5s A5i"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rh Rq D5s E5s F5q D5s D5s E5h Rq"), 1);
	}

	@Override
	public void quintaParte() {	
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Ri Ri D5qa80d0"));
	}

}
