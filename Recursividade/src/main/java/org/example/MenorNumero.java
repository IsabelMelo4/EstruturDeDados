package org.example;

import java.util.ArrayList;

public class MenorNumero {

    public static void main(String[] args) {
        int posicao;

        ArrayList<Integer> listNum = new ArrayList<>();
        listNum.add(18);
        listNum.add(1);
        listNum.add(7);
        listNum.add(6);
        System.out.println(menorValor(listNum));

    }

    static int menorValor(ArrayList<Integer> listNum) {
        int menor = 0;

        if (listNum.size() == 1) {
            return listNum.get(0);
        }
            if(menor < listNum.get(0)){
                menor = listNum.get(0);
                System.out.println(listNum);
            }

            listNum.remove(0);
            menorValor(listNum);
            return menor;

    }




    }







