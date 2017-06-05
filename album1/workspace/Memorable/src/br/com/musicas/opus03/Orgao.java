package br.com.musicas.opus03;

import org.jfugue.Pattern;


public class Orgao extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V4 X[Volume]=8000 I[CHURCH_ORGAN]"));
	}
	
	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("Rh Rq Rh Rq Rw."), 2);
		partitura.add(new Pattern("Ai Gq Ri Rq Ai Gq Ri Rq Rw."), 1);
		partitura.add(new Pattern("Rh Rq Rh Rq Rw."), 1);
		partitura.add(new Pattern("Rh Rq Rh Rq Rw."), 1);
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 1);
	}

	@Override
	public void segundaParte() {
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 2);
		partitura.add(new Pattern("Ai Gq Ri Rq Ai Gq Ri Rq Rw."), 1);
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 1);
		partitura.add(new Pattern("Rw Rq Rw Rh Rq"), 1);
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 1);
	}

	@Override
	public void terceiraParte() {
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 2);
		partitura.add(new Pattern("Ai Gq Ri Rq Ai Gq Ri Rq Rw."), 1);
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 1);
		partitura.add(new Pattern("Rw Rq Rw Rh Rq"), 1);
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 1);
	}

	@Override
	public void quartaParte() {
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 2);
		partitura.add(new Pattern("Ai Gq Ri Rq Ai Gq Ri Rq Rw."), 1);
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 1);
		partitura.add(new Pattern("Rw Rq Rw Rh Rq"), 1);
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 1);
	}

	@Override
	public void quintaParte() {
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 2);
		partitura.add(new Pattern("Ai Gq Ri Rq Ai Gq Ri Rq Rw."), 1);
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 1);
		partitura.add(new Pattern("Rw Rq Rw Rh Rq"), 1);
		partitura.add(new Pattern("Ai Gq Ri Rq Gi Fq Ri Rq Rw."), 1);
	}

	@Override
	public void fim() {
	}

}
