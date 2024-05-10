package programaMe;

import java.util.Arrays;
import java.util.Scanner;

public class Problema100 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numCasos = sc.nextInt();
        for (int i = 0; i < numCasos; i++) {
            System.out.println(solucion(sc.nextInt()));
        }
    }
    public static int solucion(int n){
        if (comprobarRep(n)){
            return 8;
        }
        if (n == 6174){
            return 0;
        }
        vueltas = 0;
        kaprekar(n);
        return vueltas;
    }
    static int vueltas = 0;
    public static void kaprekar(int numero) {
        vueltas++;
        int resultado = deMayorAmenor(numero) - deMenorAmayor(numero);
        if (resultado != 6174){
            kaprekar(resultado);
        }
    }
    public static boolean comprobarRep(int n){
        String numero = Integer.toString(n);
        char c = numero.charAt(0);
        for (int i = 1; i < numero.length(); i++) {
            if (c != numero.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static int deMenorAmayor(int numero) {
        // Paso 1: Convertir el número en una cadena
        String numeroStr = Integer.toString(numero);
        while (numeroStr.length() < 4) {
            numeroStr = "0" + numeroStr;
        }
        // Paso 2: Convertir la cadena en una matriz de caracteres
        char[] digitos = numeroStr.toCharArray();

        // Paso 3: Ordenar la matriz de caracteres en orden ascendente
        Arrays.sort(digitos);

        // Paso 4: Construir una nueva cadena a partir de la matriz de caracteres ordenada
        String numeroOrdenadoStr = new String(digitos);

        while (numeroOrdenadoStr.length() < 4) {
            numeroOrdenadoStr = "0" + numeroOrdenadoStr;
        }

        // Retornar el número ordenado
        return Integer.parseInt(numeroOrdenadoStr);
    }
    public static int deMayorAmenor(int numero) {

        // Paso 1: Convertir el número en una cadena
        String numeroStr = Integer.toString(numero);
        while (numeroStr.length() < 4) {
            numeroStr = "0" + numeroStr;
        }
        // Paso 2: Convertir la cadena en una matriz de caracteres
        char[] digitos = numeroStr.toCharArray();

        // Paso 3: Ordenar la matriz de caracteres en orden descendente
        Arrays.sort(digitos);
        // Revertir el orden para obtener el orden descendente
        char[] digitosDescendente = new char[digitos.length];
        for (int i = 0; i < digitos.length; i++) {
            digitosDescendente[i] = digitos[digitos.length - 1 - i];
        }

        // Paso 4: Construir una nueva cadena a partir de la matriz de caracteres ordenada
        String numeroOrdenadoStr = new String(digitosDescendente);


        // Retornar el número ordenado
        return Integer.parseInt(numeroOrdenadoStr);
    }
}
