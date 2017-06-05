package br.com.musicas.opus01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;
import br.com.musicas.main.Opus;

public class Opus01 extends Opus{

	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	public Opus01() {
		instrumentos.add(new Violino());
		instrumentos.add(new Viola());
		instrumentos.add(new Cello());
		instrumentos.add(new Contrabaixo());
		instrumentos.add(new Trompa());
		instrumentos.add(new Tuba());
		instrumentos.add(new Trombone());
		instrumentos.add(new Timpano());
	}
	
	@Override
	public void setNext(Opus opus) {
		this.proximo = opus;
	}
	
	@Override
	public Pattern getMusica(){	
		Pattern roundSong = new Pattern();
		
		for (Instrumento instrumento : instrumentos) {
			roundSong.add(instrumento.getPartitura());			
		}
				
		return roundSong;
	}
	
	@Override
	public String getNome(){
		return "Opus 1";
	}

	@Override
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public static void main(String[] args) throws IOException {
		Opus01 opus = new Opus01();
		
//		opus.play();
		opus.criaAlbum();
//		opus.criaMusicaPorInstrumento();
	
	}	
	
}
