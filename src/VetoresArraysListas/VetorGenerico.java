package VetoresArraysListas;

import java.util.Arrays;

public class VetorGenerico<T> {

    private T [] elementos;
    private int tamanho;

    public VetorGenerico(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adicionar(T elemento){
        this.aumentarCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }else{
            return false;
        }
    }

    public boolean adicionar(int posicao, T elemento){

        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        this.aumentarCapacidade();
        //mover todos os elementos
        for(int i=this.tamanho-1;i>=posicao;i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public void remover(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        for(int i=posicao;i<this.tamanho-1;i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    public int tamanho(){
        return this.tamanho;
    }

    private void aumentarCapacidade(){
        if(this.tamanho == this.elementos.length){
            T [] elementosNovos = (T[]) new Object [this.elementos.length * 2] ;
            for(int i=0;i<this.tamanho;i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public T busca(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posicao invalida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento){
        for(int i=0;i<this.tamanho;i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento){
        for(int i=0;i<this.tamanho;i++){
            if (this.elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;

        // ou somente, return busca(elemento) >-1
    }

    public int retornarUltimoIndice(T elemento){
        int ultimaPos = -1;
        for(int i=0;i<this.tamanho;i++){
            if (this.elementos[i].equals(elemento)) {
                ultimaPos = i;
            }
        }
        return ultimaPos;
    }

    public void remover(T elemento){
        int pos = this.busca(elemento);
        if(pos>-1){
            this.remover(pos);
        }
    }

    public T obtem(int posicao){
        return busca(posicao);
    }

    public void limpar(){
        for(int i=tamanho-1;i>=0;i--){
            remover(this.elementos[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i=0;i<this.tamanho-1;i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if(this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }
        s.append("]");
        return s.toString();
    }
}
