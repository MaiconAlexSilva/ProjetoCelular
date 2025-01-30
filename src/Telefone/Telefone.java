package Telefone;

public class Telefone implements TelefoneMovel{
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atender telefone");
    }

    @Override
    public void correioVoz() {
        System.out.println("Escutando correio de voz");
    }
}
