package br.com.musicas.main;

import java.io.IOException;

import br.com.musicas.opus03.Opus03;
import br.com.musicas.opus04.Iloveyou.Opus04;
import br.com.musicas.opus06.morrisonhotel.Opus06;
import br.com.musicas.opus07.iwontbeyourlover.Opus07;
import br.com.musicas.opus08.mylonelygirl.Opus08;
import br.com.musicas.opus09.madman.Opus09;
import br.com.musicas.opus10.memories.Opus10;
import br.com.musicas.opus11.lucille.Opus11;
import br.com.musicas.opus13.nina.Opus13;
import br.com.musicas.opus16.kindoflove.Opus16;
import br.com.musicas.opus17.timetodie.Opus17;

public class Main {

	private Opus opus4;
	private Opus opus6;
	private Opus opus7;
	private Opus opus8;
	private Opus opus9;
	private Opus opus10;
	private Opus opus11;
	private Opus opus13;
	private Opus opus16;
	private Opus opus17;
	private Opus opus3;
	
	public Main() {
		opus4 = new Opus04();
		opus6 = new Opus06();
		opus7 = new Opus07();
		opus8 = new Opus08();
		opus9 = new Opus09();
		opus10 = new Opus10();
		opus11 = new Opus11();
		opus13 = new Opus13();
		opus16 = new Opus16();
		opus17 = new Opus17();
		opus3 = new Opus03();
		
		opus4.setNext(opus6);
		opus6.setNext(opus7);
		opus7.setNext(opus8);
		opus8.setNext(opus9);
		opus9.setNext(opus10);
		opus10.setNext(opus11);
		opus11.setNext(opus13);
		opus13.setNext(opus16);
		opus16.setNext(opus17);
		opus17.setNext(opus3);
		opus3.setNext(null);
	}
	
	private void run() throws IOException {
		opus4.play();
//		opus4.criaAlbum();
//		opus4.criaMusicaPorInstrumento();
	}

	public static void main(String[] args) throws IOException {
		Main main = new Main();
		
		main.run();		
	}
	
}
