import musica.ReprodutorMusical;
import navegador.NavegadorInternet;
import telefone.AparelhoTelefonico;

public class Funcionalidade {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.bateria();

        System.out.println();

        AparelhoTelefonico telefonema = iphone;

        telefonema.ligar("11 4325-9876");
        telefonema.atender();
        telefonema.iniciarCorreioVoz();

        System.out.println();

        ReprodutorMusical musica = iphone;

        musica.tocar();
        musica.pausar();
        musica.selecionarMusica("ColdPlay");

        System.out.println();

        NavegadorInternet internet = iphone;

        internet.adicionarNovaAba();
        internet.atualizarPagina();
        internet.exibirPagina("Youtube");

        System.out.println();

        iphone.desligar();
    }
}
