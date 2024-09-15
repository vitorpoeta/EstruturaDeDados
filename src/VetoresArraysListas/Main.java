package VetoresArraysListas;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

            vetor.adicionar("B");
            vetor.adicionar("C");
            vetor.adicionar("D");
            vetor.adicionar("E");
            vetor.adicionar("F");

        System.out.println(vetor.tamanho());
        System.out.println(vetor);
        System.out.println(vetor.busca(2));
        System.out.println(vetor.busca("B"));

        vetor.adicionar(0,"A");
        System.out.println(vetor);
        System.out.println(vetor.tamanho());

    }
}
