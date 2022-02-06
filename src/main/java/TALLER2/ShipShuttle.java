
package TALLER2;

/**
 *
 * @author tatiana
 */
public class ShipShuttle extends Ship {

    private final String function;

    public ShipShuttle(String name, String speed, String power, String fuelType, String function) {
        super(name, speed, power, fuelType);
            this.function = function;
    }

    @Override
   public String createShip(){
    return "el nombre de la nave es:"+name+
             "\nla velocidad de la nave es:"+speed+
                "\nLa potencia de la nave es:"+power+ 
                   "\nEl combustible de la nave es:" + fuelType +
                      "\nLa funcion de la nave a realizar es:"+function;
   
                     }
                }
   
