//programa que recibe vie Scanner tres valores 
//dia mes y año
//y en la salida estandar muestra el siguiente día

import java.util.Scanner;

public class Reloj{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Ingresa el dia");
        dia = sc.nextInt();
        System.out.println("Ingresa el mes");
        mes = sc.nextInt();
        System.out.println("Ingresa el año");
        anio = sc.nextInt();

        if (dia == 31 && mes == 12) {
            dia = 1;
            mes = 1;
            anio++;
        }else if (dia == 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)) {
            dia = 1;
            mes++;
        }else if (dia == 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            dia = 1;
            mes++;

            //el ao bisiesto
        }else if (dia == 28 && mes == 2) {
            dia = 1;
            mes++;
        }else{
            dia++;
        }

        System.out.println("El dia siguiente es: " + dia + "/" + mes + "/" + anio);
    }



}