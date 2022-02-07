
package TALLER2;
/**
 * 
 * @author jhojan hoyos
 */
public class ShipUnmanned extends Ship {
    /**
     * representa el atributo nombre heredado de la clase nave
     */
    static protected String name ="Atlas V";
    /**
     * representa el atributo tipo combustible heredado de la clase nave
     */
    static protected String fuelType ="nitrogeno liquido";
    /**
     * representa el atributo velocidad heredado de la clase nave
     */
    static protected int speed = 340;
    /**
     * representa el atributo potencia heredado de la clase nave
     */
    static protected int power =450;
    /**
     * representa el atributo destino de la mision en la clase nave no tripulada
     */
    private static final String destination="Propulsores químicos";
    
    /**
     * constructor de la clase nave lanzadera
     */
    public ShipUnmanned() {
    }
    
    /**
     * Constructor de la clase NAVE NO TRIPULADA heredando atributos de clase NAVE
     * @param name
     * @param fuelType
     * @param speed
     * @param power 
     */
    public ShipUnmanned(String name, String fuelType, int speed, int power) {
        super(name, fuelType, speed, power);
    }
   
    /**
     * /**
     * se sobreescribe el metodo crear naves de la clase NAVES
     */
    @Override
    public void createShip(){
       System.out.println("El nombre de la nave no tripulada es:"+ name);
        System.out.println("La velocidad de la nave es:"+speed+ "Km/h"); 
        System.out.println("La potencia de la nave es:"+power+ "toneladas"); 
        System.out.println("El combustible de la nave es:" + fuelType);
        System.out.println("La mision de la nave"+ name +"es sondear el planeta:"+destination);
                    }
                } 
  
    
    

