import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        Calculadora calculadora = new Calculadora();
        System.out.println("Insira um número para saber o valor dobrado");
        //int resultado = calculadora.exibeDobro(5);
        int resultado = leitura.nextInt();
        int valor = calculadora.exibeDobro(resultado);
        System.out.println("O dobro do número é " + valor);

        Musica musica = new Musica();
        musica.titulo = "O sol";
        musica.artista = "Victor Klei";
        musica.anoMusica = 2018;

        musica.exibeMusica();
        musica.avaliarMusica(9);
        musica.avaliarMusica(7);
        musica.avaliarMusica(5);
        musica.avaliarMusica(8);

        double mediaDasMusicas = musica.mediaMusica();
        System.out.println("Média das Avaliações: " + mediaDasMusicas);

        Carro meuCarro = new Carro();
        meuCarro.modeloCarro = "Fiat Toro";
        meuCarro.corCarro = "Branco";
        meuCarro.anoCarro = 2020;

        meuCarro.exibeFichaCarro();
        System.out.println("Idade do carro: " + meuCarro.idadeCarro() + " anos");

        Aluno aluno = new Aluno();
        aluno.nome = "Denis";
        aluno.idade = 24;

        aluno.exibeAluno();

    }
}
