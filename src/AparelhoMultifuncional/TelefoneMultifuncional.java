package AparelhoMultifuncional;

import Internet.NavegadorInternet;
import Musica.TocadorMusica;
import Telefone.TelefoneMovel;

public class TelefoneMultifuncional implements NavegadorInternet, TocadorMusica, TelefoneMovel {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando nova página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para outro telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void correioVoz() {
        System.out.println("Escutando correio de voz");
    }
}
