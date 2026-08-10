package org.example;

import java.util.ArrayList;

public class Pares {
    public static void main(String[] args) {
    int num = 10;
        System.out.println(pares(num));


    }
    static int pares(int num){
        if (num  == 2){
            return 2;
        }

        else{

            if (num %  2 == 0){
                System.out.println(num);
            }
               return pares(num - 1) ;

        }

    }
}
