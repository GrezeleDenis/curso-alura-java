package br.com.denis.screenmatch.principal;

import br.com.denis.screenmatch.calculos.CalculadoraDeTempo;
import br.com.denis.screenmatch.calculos.FiltroRecomendacao;
import br.com.denis.screenmatch.modelos.Episodio;
import br.com.denis.screenmatch.modelos.Filme;
import br.com.denis.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        //meuFilme.nome = "O poderoso chefão!";
//        meuFilme.setNome("O poderoso Chefão");
        //meuFilme.anoDeLancamento = 1970;
//        meuFilme.setAnoDeLancamento(1970);
        //meuFilme.duracaoEmMinutos = 180;
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        //System.out.println(meuFilme.somaDasAvaliacoes);
        //System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println("O Total de avaliações é " + meuFilme.getTotalDeAvaliacoes());
        //System.out.println("Média das avaliações do filme" + meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2016);
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2016);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(7);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("A nova Onda do Imperador", 2000);
//        outroFilme.setNome("A nova Onda do Imperador");
//        outroFilme.setAnoDeLancamento(2000);
        outroFilme.setDuracaoEmMinutos(176);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);

//        ou
//        var filmeDoPaulo = new Filme();

        filmeDoPaulo.setDuracaoEmMinutos(200);
//        filmeDoPaulo.setNome("Dogville");
//        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da Lista " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());



    }
}