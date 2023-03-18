
package com.mycompany.ejercicio14_actividad2;

import java.util.Scanner;

public class Ejercicio14_actividad2 {

    public static void main(String[] args) {
      
         Scanner leerporteclado = new Scanner(System.in);
         
         double VD1, VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;
         
        System.out.print("Ingrese el importe de ventas del departamento 1: ");
        VD1 = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el importe de ventas del departamento 2: ");
        VD2 = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el importe de ventas del departamento 3: ");
        VD3 = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el salario de los vendedores: ");
        SALAR = leerporteclado.nextDouble();
        
        TOTVEN = VD1+VD2+VD3;
        PORVEN = 0.33*TOTVEN;
        
        if (VD1 > PORVEN){
            SALAR1 = SALAR + 0.2*SALAR;
        }else{
           SALAR1 = SALAR; 
        }
        if (VD2 > PORVEN){
            SALAR2 = SALAR + 0.2*SALAR;
        }else{
            SALAR2 = SALAR;
        }
        if (VD3 > PORVEN){
          SALAR3 = SALAR + 0.2*SALAR;  
        }else{
            SALAR3 = SALAR;
        }
        
        System.out.println("El salario de los vendedores DEPTO 1 es: $"+SALAR1);
        System.out.println("El salario de los vendedores DEPTO 2 es: $"+SALAR2);
        System.out.println("El salario de los vendedores DEPTO 3 es: $"+SALAR3); 
    }
}
