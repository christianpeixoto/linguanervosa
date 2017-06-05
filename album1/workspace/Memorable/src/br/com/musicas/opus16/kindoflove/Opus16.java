package br.com.musicas.opus16.kindoflove;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;
import br.com.musicas.main.Opus;


public class Opus16 extends Opus{

	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	public Opus16() {
		instrumentos.add(new Bateria());
		instrumentos.add(new Baixo());
		instrumentos.add(new Guitarra());
		instrumentos.add(new Gaita());
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
		return "Kind of love";
	}

	@Override
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}

	public static void main(String[] args) throws IOException {
		Opus16 opus = new Opus16();

		opus.play();
//		opus.criaAlbum();
//		opus.criaMusicaPorInstrumento(opus.getInstrumentos());
	}
	
}
