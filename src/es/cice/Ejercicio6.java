package es.cice;

public class Ejercicio6 {

    public static void main(String[] args) {

        int[] numeros = {0,1,2,3,4,5,-6,7,-8,9};

        int i=0;

        while(numeros[i]>=0){
            ++i;
        }

        System.out.println("El primer numero negativo esta en la posicion: "  + (++i));

    }
}
