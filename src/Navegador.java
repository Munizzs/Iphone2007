import navegador.NavegadorInternet;

public class Navegador implements NavegadorInternet{

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: "+url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}
