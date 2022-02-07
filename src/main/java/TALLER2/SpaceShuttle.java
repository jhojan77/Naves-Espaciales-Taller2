
package TALLER2;

/**
 *
 * @author tatiana
 */
public class SpaceShuttle extends Ship {
   
    /**
     * representa el atributo nombre heredado de la clase nave
     */
    protected static String name ="Zenitt II";
    /**
     * representa el atributo tipo combustible heredado de la clase nave
     */
    static protected String fuelType ="sólido (perclorato de amonio y aluminio, queroseno)";
    /**
     * representa el atributo velocidad heredado de la clase nave
     */
    static protected int speed = 180;
    /**
     * representa el atributo potencia heredado de la clase nave
     */
    static protected int power =2000;
    /**
     * representa el atributo peso de la nave 
     */
    static protected int weight =2000;
    /**
     * representa el atributo tarea a realizar en la clase nave tripulada
     */
    private static final String project ="proporcionar una rotación de tripulación y suministros a la Estación Espacial Internacional";
    
    /**
     * constructor de la clase nave tripulada
     */
    public SpaceShuttle() {   
    }

    /**
     * Constructor de la clase NAVE TRIPULADA heredando atributos de clase NAVE
     * @param name
     * @param fuelType
     * @param speed
     * @param power 
     */
    public SpaceShuttle(String name, String fuelType, int speed, int power) {
        super(name, fuelType, speed, power);
    }
        
    /**
     * se sobreescribe el metodo crear naves de la clase NAVES
     */
    @Override
    public void createShip(){
        System.out.println("El nombre del TRANSBORDADOR ESPACIAL es:"+ name);
        System.out.println("La velocidad del transbordador es:"+speed+ "Km/h"); 
        System.out.println("La potencia del transbordador es:" + power + "toneladas"); 
        System.out.println("El combustible del transbordador es:" + fuelType);
        System.out.println("El peso del transbordador espacial es:" + weight + "toneladas");
        System.out.println("El proyecto de esta mision es:"+project);
                }
            }