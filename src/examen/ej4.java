package examen;

import java.util.Scanner;

/**
 * * @author javi_
 */
public class ej4 {
    
    public static void main(String[] args) {
       ejecutar();
    }
      public static int pedirNumero(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca numero");
        int numero = teclado.nextInt();
        return numero;}
      public static boolean esPerfecto(int num){
          int acum = 0;
          for (int i=1;i<num;i++){
              if (num%i == 0){
              acum = acum +i;                 
              }
          }
          if (acum == num){
            return true;}
      return false;}
      
      public static void ejecutar(){
       int numero = pedirNumero();
        if (esPerfecto(numero)){
            System.out.println("El numero es perfecto");
        }
        else{
            System.out.println("El numero no es perfecto");
        }
      }
}
