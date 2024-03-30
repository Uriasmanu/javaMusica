package javaMusica.modelos;

public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificacao;

    private boolean reproduzir = false;

    public boolean curtiu = false;

    public void setTitulo(String título) {
        this.titulo = título;
    }

    public void setDuracao(int duração) {
        this.duracao = duração;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void Curti (boolean curtir){
        curtiu = true;
    }

    public int Reproduzido (boolean reproduzir){
        return totalDeReproducoes += 1;
    }

    public int classificar(int classificacao) {
        if (classificacao < 0 || classificacao > 10) {
            return -1;
        } else {
            this.classificacao = classificacao;
            return this.classificacao;
        }
    }
    public void ExibeFicha (){
        System.out.println(titulo);
        System.out.println(duracao);
        System.out.println(totalDeReproducoes);
        System.out.println(classificacao);
        System.out.println(curtiu);
    }
}
