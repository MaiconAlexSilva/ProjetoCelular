package Internet;

public class Internet implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando página");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
}
