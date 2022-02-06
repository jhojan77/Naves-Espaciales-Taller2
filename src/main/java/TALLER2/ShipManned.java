
package TALLER2;

/**
 *
 * @author tatiana
 */
public class ShipManned extends Ship {

    private final String homework; 

    public ShipManned(String name, String speed, String power, String fuelType, String homework ) {
        super(name, speed, power, fuelType);
            this.homework = homework;
    }
    
    @Override
   public String createShip(){
     return "el nombre de la nave es:"+name+
               "\nla velocidad de la nave es:"+speed+
                 "\nLa potencia de la nave es:"+power+ 
                   "\nEl combustible de la nave es:" + fuelType +
                       "\nLa tarea a realizar es:"+homework;
                }
            }