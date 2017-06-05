package br.com.musicas.opus05.havinaball;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;
import br.com.musicas.main.Opus;


public class Opus05 extends Opus{

	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	public Opus05() {
		instrumentos.add(new Baixo());
		instrumentos.add(new Bateria());
		instrumentos.add(new Guitarra());
		instrumentos.add(new Guitarra2());
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
		return "Havin' a ball";
	}

	@Override
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public static void main(String[] args) throws IOException {
		Opus05 opus = new Opus05();
		
		opus.play();
//		opus.criaAlbum();
//		opus.criaMusicaPorInstrumento();
	
	}
	
}
