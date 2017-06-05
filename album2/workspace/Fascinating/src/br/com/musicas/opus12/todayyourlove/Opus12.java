package br.com.musicas.opus12.todayyourlove;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;
import br.com.musicas.main.Opus;

public class Opus12 extends Opus{

	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	public Opus12() {
		instrumentos.add(new Baixo());
		instrumentos.add(new Bateria());
		instrumentos.add(new Guitarra());
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
		return "Today your love";
	}

	@Override
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public static void main(String[] args) throws IOException {
		Opus12 opus = new Opus12();
		
		opus.play();
//		opus.criaAlbum();
//		opus.criaMusicaPorInstrumento();
	
	}
	
}
