
package TALLER2;

/**
 * 
 * @author jhojan hoyos
 */
public class ShipManned extends Ship {

    /**
     * representa el atributo nombre heredado de la clase nave
     */
    protected static String name ="Sven 86";
    /**
     * representa el atributo tipo combustible heredado de la clase nave
     */
    static protected String fuelType ="Hidrógeno líquido y oxígeno líquido";
    /**
     * representa el atributo velocidad heredado de la clase nave
     */
    static protected int speed = 300;
    /**
     * representa el atributo potencia heredado de la clase nave
     */
    static protected int power =200;
    /**
     * representa el atributo tarea a realizar en la clase nave tripulada
     */
    private static final  String homework="Llevar a los astronautas a la Luna";
    
    /**
     * constructor de la clase nave tripulada
     */
    public ShipManned() {
    }
    
    /**
     * Constructor de la clase NAVE TRIPULADA heredando atributos de clase NAVE
     * @param name
     * @param fuelType
     * @param speed
     * @param power 
     */
    public ShipManned(String name, String fuelType, int speed, int power) {
        super(name, fuelType, speed, power);
    }
        
    /**
     * se sobreescribe el metodo crear naves de la clase NAVES
     */
    @Override
    public void createShip(){
        System.out.println("el nombre de la nave tripulada es:"+ name);
        System.out.println("La velocidad de la nave es:"+speed+ "Km/h"); 
        System.out.println("La potencia de la nave es:"+power+ "toneladas"); 
        System.out.println("El combustible de la nave es:" + fuelType);
        System.out.println("La tarea de la mision es:"+homework);
                }
            }