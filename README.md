# Desarrollo-web-Sena
import java.util.Scanner;


public class Condicionales {
    public static void main (String[] args){

        Scanner leer = new Scanner(System.in);

        int valor1 = 0;
        int valor2 = 0;

        System.out.println("Ingrese valor 1");
        valor1 = leer.nextInt();
        System.out.println("Ingrese valor2");
        valor2 = leer.nextInt();
        int total = valor1 + valor2;
        int total2 = valor1 * valor2;
        int total3 = valor1 / valor2;

        System.out.println("Los valores con suma es"+ " " + total);
        System.out.println("Los valores con multiplicacion es: "+ " "+ total2);
        System.out.println("Los valores con divisoon es: " + " " + total3);

    }

}
