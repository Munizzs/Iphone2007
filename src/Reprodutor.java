import musica.ReprodutorMusical;

public class Reprodutor implements ReprodutorMusical{

    public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica "+musica+" selecionada");
    }
}
