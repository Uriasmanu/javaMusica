import javaMusica.modelos.Musicas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musicas musica = new Musicas();
        musica.Curti(true);
        musica.Reproduzido(true);
        musica.Reproduzido(true);
        musica.getCantor("Marcos");
        musica.classificar(7);
        musica.setTitulo("Marca da Promessa");
        musica.setDuracao(200);

        musica.ExibeFicha();

    }
}