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

/**
 *
 * @author andre
 */
public class Reserva {
    private int numDias, numHabsARes;
    //public Paquete paquete;
    private Check checkOut;
    private Check checkIn;

    public Reserva(int numDias, int numHabsARes, Check checkOut, Check checkIn) {
        this.numDias = numDias;
        this.numHabsARes = numHabsARes;
        this.checkOut = checkOut;
        this.checkIn = checkIn;
    }

    public Check getCheckOut() {
        return checkOut;
    }

    public Check getCheckIn() {
        return checkIn;
    }

    public int getNumDias() {
        return numDias;
    }

    public int getNumHabsARes() {
        return numHabsARes;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public void setNumHabsARes(int numHabsARes) {
        this.numHabsARes = numHabsARes;
    }
//
//    public void setCheckOut(Check checkOut) {
//        this.checkOut = checkOut;
//    }
//
//    public void setCheckIn(Check checkIn) {
//        this.checkIn = checkIn;
//    }
//    
    public void NumDia(Check checkIn, Check checkOut){
        
    }
    
    public static int saltin=0;
    public static void reservar() {

       ListaPaquetes.obtenerPrecioPack();
       saltin=saltin+preciousar;
        //System.out.println(saltin);    
        Piso.obtenerPrecio();
        float aux= (float)saltin;
        aux=preciousarpi+ aux;
        System.out.println(" El costo total de su habitacion sera de:   "+"$"+aux);
        System.out.println("Para confirmar su reserva vuela a introducir su numero de habitacion: ");
        Piso.cambiarEstadoHabitacionaux();

    }
    
    public static void VerificarFecha(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la fecha de entrada");
        String fechaIng = "2018-"+scan.next();
        System.out.println("Ingrese la fecha de salida");
        String fechaSal = "2018-"+scan.next();
        LocalDate d1 = LocalDate.parse(fechaIng);
        LocalDate d2 = LocalDate.parse(fechaSal);
        long dias = ChronoUnit.DAYS.between(d1, d2);
        if(dias>7){
            System.out.println("Excede los días de hospedaje");
        }
        else{
            System.out.println("A oc");
        }
    }

}
