package br.com.musicas.opus08.mylonelygirl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;
import br.com.musicas.main.Opus;

public class Opus08 extends Opus{

	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	public Opus08() {
		instrumentos.add(new Piano());
		instrumentos.add(new Baixo());
		instrumentos.add(new Bateria());
		instrumentos.add(new Cordas());
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
		return "My lonely girl";
	}

	@Override
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}
	
	public static void main(String[] args) throws IOException {
		Opus08 opus = new Opus08();
		
//		opus.play();
//		opus.criaAlbum();
		opus.criaMusicaPorInstrumento();		
	}
	
}
