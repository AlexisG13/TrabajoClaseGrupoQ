/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

import java.util.ArrayList;
import java.util.Scanner;

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
        char p = 65;
        for (int j = 1; j < nPisos + 1; j++) {
            //System.out.println("Piso: " + j);
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    piso.add(new Habitacion(p, i + 1, 100, true));
                    //System.out.println("Habitacion doble #"+i);
                }
                if (i % 2 != 0) {
                    piso.add(new Habitacion(p, i + 1, 120, true));
                    //System.out.println("Habitacion sencilla #"+i);
                }
            }
            p += 1;
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
                System.out.println("-----------Piso #" + numeroPiso + "------------");
                numeroPiso++;
            }
            System.out.println(e.toString());
            cont++;
        }
    }
//Habitacion(char letraPiso, int numHab,float costoNoche, boolean estado)

    public static void cambiarEstadoHabitacion() {
        int estado = 0;
        System.out.println("Que habitacion quiere: ");
        Scanner sc = new Scanner(System.in);
        int numHab = sc.nextInt();
        System.out.println("Ingrese el piso(formato abc): ");
        Scanner ch = new Scanner(System.in);
        char habitacion = ch.next().charAt(0);
        //habitacion = ch.next().charAt(0);
        System.out.println("Estado habilitado 1, deshablitado 0");
        estado = sc.nextInt();

        for (int j = 1; j < nPisos; j++) {
            if (habitacion == nPisos) {
                for (int h = 0; h < 10; h++) {
                    if (estado == 1) {
                        //piso.get(habitacion);
                        piso.get(numHab).setEstado(true);

                    } else {
                        piso.get(numHab).setEstado(false);

                    }
                }
            }
        }
    }

    public static void cambiarPrecioHabitacion() {
        System.out.println("Que habitacion quiere");
        Scanner sc = new Scanner(System.in);
        int numHabi = sc.nextInt();
        System.out.println("Cual es el nuevo valor");
        int nuevoValor = sc.nextInt();
        piso.get(numHabi).setCostoNoche(nuevoValor);

    }
}
