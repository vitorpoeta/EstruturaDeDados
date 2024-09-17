package VetoresArraysListas;

import java.util.ArrayList;

public class ArrayListTeste {

    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();

        //Adicionou F e G
        arrayList.add("F");
        arrayList.add("G");
        System.out.println(arrayList);

        //Adicionou o E na posicao 0
        arrayList.add(0, "E");
        System.out.println(arrayList);

        //Algoritmo de busca
        boolean existe = arrayList.contains("F");
        if(existe){
            System.out.println("Existe");
        }else{
            System.out.println("Nao existe");
        }

        //Algoritmo que busca a posicao do elemento
        int posicao = arrayList.indexOf("G");
        if(posicao > -1){
            System.out.println("Elemento existe na posicao "+posicao);
        }else{
            System.out.println("Elemento nao existe no array "+ posicao);
        }
        //Algoritmo que retorna o elemento da posicao
        System.out.println(arrayList.get(2));

        //Remover o elemento de index 2
        arrayList.remove(2);
        System.out.println(arrayList);

        //Remover o elemento "G"
        arrayList.remove("F");
        System.out.println(arrayList);

        //Tamanho do arrayList
        System.out.println(arrayList.size());



    }
}
