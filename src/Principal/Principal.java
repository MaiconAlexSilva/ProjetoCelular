package Principal;

import AparelhoMultifuncional.TelefoneMultifuncional;

public class Principal {
    public static void main(String[] args) {
        TelefoneMultifuncional celular = new TelefoneMultifuncional();

        celular.ligar();
        celular.atender();
        celular.correioVoz();
        System.out.println("---------");
        celular.exibirPagina();
        celular.atualizarPagina();
        celular.adicionarPagina();
        System.out.println("---------");
        celular.selecionarMusica();
        celular.tocar();
        celular.pausar();
    }
}
