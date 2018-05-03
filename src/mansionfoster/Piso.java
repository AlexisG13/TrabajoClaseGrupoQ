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

    public static int nPisos = 10;
    public static ArrayList<Habitacion> piso = new ArrayList<>();

    public Piso() {
    }

    public void setHabitacion(ArrayList<Habitacion> habitacion) {
        this.piso = piso;
    }

    public static void add() {
        for (int j = 0; j < nPisos; j++) {

            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    piso.add(i, new Habitacion(120, true));
                }
                if (i % 2 != 0) {
                    piso.add(i, new Habitacion(100, true));
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
    
   
    