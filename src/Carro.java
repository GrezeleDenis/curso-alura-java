public class Carro {
    String modeloCarro;
    int anoCarro;
    String corCarro;

    void exibeFichaCarro(){
        System.out.println("O modelo do carro é: " + modeloCarro);
        System.out.println("A cor do Carro é: "+ corCarro);
        System.out.println("O Ano do Carro é: " + anoCarro);
    }

    int idadeCarro() {
        int anoAtual = 2026;
        return anoAtual - anoCarro;
    }
}
