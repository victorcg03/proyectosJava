package programaMe;

import java.util.Scanner;

public class Problema466 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int pruebas = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < pruebas; i++){
            solucion();
        }
    }
    public static String solucion(){
        String[] operandos = sc.nextLine().split(" ");
        String output = "";
        if (operandos[0].length() > operandos[1].length()){
            operandos[1] = rellenarCeros(operandos[1], operandos[0].length() - operandos[1].length());
        }
        if (operandos[1].length() > operandos[0].length()){
            operandos[0] = rellenarCeros(operandos[0], operandos[1].length() - operandos[0].length());
        }
        int resto = 0;
        for (int i = operandos[0].length()-1; i >= 0 ; i--) {
            int op1 = Character.getNumericValue(operandos[0].charAt(i));
            int op2 = Character.getNumericValue(operandos[1].charAt(i));
            int resultado = op1 * op2 + resto;
            resto = 0;
            if (Integer.toString(resultado).length() > 1){
                resto = Character.getNumericValue(Integer.toString(resultado).charAt(0));
                resultado = Character.getNumericValue(Integer.toString(resultado).charAt(1));
            }
            output += Integer.toString(resultado);
        }
        if (resto != 0){
            output += Integer.toString(resto);
        }
        return imprimirResultado(output);

    }
    public static String solucion(String numeros){
        String[] operandos = numeros.split(" ");
        String output = "";
        if (operandos[0].length() > operandos[1].length()){
            operandos[1] = rellenarCeros(operandos[1], operandos[0].length() - operandos[1].length());
        }
        if (operandos[1].length() > operandos[0].length()){
            operandos[0] = rellenarCeros(operandos[0], operandos[1].length() - operandos[0].length());
        }
        int resto = 0;
        for (int i = operandos[0].length()-1; i >= 0 ; i--) {
            int op1 = Character.getNumericValue(operandos[0].charAt(i));
            int op2 = Character.getNumericValue(operandos[1].charAt(i));
            int resultado = op1 * op2 + resto;
            resto = 0;
            if (Integer.toString(resultado).length() > 1){
                resto = Character.getNumericValue(Integer.toString(resultado).charAt(0));
                resultado = Character.getNumericValue(Integer.toString(resultado).charAt(1));
            }
            output += Integer.toString(resultado);
        }
        if (resto != 0){
            output += Integer.toString(resto);
        }
        return imprimirResultado(output);

    }
    public static String rellenarCeros(String str, int n) {
        String devolver = "";
        for (int i = 0; i < n; i++) {
            devolver += "0";
        }
        devolver+=str;
        return devolver;
    }
    public static String imprimirResultado(String resultado){
        String devolver = "";
        for (int i = resultado.length()-1; i >= 0; i--) {
            devolver += resultado.charAt(i);
        }
        System.out.println(devolver);
        return devolver;
    }
}
