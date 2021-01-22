
package examen;

/**
 * @author javi_
 */
public class ej3 {

    public static void main(String[] args) {
       int acum = 1;
       int  totalImpares = 0;
       int i =1;
       while (totalImpares != 5){
           if (i%2 != 0){
           acum = acum * i;
           totalImpares++;
           }
           i++;
       }
        System.out.println("El producto de los impares es: "+acum);         
    }
    
}
