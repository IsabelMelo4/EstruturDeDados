package org.example;

import java.util.ArrayList;

public class MenorNumero {

    public static void main(String[] args) {
        int posicao = 0;

        ArrayList<Integer> listNum = new ArrayList<>();
        listNum.add(18);
        listNum.add(1);
        listNum.add(7);
        listNum.add(6);

        System.out.println(menorValor(listNum, posicao));

    }

    public static int menorValor(ArrayList<Integer> listNum, int pos) {

        if (pos == listNum.size() - 1) {
            return listNum.get(pos);

        } else if (listNum.get(pos) < menorValor(listNum, pos + 1)) {
            return listNum.get(pos);
        }

        else {
           return menorValor(listNum, pos+1);

        }
    }}