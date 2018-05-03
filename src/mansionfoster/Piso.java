/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

import java.util.ArrayList;

/**
 *
 * @author Karina Mina
 */
public class Piso {

    public static int nPisos = 6;
    public static ArrayList<Habitacion> piso = new ArrayList<>();;

    public Piso() {
        
    }

    //public void setHabitacion(ArrayList<Habitacion> habitacion) {
      //  this.piso = piso;
    //}

    public static void add() {
        for (int j = 1; j < nPisos+1 ; j++) {
            System.out.println("Piso: "+ j);
            for (int i = 1; i < 11; i++) {
                if (i % 2 == 0) {
                    piso.add(new Habitacion(120,true)); 
                    System.out.println("Habitacion doble #"+i);
                }
                if (i % 2 != 0) {
                    piso.add(new Habitacion(100, true));
                    System.out.println("Habitacion sencilla #"+i);
                }
            }

        }
    }

 public static void mostrar() {
        for (Habitacion e : piso) {
            System.out.println(e.toString());
        }
    }
}
    
   
    