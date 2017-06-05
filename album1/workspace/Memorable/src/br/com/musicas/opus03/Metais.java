package br.com.musicas.opus03;

import org.jfugue.Pattern;


public class Metais extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V3 X[Volume]=7000 I[BRASS_SECTION]"));
	}
	
	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Fqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Awa80 Rq Gwa80 Rh Dqa80"), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
	}

	@Override
	public void segundaParte() {
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Fqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Aq Aq Rq Aq Aqa80 Gq Gq Gq Rq Gqa80 Rq Dqa80"), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
	}

	@Override
	public void terceiraParte() {
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Fqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Awa80 Rq Gwa80 Rh Dqa80"), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
	}

	@Override
	public void quartaParte() {
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);
		partitura.add(new Pattern("Rw Rw Rw"), 1);	
	}

	@Override
	public void quintaParte() {
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ri Fqa80d0 Rw."), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dqa80d0 Rw."), 1);
		partitura.add(new Pattern("Awa80 Rq Gwa80 Rh Dqa80"), 1);
		partitura.add(new Pattern("Ri Rq Ri Rq Ri Rq Ci Dha80d0 Rwq"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Rq Rq Rq"));
		partitura.add(new Pattern("Ri Ri Ri Dqa80d0"));
	}

}
