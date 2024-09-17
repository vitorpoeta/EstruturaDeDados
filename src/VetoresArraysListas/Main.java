package VetoresArraysListas;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");

        //verificar tamanho e imprimir vetor/array

        System.out.println(vetor.tamanho());
        System.out.println(vetor);

        //buscar elemento

        System.out.println(vetor.busca(2));
        System.out.println(vetor.busca("B"));

        //adicionar

        vetor.adicionar(0, "A");
        System.out.println(vetor);
        System.out.println(vetor.tamanho());

        //remover

        vetor.remover(1);
        System.out.println(vetor);
        System.out.println(vetor.tamanho());

        //remover por busca

        int pos = vetor.busca("A");
        if (pos > -1) {
            vetor.remover(pos);
        } else {
            System.out.println("Elemento nao existe");
        }
        System.out.println(vetor);
        System.out.println(vetor.tamanho());

        //Criando um vetor/array do tipo generico

        VetorGenerico<Object> vetorGenerico = new VetorGenerico<>(3);

        vetorGenerico.adicionar(3);//int (autoboxing para Integer)
        vetorGenerico.adicionar(4);//int (autoboxing para Integer)
        vetorGenerico.adicionar("Tres"); //String
        vetorGenerico.adicionar("Dois"); //String
        vetorGenerico.adicionar(vetor); //Object
        vetorGenerico.adicionar("Tres"); //String

        System.out.println("Tamanho = "+ vetorGenerico.tamanho());
        System.out.println(vetorGenerico);

        //Implementar o metodo contains similar ao ArrayList

        if(vetorGenerico.contem("Tres")){
            System.out.println("Existe");
        }else{
            System.out.println("Nao existe");
        }

        //Implementar similar ao lastIndexOf, ou seja, a ultima aparição de algo q se repete inumeras vezes.

        System.out.println(vetorGenerico.retornarUltimoIndice("Tres"));

        //Implementar ao vetorGenerico um método chamado remove (T elemento).

        vetorGenerico.remover("Dois");
        System.out.println("Tamanho: "+vetorGenerico.tamanho());
        System.out.println(vetorGenerico);

        //Implementar ao vetorGenerico o método obtem (int posição), similar ao get(posicao) do ArrayList.

        System.out.println("Obteve o: "+vetorGenerico.obtem(2));

        //Implementar ao vetorGenerico o método limpar, onde remove todos os elementos do vetor. Similar ao clear.

        vetorGenerico.limpar();
        System.out.println("Tamanho após limpar: "+vetorGenerico.tamanho());
        System.out.println("Vazio: "+vetorGenerico);

        //Exemplo: Tipo generico que aceita somente Strings

        VetorGenerico<String> vetorGenericoString = new VetorGenerico<>(3);

        vetorGenericoString.adicionar("Tres"); //String
        vetorGenericoString.adicionar("Quatro"); //String
        vetorGenericoString.adicionar("Cinco"); //String

        System.out.println("Tamanho = "+ vetorGenericoString.tamanho());
        System.out.println(vetorGenericoString);

    }
}
