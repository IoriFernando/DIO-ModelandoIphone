package main;

import main.interfaces.AparelhoTelefonico;
import main.interfaces.NavegadorDeInternet;
import main.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{

	public static void main(String[] args) {
	
		
		Iphone iphone1 = new Iphone();
		System.out.println("Usando interface no java modelando o Iphone:");
		System.out.println("");
		
		
		System.out.println("Funções de um aparelho eletrônico:");
		
		String numero = "9999-9999";
		
		iphone1.ligar(numero);
		iphone1.atender();
		iphone1.iniciarCorreioVoz();
		
		System.out.println("Funções de um navegador de internet:");
		
		String url ="dio.me";
		
		iphone1.exibirPagina(url);
		iphone1.adicionarNovaAba();
		iphone1.atualizarPagina();
		
		
		System.out.println("Funções de um reprodutor musical:");
		
		String musica = "Toxicity - System of a down";
		
		iphone1.selecionarmusica(musica);
		iphone1.tocar();
		iphone1.pausar();

	}

	@Override
	public void tocar() {
		
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
		
		System.out.println("Música pausada.");
		
	}

	@Override
	public void selecionarmusica(String musica) {
		System.out.println("Musica selecionada: "+musica);
		
	}

	@Override
	public void exibirPagina(String url) {

		System.err.println("Exibindo: "+url);
		
	}

	@Override
	public void adicionarNovaAba() {
		
		System.out.println("Nova aba adcioanada");
		
	}

	@Override
	public void atualizarPagina() {
		
		System.out.println("Página atualizada");
		
	}

	@Override
	public void ligar(String numero) {
	
		System.out.println("Ligando...");
		
	}

	@Override
	public void atender() {
	
		System.out.println("Atendendo");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado.");
		
	}

}
