
package TALLER2;

/**
 *
 * @author tatiana
 */
public abstract class Ship  {

          protected String name, speed, power , fuelType ;

    public Ship(String name, String speed, String power, String fuelType) {
        this.name = name;
        this.speed = speed;
        this.power = power;
        this.fuelType = fuelType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    
    public String createShip(){
    
        return "El nombre de la nave es:"+name+
                  "\nLa velocidad de la nave es:"+speed+
                     "\nLa potencia de la nave es:"+power+ 
                       "\nEl combustible de la nave es:" + fuelType;
        
                }
            }


