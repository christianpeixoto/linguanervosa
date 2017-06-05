package br.com.musicas.opus17.timetodie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;
import br.com.musicas.main.Opus;


public class Opus17 extends Opus{

	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	public Opus17() {
		instrumentos.add(new Baixo());
		instrumentos.add(new Bateria());
		instrumentos.add(new Cello());
		instrumentos.add(new Cordas());
		instrumentos.add(new Piano());
		instrumentos.add(new Viola());
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
		return "Time to die";
	}

	@Override
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}


	public static void main(String[] args) throws IOException {
		Opus17 opus = new Opus17();

		opus.play();
//		opus.criaAlbum();
//		opus.criaMusicaPorInstrumento();
	}
	
}
