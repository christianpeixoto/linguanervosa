package br.com.musicas.opus10.memories;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;
import br.com.musicas.main.Opus;


public class Opus10 extends Opus{

	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	public Opus10() {
		instrumentos.add(new Baixo());
		instrumentos.add(new Bateria());
		instrumentos.add(new Orgao_mao_esquerda());
		instrumentos.add(new Oboe());
		instrumentos.add(new Orgao_mao_direita());
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
		return "Memories";
	}

	@Override
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public static void main(String[] args) throws IOException {
		Opus10 opus = new Opus10();

		opus.play();
//		opus.criaAlbum();
//		opus.criaMusicaPorInstrumento(opus.getInstrumentos());
	}
	
}
