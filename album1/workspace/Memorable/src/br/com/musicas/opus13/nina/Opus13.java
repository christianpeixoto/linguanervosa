package br.com.musicas.opus13.nina;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;
import br.com.musicas.main.Opus;


public class Opus13 extends Opus{

	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	public Opus13() {
		instrumentos.add(new Bateria());
		instrumentos.add(new Baixo());
		instrumentos.add(new Coro());
		instrumentos.add(new Saxofone());
		instrumentos.add(new Violao());
//		instrumentos.add(new Voz());
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
		return "Nina";
	}

	@Override
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public static void main(String[] args) throws IOException {
		Opus13 opus = new Opus13();

		opus.play();
//		opus.criaAlbum();
//		opus.criaMusicaPorInstrumento(opus.getInstrumentos());
	}
	
}
