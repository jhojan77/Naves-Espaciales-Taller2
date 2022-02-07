
package TALLER2;

/**
 * representa la clase abstracta NAVE con sus atributos y metodos
 * @author jhojan hoyos
 */
public abstract class Ship  {
        /**
         * representa el nombre de la nave
         */
          protected String name;
        /**
         * representa el tipo de combustible que utiliza la nave
         */
          protected String fuelType ;
        /**
         * representa la velocidad final la nave
         */
          int speed;
        /**
         * representa la potencia total de la nave expresada en toneladas
         */
          int power ; 
          
    /**
     * constructor de la clase nave
     */
    public Ship(){
        
    }
    /**
     * representa el metodo constructor de clase nave
     * @param name
     * @param fuelType
     * @param speed
     * @param power 
     */
    public Ship(String name, String fuelType, int speed, int power) {
        this.name = name;
        this.fuelType = fuelType;
        this.speed = speed;
        this.power = power;
    }
    
    /**
     * metodo get atributo nombre
     * @return 
     */
    public String getName() {
        return name;
    }
    /**
     * metodo set del atributo nombre
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * metodo get atributo velocidad
     * @return 
     */
    public int getSpeed() {
        return speed;
    }
    /**
     * metodo set del atributo velocidad
     * @param speed 
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    /**
     * metodo get atributo potencia
     * @return 
     */
    public int getPower() {
        return power;
    }
    /**
     * metodo set del atributo potencia
     * @param power 
     */
    public void setPower(int power) {
        this.power = power;
    }
    /**
     * metodo get atributo tipo-combustible
     * @return 
     */
    public String getFuelType() {
        return fuelType;
    }
    /**
     * metodo set del atributo tipo-combustible
     * @param fuelType 
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    /**
     * representa el metodo crear naves que heredaran las clases 
     */
    public void createShip(){
            }
     }


