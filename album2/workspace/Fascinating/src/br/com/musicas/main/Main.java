package br.com.musicas.main;

import java.io.IOException;

import br.com.musicas.opus01.Opus01;
import br.com.musicas.opus02.Opus02;
import br.com.musicas.opus05.havinaball.Opus05;
import br.com.musicas.opus12.todayyourlove.Opus12;
import br.com.musicas.opus14.thebluetraveller.Opus14;
import br.com.musicas.opus15.loveanddeath.Opus15;

public class Main {

	private Opus opus1;
	private Opus opus2;
	private Opus opus5;
	private Opus opus12;
	private Opus opus14;
	private Opus opus15;
	
	public Main() {
		opus1 = new Opus01();
		opus2 = new Opus02();
		opus5 = new Opus05();
		opus12 = new Opus12();
		opus14 = new Opus14();
		opus15 = new Opus15();
		
		opus1.setNext(opus2);
		opus2.setNext(opus5);
		opus5.setNext(opus12);
		opus12.setNext(opus14);
		opus14.setNext(opus15);
		opus15.setNext(null);		
	}
	
	private void run() throws IOException {
//		opus1.play();
//		opus1.criaAlbum();
		opus1.criaMusicaPorInstrumento();
	}

	public static void main(String[] args) throws IOException {
		Main main = new Main();
		
		main.run();		
	}
	
}
