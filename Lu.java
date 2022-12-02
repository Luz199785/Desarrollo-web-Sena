/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package proyecto.sena.lu;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Lu {


    public static void main (String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Suma de dos numeros");
      
          int a, b;
          
          System.out.println("Ingrese el primer numero: ");
          a = leer.nextInt();
          
          System.out.println("Ingrese el segundo numero: ");
          b = leer.nextInt();
          
          int suma = a+b;
          
      
    
          System.out.println("El resultado ded la suma es: "+suma);
          
              //Cociente y residuo de dos numeros
          
          int l, u;
          System.out.println("Subtotal de tres numeros");
          System.out.println("Ingrese el primer numero: ");
          l = leer.nextInt();
          System.out.println("Ingrese el segundo numero");
          u = leer.nextInt();
          
          
          
          
          System.out.println("El resultado de: " + l + " / " + u + "el cociente es " + (l / u)+ "\nEl residuo es: "+l + "%"+ u+( l% u));
          
                  

    
    }
}

