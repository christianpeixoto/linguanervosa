package br.com.musicas.opus03;

import org.jfugue.Pattern;

public class Piano extends Estrutura{

	@Override
	public void inicio() {
		partitura.add(new Pattern("V2 X[Volume]=10000"));
	}
	
	@Override
	public void primeiraParte() {
		partitura.add(new Pattern("I[PIANO]"));		
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i D5q C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 2);
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i F5q F5i F5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i D5q C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 A5i A5q A5i A5q A5i A5q. G5q G5i G5q G5i G5q G5i A5i G5i A5i D5q L2 A3i Rhi Rhq G3i Rhi Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i D5q C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
	}

	@Override
	public void segundaParte() {
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i D5q C5i D5q G5q F5q D5i E5i D5i E5i Rh L2 D3i Rhi F3i Rhi G3i Rhi D3i Rhi"),1); 
		partitura.add(new Pattern("L1 D5i F5q G5i D5q F5i D5q B5i G5q A5q F5q E5i C5i F5i D5i D5h L2 D3i Rhi F3i Rhi A3i Rhi D3i Rhi"),1);
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i F5q F5i G5q A5q B5q C5h D5i E5i D5i F5i L2 D3i Rhi F3i Rhi A3i Rhi D3i Rhi"), 1);
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i D5q C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 A5i A5q A5i A5q A5i A5q. G5q G5i G5q G5i G5q G5i A5i G5i A5i D5q L2 A3i Rhi Rhq G3i Rhi Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i D5q C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);	
	}
	
	@Override
	public void terceiraParte() {
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i D5q C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5s D5s F5s D5s F5s D5s C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5i D5s E5s D5s F5s D5s F5q F5i F5q F5i F5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i D5q C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 A5i A5q A5i A5q A5i A5q. G5q G5i G5q G5i G5q G5i A5i G5i A5i D5q L2 A3i Rhi Rhq G3i Rhi Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5q D5s F5s D5s F5s D5s F5s D5s F5s D5q C5i D5h Rwq L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
	}
	
	@Override
	public void quartaParte() {
		partitura.add(new Pattern("L1 F5i G5q A5i G#5q G5i F5q C5i D5q Rw. L2 F3i Rhi G3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 D5i G5q A5i B5q G5i C5q F5i D5q Rw. L2 D3i Rhi G3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5i D5i F5i C5i D5i B5i F5i G5i F5i F5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5q C5i F5q G5i G#5i A5i B5i Dq Rw. L2 D3i Rhi G3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 A5q G5q Rq A5q G5q Rq A5q G5q Rq G5i A5i G5i A5i D5q L2 A3i Rhi A3i Rhi A3i Rhi Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5q D5i F5q F5i D5q C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
	}

	@Override
	public void quintaParte() {
		partitura.add(new Pattern("L1 D5q E5q. F5q C5qi D5q Rq C5q E5q C5q D5h L2 D3i Rqq F3i Rhq G3i Rhi D3i Rhi" ), 1);
		partitura.add(new Pattern("L1 B5q A5q. F5q G5qi E5q C5q C5i A5i G5i E5i D5i G5i A5i E5i D5i Ri L2 B3i Rqq F3i Rhq A3i Rhi D3i Rhi"), 1);
		partitura.add(new Pattern("L1 A5i Bq D5i G5h A5q C5q Rw. L2 A3i Rhi G3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 D5q E5i D5i F5q. D5q C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
		partitura.add(new Pattern("L1 A5wq G5w G5i A5qi D5q L2 A3i Rhi Rhq G3i Rhi Rhq"), 1);
		partitura.add(new Pattern("L1 D5i E5q D5i F5q. D5q C5i D5q Rw. L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
	}

	@Override
	public void fim() {
		partitura.add(new Pattern("L1 D5q E5q D5q F5q F5q D5q C5q C5s D5s C5s D5s Ri C5s D5s C5s D5s C5s Ri D5s C5s D3majw.a80d0 L2 D3i Rhi F3i Rhi Rhq Rhq"), 1);
	}
	
}
