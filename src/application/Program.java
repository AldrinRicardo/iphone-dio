package application;

import entities.Iphone;

public class Program {

	public static void main(String[] args) {
		
		Iphone iPhone = new Iphone();
		iPhone.selecionarMusica("Radioactive");
		iPhone.tocar();
		iPhone.pausar();
		iPhone.adicionarNovaAba();
		iPhone.exibirPagina("www.google.com.br");
		iPhone.atualizarPagina();
		iPhone.atender();
		iPhone.ligar("(99)99999-9999");
		iPhone.enviarCorreioVoz();
	}

}
