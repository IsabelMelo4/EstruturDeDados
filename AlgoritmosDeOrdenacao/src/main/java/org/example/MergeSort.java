package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class MergeSort {


    public static void main(String[] args) {

        ArrayList<Integer> listaMerge = new ArrayList<>();
        listaMerge.add(1);
        listaMerge.add(7);
        listaMerge.add(15);
        listaMerge.add(4);
        listaMerge.add(9);
        listaMerge.add(12);
        listaMerge.add(6);

       System.out.println(listaMerge);
        System.out.println(mergeSort(listaMerge));
        System.out.println(maiorNumero(mergeSort(listaMerge)));


    }


    public static ArrayList<Integer> mergeSort(ArrayList<Integer> lista){

        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();

        if(lista.size() <= 1){
             return lista;
        }

        for(int i = 0; i < lista.size()/2; i++ ){
            l1.add(lista.get(i));
        }
        for(int j = lista.size()/2; j < lista.size();  j++){
            l2.add(lista.get(j));
        }

            l1 =  mergeSort(l1);
            l2 =  mergeSort(l2);

        //System.out.println(l1);
       // System.out.println(l2);
         return mesclar(l1,l2);
    }


    public static ArrayList<Integer>  mesclar(ArrayList<Integer> listaA, ArrayList<Integer> listaB){

        ArrayList<Integer> listaC = new ArrayList<>();
        while (listaA.size() > 0 && listaB.size() > 0){

            if (listaA.get(0) < listaB.get(0)){
                listaC.add(listaA.get(0));
                listaA.remove(0);
            }
            else  {
                listaC.addLast(listaB.get(0));
                listaB.remove(0);
            }

        }

        while (listaA.size() > 0){
            listaC.add(listaA.get(0));
            listaA.remove(0);

        }
        while (listaB.size() > 0){
            listaC.add(listaB.get(0));
            listaB.remove(0);

        }
            return listaC;
    }

    public static ArrayList<Integer> maiorNumero(ArrayList<Integer> lista){
                ArrayList<Integer> listaMaior = new ArrayList<>();
                mergeSort(lista);
                for(int i = lista.get(lista.size()-1); listaMaior.size() < 2; i++){
                    mergeSort(lista);
                    listaMaior.add(lista.get(lista.size()-1));
                    lista.remove(lista.size()-1);
                }
                System.out.println(listaMaior);
                return listaMaior;
    }


}
