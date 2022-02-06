
package TALLER2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
           
       Scanner entrada = new Scanner(System.in);
       boolean salir = false;
       int option;
      
       
  
       
       do {
           System.out.println("BIENVENIDO A LA SALA DE CREACION DE NAVES ESPACIALES");
           System.out.println("A continuacion encontrara el menu de opciones");
           System.out.println("Opcio 1: NAVE TRIPULADA");
           System.out.println("Opc 2: NAVE NO TRIPULADA");
           System.out.println("Opc 3: NAVE LANZADERA");
           System.out.println(" Si desea SALIR presione la opcion 4");
           
           
           try {
               System.out.println("Por favor, escoja la opcion de su preferencia:");
                   option = entrada.nextInt();
           
           
           if (option <=4 ){
               switch(option){
               case 1 -> System.out.println("Has seleccionado la opcion 1");
               case 2 -> System.out.println("Has seleccionado la opcion 2");
                case 3 -> System.out.println("Has seleccionado la opcion 3");
                case 4 -> salir=true;
                 }
              }else {
               System.out.println("Digite una opcion valida entre 1-3 o pulse 4 para salir");
           }
           }
              catch (InputMismatchException e) {
                System.out.println("Debes insertar una opcion valida no alfanumerica");
                entrada.next();
       }
      }
           while (!salir);  
        
   }
}
    
    
