package entities;

import services.AparelhoTelefonico;
import services.NavegadorInternet;
import services.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Reproduzindo música...");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");		
	}

	@Override
	public void selecionarMusica(String musica){
		System.out.println("Música " + musica + " selecionada");	
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página...");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");	
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero + "..." );
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação...");
	}

	@Override
	public void enviarCorreioVoz() {
		System.out.println("Correio de voz enviado");
	}

}
