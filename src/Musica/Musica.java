package Musica;

public class Musica implements TocadorMusica {
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar musica");
    }
}
