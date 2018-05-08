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

    public static int nPisos = 0;
    public static ArrayList<Habitacion> piso = new ArrayList<>();
    public static float preciousarpi = 0;
    public static char c = 65;
    public static int aux = 0;
    public static int numHabitacion = 0;

    public Piso() {
    }

    //public void setHabitacion(ArrayList<Habitacion> habitacion) {
    //  this.piso = piso;
    //}
    /**
     * Función que se encarga de añadir un piso más en el hotel
     */
    public static void AgregaPiso() {
        char p = 65;
        for (int j = 1; j < nPisos + 1; j++) {
            //System.out.println("Piso: " + j);
            if (j < nPisos - 1) {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        piso.add(new Habitacion(p, i + 1, 120, true));
                        //System.out.println("Habitacion doble #"+i);
                    }
                    if (i % 2 != 0) {
                        piso.add(new Habitacion(p, i + 1, 100, true));
                        //System.out.println("Habitacion sencilla #"+i);
                    }
                }
            }
            if (j >= nPisos - 1) {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        piso.add(new Habitacion(p, i + 1, (float) (120 * 1.1), true));
                        //System.out.println("Habitacion doble #"+i);
                    }
                    if (i % 2 != 0) {
                        piso.add(new Habitacion(p, i + 1, (float) (100 * 1.1), true));
                        //System.out.println("Habitacion sencilla #"+i);
                    }
                }
            }
            p += 1;
        }
    }

    /**
     * Función que muestra cada uno de los pisos
     */
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

    /**
     * Función que se encarga de habilitar o deshabilitar pisos completos
     */
    public static void cambiaEstadoPisos() {
        int estado = 0;
        Scanner sc = new Scanner(System.in);
        int flag = 1;

        while (flag == 1) {
            System.out.println("Ingrese el piso(formato ABC): ");
            Scanner ch = new Scanner(System.in);
            char pisos = ch.next().charAt(0);
            System.out.println("Estado: 1. Habilitado, 0. Deshablitado");
            estado = sc.nextInt();

            while (estado != 1 && estado != 0) {
                System.err.println("Ingrese 1 o 0");
                System.out.println("Estado: 1. Habilitado , 0. Deshablitado");
                estado = sc.nextInt();
            }

            for (Habitacion e : piso) {
                if (e.getLetraPiso() == pisos) {
                    flag = 0;
                    //e.setLetraPiso(habitacion);
                    if (estado == 1) {
                        e.setEstado(true);
                    } else {
                        e.setEstado(false);
                    }
                }
            }
            if (flag == 1) {
                System.err.println("El piso que intenta modificar NO existe");
            }
        }

        System.out.println("--------------ACTUALIZANDO ESTADOS ------------");
        Piso.mostrar();

    }

    /**
     * Función que modifica el precio de una sola habitacion 
     */
    public static void cambiarPrecioHabitacion() {
        System.out.println("¿Qué habitación quiere?");
        Scanner sc = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        int z = 0;
        c = reader.next().charAt(0);
        int habi = 0;
        z = (c - 64) * 10;
        habi = sc.nextInt();
        numHabitacion = habi + z;
        System.out.println("¿Cúal es el nuevo valor?");
        int nuevoValor = sc.nextInt();
        piso.get(numHabitacion - 1).setCostoNoche(nuevoValor);

    }

    public static void cambiarEstadoHabitacion() {
        System.out.println("¿Qué habitación quiere? Ingrese el piso primero y luego el número de la habitación ");
        Scanner sc = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        c = reader.next().charAt(0);
        int estado = 0;
        int z = 0;
        int habi = 0;
        z = (c - 64) * 10;
        habi = sc.nextInt();
        aux = habi + z;
        System.out.println("Estado: 1. Habilitado , 0. Deshablitado");
        estado = sc.nextInt();
        while (estado != 1 && estado != 0) {
            System.err.println("Ingrese 1 o 0");
            System.out.println("Estado: 1. Habilitado , 0. Deshablitado");
            estado = sc.nextInt();
        }
        if (estado == 1) {
            piso.get(aux - 11).setEstado(true);
        } else {
            piso.get(aux - 11).setEstado(false);
        }
    }

    public static float obtenerPrecio(int numHabi) {
        preciousarpi = piso.get(numHabi).getCostoNoche();
        //System.out.println(preciousarpi);

        return preciousarpi;

    }

    public static void cambiarEstadoHabitacionaux() {
        //System.out.println("Que habitacion quiere");
        Scanner sc = new Scanner(System.in);
        //int numHab = sc.nextInt();
        int estado = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Letra de piso (ABC...): ");
        c = reader.next().charAt(0);
        int estadoaux = 0;
        int z = 0;
        int habi = 0;
        z = (c - 64) * 10;
        System.out.println("Número de habitación: ");
        habi = sc.nextInt();
        aux = habi + z;
        if (estadoaux == 0) {
            piso.get(aux - 11).setEstado(false);
            System.out.println("Reserva confirmada");
        }
    }

    public static void verPisoOcupados() {

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

}
