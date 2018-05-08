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
    public static int aux=0;
    public static int numHabitacion=0;

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
                    piso.add(new Habitacion(p, i + 1, 120, true));
                    //System.out.println("Habitacion doble #"+i);
                }
                if (i % 2 != 0) {
                    piso.add(new Habitacion(p, i + 1, 100, true));
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

    public static void cambiaEstadoPisos() {
        int estado = 0;
        Scanner sc = new Scanner(System.in);
        int flag = 1;

        while (flag == 1) {
            System.out.println("Ingrese el piso(formato ABC): ");
            Scanner ch = new Scanner(System.in);
            char pisos = ch.next().charAt(0);
            System.out.println("Estado: habilitado: 1, deshablitado: 0");
            estado = sc.nextInt();

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

    public static void cambiarPrecioHabitacion() {
        System.out.println("Que habitacion quiere");
        Scanner sc = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        int z=0;
        c = reader.next().charAt(0);
        int habi=0;
        z= (c-64)*10;
        habi=sc.nextInt();
        numHabitacion=habi+z;
        System.out.println("Cual es el nuevo valor");
        int nuevoValor = sc.nextInt();
        piso.get(numHabitacion - 1).setCostoNoche(nuevoValor);

    }

    public static void cambiarEstadoHabitacion() {
        System.out.println("Que habitacion quiere ingrese el piso primero y luego la habitacion: ");
        Scanner sc = new Scanner(System.in);
         Scanner reader = new Scanner(System.in);
        c = reader.next().charAt(0);
        int estado = 0;
        int z=0;
        int habi=0;
        z= (c-64)*10;
        
        habi=sc.nextInt();
        aux=habi+z;
        System.out.println(aux);
        
        System.out.println("Estado habilitado 1, deshablitado 0");
        estado = sc.nextInt();
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
        int numHab = sc.nextInt();
        int estado = 0;
        
        if (estado == 0) {
            piso.get(numHab - 11).setEstado(false);
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
