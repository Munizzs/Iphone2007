import telefone.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando para o numero "+numero);
    }

    public void atender() {
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
}
