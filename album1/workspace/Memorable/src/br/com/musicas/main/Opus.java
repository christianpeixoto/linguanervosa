package br.com.musicas.main;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

import org.jfugue.Pattern;
import org.jfugue.Player;

import br.com.musicas.util.Mid2WavRenderer;

public abstract class Opus {
	
	protected Opus proximo;

	public abstract void setNext(Opus opus);

	public abstract Pattern getMusica();
	
	public abstract List<Instrumento> getInstrumentos();
	
	public abstract String getNome();
	
	public void criaAlbum() throws IOException {
		try {
			Mid2WavRenderer renderer = new Mid2WavRenderer();
			int[] patches = {32,37,43,28,56,42,29,31,3,65,40,33,61,19};
			renderer.createWavFile(new File("soundbank-emg.sf2"), patches, this.getMusica(), new File("wav/" + this.getNome()));
			
		} catch (MidiUnavailableException | InvalidMidiDataException e) {
			e.printStackTrace();
		}

		if(this.proximo != null){
			this.proximo.criaAlbum();
		}else{
			System.exit(0);
		}
	}

	public void criaMusicaPorInstrumento() throws IOException {
		for (Instrumento instrumento: this.getInstrumentos()) {
			try {
				Mid2WavRenderer renderer = new Mid2WavRenderer();
				int[] patches = {32,37,43,28,56,42,29,31,3,65,40,33,61,19};
				renderer.createWavFile(new File("soundbank-emg.sf2"), patches, instrumento.getPartitura(), new File("wav/" + this.getNome() + "-" + instrumento.getNome()));
				
			} catch (MidiUnavailableException | InvalidMidiDataException e) {
				e.printStackTrace();
			}			
		}
		if(this.proximo != null){
			this.proximo.criaMusicaPorInstrumento();
		}else{
			System.exit(0);
		}
	}
	
	public void play() {
		Player player = new Player();
		player.play(this.getMusica());	
		
		if(this.proximo != null){
			this.proximo.play();
		}else{
			System.exit(0);
		}
	}
	
	public void criaMidi() throws IOException {
		Player player = new Player();
		player.saveMidi(this.getMusica(), new File("mid/" + this.getNome() + ".mid"));	
		
		if(this.proximo != null){
			this.proximo.play();
		}else{
			System.exit(0);
		}
	}
	
}
