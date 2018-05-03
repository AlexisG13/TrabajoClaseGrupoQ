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
        char p =65;
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
            p+=1;
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
    public static void cambiarEstadoHabitacion(){
        System.out.println("Que habitacion quiere");
        Scanner sc = new Scanner(System.in);
        int numHab= sc.nextInt();
        int estado=0;
        System.out.println("Estado habilitado 1, deshablitado 0");
        estado= sc.nextInt();
        if(estado==1){
            piso.get(numHab+1).setEstado(true);
        }else{ 
            piso.get(numHab+1).setEstado(false);
        }
    }
}
