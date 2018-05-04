/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

/**
 *
 * @author Alexis Gomez
 */
public class MansionFoster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Piso habitacion = new Piso();
        
        Piso.AgregaPiso();
        Piso.mostrar();
        Piso.cambiarEstadoHabitacion();
        Piso.mostrar();
        Piso.cambiarPrecioHabitacion();
        Piso.mostrar();
                
       
    }
    // TODO code application logic here
}

