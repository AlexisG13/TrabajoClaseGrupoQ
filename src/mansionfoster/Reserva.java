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
    public static LocalDate d1;
    public static LocalDate d2;
    public static int numHabi;
    public static String pack;

    public Reserva(String nombre, int DUI, LocalDate d1, LocalDate d2,
    float preciototal,int numHabi) {
               
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
    
    public static int saltin=0;
    public static int flag =0;
    static float preciototal=0;
    
        
    public static void reservar() {
        System.out.println("Que habitacion quiere (Se ingresa el piso deseado y luego el numero de habitacion)");
        Scanner sc = new Scanner(System.in);
        numHabi = sc.nextInt();
        Scanner pipo = new Scanner(System.in);
       do{System.out.println("Que paquete desea");
           pack = pipo.nextLine();
           ListaPaquetes.obtenerPrecioPack(pack); 
       }while(preciousar==0);
       saltin=saltin+preciousar;
        //System.out.println(saltin);    
        Piso.obtenerPrecio(numHabi);
        float aux= (float)saltin;
        aux=preciousarpi+ aux;
        Scanner scan = new Scanner(System.in);
        while(flag!=1){
        System.out.println("Ingrese la fecha de entrada (formato mm-dd)");
        String fechaIng = "2018-"+scan.next();
        System.out.println("Ingrese la fecha de salida (formato mm-dd)");
        String fechaSal = "2018-"+scan.next();
        d1 = LocalDate.parse(fechaIng);
        d2 = LocalDate.parse(fechaSal);
        if(VerificarFecha(d1,d2)==true){
            System.out.println("Fecha confirmada");
            long dias = ChronoUnit.DAYS.between(d1, d2);
            preciototal=dias*aux;
            flag=1;
        }
        else{System.out.println("Excede los dias maximo de hospedaje");           
                }
        }
        System.out.println(" El costo total de su habitacion sera de:   "+"$"+preciototal);
        
        System.out.println("Para confirmar su reserva vuela a introducir su numero de habitacion: ");
        Piso.cambiarEstadoHabitacionaux();

    }
    
    public static boolean VerificarFecha(LocalDate d1,LocalDate  d2){
        long dias = ChronoUnit.DAYS.between(d1, d2);
        if(dias>7){
            return false;
        }
        else{
            return true;
        }
        
    }

}
