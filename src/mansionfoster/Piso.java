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
    public static ArrayList<Habitacion> piso = new ArrayList<>();

    ;

    public Piso() {

    }

    //public void setHabitacion(ArrayList<Habitacion> habitacion) {
    //  this.piso = piso;
    //}
    public static void AgregaPiso() {
        for (int j = 1; j < nPisos + 1; j++) {
            //System.out.println("Piso: " + j);
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    piso.add(new Habitacion(i + 1, 100, true));
                    //System.out.println("Habitacion doble #"+i);
                }
                if (i % 2 != 0) {
                    piso.add(new Habitacion(i + 1, 120, true));
                    //System.out.println("Habitacion sencilla #"+i);
                }
            }
        }
    }

    public static void mostrar() {
        int numeroPiso = 1;
        int cont = 1;
        for (Habitacion e : piso) {
            if (cont == 10) {
                cont -= 10;
            }
            if (cont == 1) {
                System.out.println("-----------Piso #" + numeroPiso+"------------");
                numeroPiso++;
            }
            System.out.println(e.toString());
            cont++;
        }
    }
}
