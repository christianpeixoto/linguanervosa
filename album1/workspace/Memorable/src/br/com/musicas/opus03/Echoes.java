package br.com.musicas.opus03;

import org.jfugue.Pattern;


public class Echoes extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V1 X[Volume]=6000 I[ECHOES]"));
	}
	
	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("Ri Rq Ri Rq"), 8);
		partitura.add(new Pattern("Ri Rq Ri Rq"), 4);
		partitura.add(new Pattern("Ri Rq Ri Rq"), 4);
		partitura.add(new Pattern("Ri D5maj7q Ri Rq Ri Rq Ri Rq"), 1);
		partitura.add(new Pattern("Ri C6maj7q Ri Rq Ri Rq Ri Rq"), 1);
		partitura.add(new Pattern("Ri G5majh Ri Ri Rq Ri Rq"), 2);
	}

	@Override
	public void segundaParte() {
		partitura.add(new Pattern("Ri G5majh Ri Ri Ri Rh"), 4);
		partitura.add(new Pattern("Ri C6majh Ri Ri Rq Ri Rq"), 2);
		partitura.add(new Pattern("Ri G5majh Ri Ri Rq Ri Rq"), 2);
		partitura.add(new Pattern("Ri D5maj7q Ri Rq Ri Rq Ri Rq"), 1);
		partitura.add(new Pattern("Ri C6maj7q Ri Rq Ri Rq Ri Rq"), 1);
		partitura.add(new Pattern("Ri G5majh Ri Ri Rq Ri Rq"), 2);
	}

	@Override
	public void terceiraParte() {
		partitura.add(new Pattern("Ri G5majh Ri Ri Ri Rh"), 4);
		partitura.add(new Pattern("Ri C6majh Ri Ri Rq Ri Rq"), 2);
		partitura.add(new Pattern("Ri G5majh Ri Ri Rq Ri Rq"), 2);
		partitura.add(new Pattern("Ri D5maj7q Ri Rq Ri Rq Ri Rq"), 1);
		partitura.add(new Pattern("Ri C6maj7q Ri Rq Ri Rq Ri Rq"), 1);
		partitura.add(new Pattern("Ri G5majh Ri Ri Rq Ri Rq"), 2);
	}

	@Override
	public void quartaParte() {
		partitura.add(new Pattern("Ri G5majh Ri Ri Ri Rh"), 4);
		partitura.add(new Pattern("Ri C6majh Ri Ri Rq Ri Rq"), 2);
		partitura.add(new Pattern("Ri G5majh Ri Ri Rq Ri Rq"), 2);
		partitura.add(new Pattern("Ri D5maj7q Ri Rq Ri Rq Ri Rq"), 1);
		partitura.add(new Pattern("Ri C6maj7q Ri Rq Ri Rq Ri Rq"), 1);
		partitura.add(new Pattern("Ri G5majh Ri Ri Rq Ri Rq"), 2);
	}

	@Override
	public void quintaParte() {
		partitura.add(new Pattern("Ri G5majh Ri Ri Ri Rh"), 4);
		partitura.add(new Pattern("Ri C6majh Ri Ri Rq Ri Rq"), 2);
		partitura.add(new Pattern("Ri G5majh Ri Ri Rq Ri Rq"), 2);
		partitura.add(new Pattern("Ri D5maj7q Ri Rq Ri Rq Ri Rq"), 1);
		partitura.add(new Pattern("Ri C6maj7q Ri Rq Ri Rq Ri Rq"), 1);
		partitura.add(new Pattern("Ri G5majh Ri Ri Rq Ri Rq"), 2);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Ri Ri Ri G5majqa80d0"));
	}

}
