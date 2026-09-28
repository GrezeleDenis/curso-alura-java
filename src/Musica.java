public class Musica {
    String titulo;
    String artista;
    int anoMusica;
    double avalicao;
    int totalAvaliacoes;

    void exibeMusica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento da música: " + anoMusica);
    }
    void avaliarMusica(double nota) {
        avalicao += nota;
        totalAvaliacoes ++;
    }
    double mediaMusica() {
        return avalicao / totalAvaliacoes;
    }
}
