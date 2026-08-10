package org.example;

import java.util.ArrayList;

public class Achar_menor_valor {


    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);
        System.out.println(achar_menor(numList));
    }


    static int achar_menor(ArrayList<Integer> numlist){

        int menor =0;

        if(numlist.size() == 1){
            return numlist.get(0);
        }

        else {

            return achar_menor(numlist);

        }
    }
}
