package es.cice;

public class Bucles {

    public static void main(String[] args) {


        //for vacio bucle infinito
        for(;;){
            System.out.println("hola");
            break;

        }


        //foreach
        int[] numeros = {0,1,2,3};
        for(int n : numeros){
            System.out.println("El numero es:" + n);

        }

    }
}
