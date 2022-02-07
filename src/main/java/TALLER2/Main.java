
package TALLER2;
/**
 * representa la clase principal con la implementacion de los metodos
 * @author jhojan hoyos
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
       boolean salir = false;
       int option;
       
      
  
       /**
        * 
        */
       do {
           System.out.println("BIENVENIDO A LA SALA DE CREACION DE NAVES ESPACIALES");
           System.out.println("A continuacion encontrara el menu de opciones");
           System.out.println("Opc 1: NAVE TRIPULADA");
           System.out.println("Opc 2: NAVE NO TRIPULADA");
           System.out.println("Opc 3: NAVE LANZADERA");
           System.out.println("Opc 4: TRANSBORDADOR ESPACIAL");
           System.out.println(" Si desea SALIR presione la opcion 5");
           
           
           try {
               System.out.println("Por favor, escoja la opcion de su preferencia:");
                   option = entrada.nextInt();
           
           /**
            * condicional para evaluar la opcion escogida por el usuario
            */
           if (option <=5 ){
               switch(option){
               case 1:
                   System.out.println("Has seleccionado la opcion 1");
                   ShipManned manned = new ShipManned();
                   manned.createShip();
                   break;
               case 2:
                   System.out.println("Has seleccionado la opcion 2");
                   ShipUnmanned unmanned = new ShipUnmanned();
                   unmanned.createShip();
                   break;
                case 3:
                   System.out.println("Has seleccionado la opcion 3");
                   ShipShuttle shuttle = new ShipShuttle();
                   shuttle.createShip();
                   break;
                case 4:
                   System.out.println("Has seleccionado la opcion 4");
                   SpaceShuttle space = new SpaceShuttle();
                   space.createShip();
                   break;
                case 5:
                   salir=true;
                   break;
                 }
              }else {
               System.out.println("Digite una opcion valida entre 1-4 o pulse 5 para salir");
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
    
    
