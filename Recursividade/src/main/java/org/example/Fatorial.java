package org.example;

public class Fatorial {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(fatorial(num));

    }


    static int fatorial(int num){

        if(num == 1){
            return 1;
        }

        else {

            return num * fatorial(num - 1);
        }

    }

}
