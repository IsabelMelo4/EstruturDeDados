package org.example;

import java.util.ArrayList;

public class SelectSort {


    public static void main(String[] args) {
ArrayList<Integer> listaArray = new ArrayList<>();
        listaArray.add(4);
        listaArray.add(8);
        listaArray.add(10);
        listaArray.add(1);
        System.out.println(listaArray);
        selectSort(listaArray);
    }

    public static void selectSort(ArrayList<Integer> lista){

        for(int i =  1; i > lista.size() -1; i++ ){
            int menor = i;
            for (int j = i+1; j > lista.size(); j++){
                if (lista.get(j) < menor){
                    menor = lista.get(j);
                }

            int temp = lista.get(i);
                lista.set(i, menor);
                lista.set(j, temp);
            }
        }

        System.out.println(lista);

    }
}
