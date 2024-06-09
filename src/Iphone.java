import musica.ReprodutorMusical;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;

import java.util.Random;

public class Iphone implements AparelhoTelefonico,NavegadorInternet, ReprodutorMusical {

    public void ligar(){
        System.out.println("Ligado");
    }

    public void desligar(){
        System.out.println("Desligado");
    }

    public void bateria(){
        Random rand = new Random();

        int bateria = rand.nextInt(1,101);

        System.out.printf("Bateria: %d%%\n",bateria);
    }


    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica "+musica+" selecionada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
}
