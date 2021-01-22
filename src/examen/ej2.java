
package examen;

import java.util.Scanner;

/**
 * @author javi_
 */
public class ej2 {

      public static void main(String[] args) {
        int num;
        boolean condicion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca maximo");
        int maximo = teclado.nextInt();
        System.out.println("Introduzca minimo");
        int minimo = teclado.nextInt();
        do {
            System.out.println("Introduzca numero");
            num = teclado.nextInt();
            condicion = ((num>=maximo)|| (num<=minimo));
            if (condicion){
                 System.out.println("El numero intrpducido no esta en el rango");}
            
        }while(condicion);
          System.out.println("Muy bien has acertado. El numerno esta en el rango");
    }
    
}
