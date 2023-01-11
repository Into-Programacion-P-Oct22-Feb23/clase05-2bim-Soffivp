/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int tamaño;
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio

        System.out.println("Ingrese el tamaño del arreglo");
        tamaño = entrada.nextInt();
        int[] array = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese los valores del arreglo");
            array[i] = entrada.nextInt();
        }
        System.out.printf("La suma total es: %d\n",
                misterio(array, tamaño));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}











