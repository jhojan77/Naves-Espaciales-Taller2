
package TALLER2;

/**
 *
 * @author jhojan hoyos
 */
public class ShipShuttle extends Ship {
    /**
     * representa el atributo nombre heredado de la clase nave
     */
    static protected String name ="Delta XV";
    /**
     * representa el atributo tipo combustible heredado de la clase nave
     */
    static protected String fuelType ="Queroseno y oxígeno líquido";
    /**
     * representa el atributo velocidad heredado de la clase nave
     */
    static protected int speed = 150;
    /**
     * representa el atributo potencia heredado de la clase nave
     */
    static protected int power =450;
    /**
     * representa el atributo funcion a realizar en la clase nave lanzadera
     */
    
    private static final String function="Llevar carga de abastecimiento a satelites en orbita";

    /**
     * constructor de la clase nave lanzadera
     */
    public ShipShuttle() {
    }

    /**
     * Constructor de la clase NAVE LANZADERA heredando atributos de clase NAVE
     * @param function
     * @param name
     * @param fuelType
     * @param speed
     * @param power 
     */
    public ShipShuttle(String function, String name, String fuelType, int speed, int power) {
        super(name, fuelType, speed, power);
    }
    
    /**
     * se sobreescribe el metodo crear naves de la clase NAVES
     */
    @Override
   public void createShip(){
        System.out.println("El nombre de la nave lanzadera es:"+ name);
        System.out.println("La velocidad de la nave es:"+speed+ "Km/h"); 
        System.out.println("La potencia de la nave es:"+power+ "toneladas"); 
        System.out.println("El combustible de la nave es:" + fuelType);
        System.out.println("La funcion de la mision:"+function);
   
                     }
                }
   
