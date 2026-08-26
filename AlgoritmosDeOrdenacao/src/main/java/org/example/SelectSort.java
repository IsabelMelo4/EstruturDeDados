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
        System.out.println(listaArray);
    }

    public static void selectSort(ArrayList<Integer> lista){

        for(int i =  0; i <= lista.size() -2; i++ ){
            int menor = i;
            for (int j = i+1; j <= lista.size()-1; j++){
                if (lista.get(j) < lista.get(menor)){
                    menor = j;
                }

                int temp = lista.get(i);
                lista.set(i, lista.get(menor));
                lista.set(menor, temp);
            }

        }

     //   System.out.println(lista);

    }


}
