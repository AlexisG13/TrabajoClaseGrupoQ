/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import static mansionfoster.ListaPaquetes.preciousar;
import static mansionfoster.Piso.preciousarpi;
import static mansionfoster.Piso.c;
import java.util.*;
import java.time.format.DateTimeParseException;
/**
 *
 * @author andre
 */
public class Reserva {

    private static int numDias, numHabsARes;
    public  LocalDate d1;
    public  LocalDate d2;
    public  int numHabi;
    public  String pack;
    public  String nombre;
    public  String DUI;
    public static ArrayList<Reserva> Reservaciones = new ArrayList<>();
    public Reserva() {
    }
    
    public void setDUI(String DUI) {
        this.DUI = DUI;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setNumHabi(int numHabitacion){
        this.numHabitacion = numHabitacion;
    }
    
    public void setPrecio(float preciototal){
        this.preciototal=preciototal;
    }
    ;
      @Override
    public String toString() {
        return "Cliente " + nombre + " DUI " + DUI+ ", Pack "+ pack + ", Numero de Habitacion  "+numHabitacion;
    }
    public static int saltin = 0;
    public static int flag = 0;
    static float preciototal = 0;
    public static char c = 65;
    public static int aux = 0;
    public static int numHabitacion = 0;

    public static void reservar() {
        Scanner nomb = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = nomb.next();
        System.out.println("Ingrese su DUI");
        String DUI = nomb.next();
        System.out.println("Que habitacion quiere (Se ingresa el piso (ABC...) deseado y luego el numero de habitacion): ");
        Scanner sc = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        int z = 0;
        c = reader.next().charAt(0);
        int habi = 0;
        z = (c - 64) * 10;
        habi = sc.nextInt();
        numHabitacion = habi + z;
        Scanner pipo = new Scanner(System.in);
        do {
            System.out.println("Que paquete desea");
            String pack = pipo.nextLine();
            ListaPaquetes.obtenerPrecioPack(pack);
        } while (preciousar == 0);
        saltin = saltin + preciousar;
        //System.out.println(saltin); 
        int numHabi=0;
        Piso.obtenerPrecio(numHabi);
        float aux = (float) saltin;
        aux = preciousarpi + aux;
        Scanner scan = new Scanner(System.in);
        flag = 0;
        while (flag != 1) {
            try{
            System.out.println("Ingrese la fecha de entrada (formato mm-dd)");
            String fechaIng = "2018-" + scan.next();
            System.out.println("Ingrese la fecha de salida (formato mm-dd)");
            String fechaSal = "2018-" + scan.next();
            LocalDate d1 = LocalDate.parse(fechaIng);
            LocalDate d2 = LocalDate.parse(fechaSal);
            if (VerificarFecha(d1, d2) == true) {
                System.out.println("Fecha confirmada");
                long dias = ChronoUnit.DAYS.between(d1, d2);
                preciototal = dias * aux;
                flag = 1;
                System.out.flush();
            } else {
                System.out.println("Excede los dias maximo de hospedaje");
            }
            }catch (DateTimeParseException e){
                System.err.println(" Formato de fecha incorrecto");
                }
        }
        System.out.println(" El costo total de su habitacion sera de:   " + "$" + preciototal);
        Reserva reserva = new Reserva();
        reserva.setNombre(nombre);
        reserva.setDUI(DUI);
        reserva.setNumHabi(numHabitacion);
        reserva.setPrecio(preciototal);
        Reservaciones.add(reserva);
        System.out.println("Para confirmar su reserva vuela a introducir  su numero de habitacion: ");
        Piso.cambiarEstadoHabitacionaux();
        //ListaReservas.mostrarRes();
    }

    public static boolean VerificarFecha(LocalDate d1, LocalDate d2) {
        long dias = ChronoUnit.DAYS.between(d1, d2);
        if (dias > 7) {
            return false;
        } else {
            return true;
        }

    }
    
    public static void MostrarReservas(){
        System.out.println("Elija el cliente(número)");
        int i=1;
        for(Reserva p : Reservaciones){
            System.out.println(i+"- "+p);
            i++;
        }
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        System.out.println("Cliente: "+Reservaciones.get(p-1).nombre);
        System.out.println("DUI: "+Reservaciones.get(p-1).DUI);
        System.out.println("Habitacion: "+Reservaciones.get(p-1).numHabitacion);
        System.out.println("Fecha de entrada: "+Reservaciones.get(p-1).d1);
        System.out.println("Fecha de salida: "+Reservaciones.get(p-1).d2);
        System.out.println("Consumo: $"+Reservaciones.get(p-1).preciototal);
    }
/*
    @Override
    public String toString() {
        return (nombre);
    }
*/
}
