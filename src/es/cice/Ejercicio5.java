package es.cice;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        int[] numeros = {0,1,2,3,4,5,6,7,8,9};
        int num =0;
        for(int n : numeros){
            num+=n;

        }

        System.out.println("El resultado es:" + num);

    }
}
