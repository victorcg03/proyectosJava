package programaMe;

import java.util.Scanner;

public class ProgramicaDesafio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Pedida de datos
        int numeroPedidos = entrada.nextInt();
        for (int i = 0; i < numeroPedidos; i++) {
            System.out.println(cuentaVueltas(entrada.nextInt()));
        }
    }

    public static int cuentaVueltas (int EsteNumero){
        if(esTodoIgual(EsteNumero)){
            return 8;
        }
        int contador = 0;
        while(EsteNumero != 6174){
            EsteNumero = (deMayorAmenor(EsteNumero) - deMenorAMayor(EsteNumero));
            // System.out.println(EsteNumero);
            contador++;
        }
        return contador;
    }

    public static boolean esTodoIgual(int numero){
        int MisCifras[] = desarma(numero);
        if((MisCifras[0] == MisCifras[1])&&(MisCifras[2]==MisCifras[3])
                &&(MisCifras[3] == MisCifras[0])){
            return true;
        }else {
            return false;
        }
    }

    public static int deMayorAmenor(int numero){
        int MisCifras[] = desarma(numero);
        int aux = 0;
        for (int i = 0; i < MisCifras.length ; i++) {
            for (int j = 0; j < MisCifras.length - 1; j++) {
                if(MisCifras[j]>MisCifras[j+1]){
                    aux = MisCifras[j+1];
                    MisCifras[j+1] = MisCifras[j];
                    MisCifras[j] = aux;
                }
            }
        }
        //rearmando el numero
        aux = MisCifras[3] * 1000;
        aux = aux + MisCifras[2] * 100;
        aux = aux + MisCifras[1] * 10;
        aux = aux + MisCifras[0];
        return aux;
    }

    public static int deMenorAMayor(int numero){
        int MisCifras[] = desarma(numero);
        int aux = 0;
        for (int i = 0; i < MisCifras.length ; i++) {
            for (int j = 0; j < MisCifras.length - 1; j++) {
                if(MisCifras[j]>MisCifras[j+1]){
                    aux = MisCifras[j+1];
                    MisCifras[j+1] = MisCifras[j];
                    MisCifras[j] = aux;
                }
            }
        }
        //rearmando el numero
        aux = MisCifras[0] * 1000;
        aux = aux + MisCifras[1] * 100;
        aux = aux + MisCifras[2] * 10;
        aux = aux + MisCifras[3];
        return aux;
    }

    public static int[] desarma(int EsteNumero){

        int cifras [] = new int[4];

        cifras[0] = EsteNumero / 1000;
        EsteNumero = EsteNumero - (cifras[0] * 1000);
        cifras[1] = EsteNumero /100;
        EsteNumero = EsteNumero - (cifras[1] * 100);
        cifras[2] = EsteNumero / 10;
        cifras[3] = EsteNumero - (cifras[2] * 10);
        return cifras;
    }
}