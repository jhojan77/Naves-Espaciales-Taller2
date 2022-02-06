
package TALLER2;

public class ShipUnmanned extends Ship {

    private final String destination;

    public ShipUnmanned( String name, String speed, String power, String fuelType, String destination) {
        super(name, speed, power, fuelType);
            this.destination = destination;
    }
    

    @Override
    public String createShip(){
        return "el nombre de la nave es:"+name+
                  "\nla velocidad de la nave es:"+speed+
                    "\nLa potencia de la nave es:"+power+ 
                       "\nEl combustible de la nave es:" + fuelType +
                          "\nEl destino de la mision es:"+destination;
                    }
                } 
  
    
    

