package fi.niskase.carproject;

import fi.niskase.carproject.domain.*;
import fi.niskase.carproject.domain.Ajaja.Ajotapa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ajaja ajaja1 = new Ajaja(null, "Pepe", Ajotapa.TAVALLINEN);
        Ajaja ajaja2 = new Ajaja(null, "Lari", Ajotapa.AGGRESSIIVINEN);
        Ajaja ajaja3 = new Ajaja(null, "Junnu", Ajotapa.RAUHALLINEN);
        
        Moottori moottori1 = new Moottori(100, 4, 0);
        Moottori moottori2 = new Moottori(80, 6, 0);
        Moottori moottori3 = new Moottori(160, 8, 0);
        
        Auto auto1 = new Auto("Opel", "Astra", 200.0, moottori1, ajaja1);
        Auto auto2 = new Auto("Lada", "Samara", 100.0, moottori2, ajaja2);
        Auto auto3 = new Auto("AUdi", "A6", 160.0, moottori3, ajaja3);
    } 
}
