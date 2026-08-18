package org.example;

import java.util.ArrayList;

public class Soma {

    public static void main(String[] args) {
        ArrayList<Integer> listaSoma = new ArrayList<>();

        listaSoma.add(2);
        listaSoma.add(5);
        listaSoma.add(8);
        listaSoma.add(3);


        System.out.println(somar(listaSoma));
    }


static int somar(ArrayList<Integer> listaSoma){


        if (listaSoma.size() == 1){
            return listaSoma.get(0);
        }


        else {
            int result = listaSoma.get(0);
           listaSoma.remove(0);
            return result + somar(listaSoma);

        }



        }



    }



