package br.com.musicas.opus07.iwontbeyourlover;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jfugue.Pattern;

import br.com.musicas.main.Instrumento;
import br.com.musicas.main.Opus;

public class Opus07 extends Opus{

	private List<Instrumento> instrumentos = new ArrayList<Instrumento>();
	
	public Opus07() {
		instrumentos.add(new Guitarra());
		instrumentos.add(new Baixo());
		instrumentos.add(new Bateria());
		instrumentos.add(new Solo());
		instrumentos.add(new Coro());
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
		return "I won't be your lover";
	}

	@Override
	public List<Instrumento> getInstrumentos() {
		return instrumentos;
	}
	
	public static void main(String[] args) throws IOException {
		Opus07 opus = new Opus07();
		
		opus.play();
//		opus.criaAlbum();	
//		opus.criaMusicaPorInstrumento(opus.getInstrumentos());
	}
	
}
