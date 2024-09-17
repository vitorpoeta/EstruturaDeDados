package VetoresArraysListasExercicios;

public class Main {
    public static void main(String [] args){
        //Todos os exercícios serão realizados no pacote "VetoresArraysListas" e estarão funcionando, mas
        // colocarei aq somente as respostas comentadas.

        //Exercício 1 - Implementar ao vetorGenerico o método contains, que seja similar ao do ArrayList (contains).
        /*
        Maneira que eu resolvi:
        for(int i=0;i<this.tamanho;i++){
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;

        Maneira da professora:
            return busca(elemento) >-1;
        */

        //Exercício 2 - Implementar ao vetorGenerico o método ultimoIndice, que seja similar ao do ArrayList (lastIndexOf).
        /*
        public int retornaUltimoIndice(T elemento){
            int ultimaPos = -1;
            for(int i=0;i<this.tamanho;i++){
                if (this.elementos[i].equals(elemento)) {
                    ultimaPos = i;
                }
            }
            return ultimaPos;
        }
        */

        //Exercício 3 - Implementar ao vetorGenerico um método chamado remove (T elemento).
        /* Reutilização do método remover(int pos)
        public void remover(T elemento){
            int pos = this.busca(elemento);
            if(pos>-1){
                this.remover(pos);
            }
        }
        */

        //Exercício 4 - Implementar ao vetorGenerico o método obtem (int posição), similar ao get(posicao) do ArrayList.
        /*
            public T obtem(int posicao){
                return busca(posicao);
            }
        */

        //Exercício 5 - Implementar ao vetorGenerico o método limpar, onde remove todos os elementos do vetor. Similar ao clear.
        /*
            public void limpar(){
                for(int i=tamanho-1;i>=0;i--){
                    remover(this.elementos[i]);
                }
            }

            ou

            for(int i=0;i<tamanho;i++){
                this.elementos[i] = null
            }
            this.tamanho = 0;

        */

    }
}
