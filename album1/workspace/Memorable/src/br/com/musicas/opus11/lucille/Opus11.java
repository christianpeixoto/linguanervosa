package br.com.musicas.opus11.lucille;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;
import br.com.musicas.main.Opus;


public class Opus11 extends Opus{

	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	public Opus11() {
		instrumentos.add(new Baixo());
		instrumentos.add(new Flautim());
		instrumentos.add(new Violao());
		instrumentos.add(new Pandeireta());
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
		return "Lucille";
	}

	@Override
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public static void main(String[] args) throws IOException {
		Opus11 opus = new Opus11();

		opus.play();
//		opus.criaAlbum();
//		opus.criaMusicaPorInstrumento(opus.getInstrumentos());
	}
	
}
