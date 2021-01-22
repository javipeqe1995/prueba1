
package examen;

import java.util.Scanner;

/**
 * @author javi_
 */
public class ej1 {

      public static void main(String[] args) {
        int num = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca maximo");
        int maximo = teclado.nextInt();
        System.out.println("Introduzca minimo");
        int minimo = teclado.nextInt();
        do {
            System.out.println("Introduzca numero");
             num = teclado.nextInt();
             if ((num>=maximo)|| (num<=minimo)){
                 System.out.println("El numero intrpducido no esta en el rango");}
            
        }while((num>=maximo)|| (num<=minimo));
          System.out.println("Muy bien has acertado");
    }
    
}
