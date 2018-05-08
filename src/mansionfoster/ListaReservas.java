/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;
import java.util.*;

/**
 *
 * @author Alexis Gómez C. <https://github.com/AlexisG13>
 */
public class ListaReservas {
    public static ArrayList<Reserva> Reservaciones = new ArrayList<>();
    public ListaReservas(){};
    
    public static void VerReserva(){
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
    
    
    
    public static void AgregarReservas(Reserva reserva){
        Reservaciones.add(reserva);
        //Reserva.EleccionHabitación();
        //Reservaciones.add(new Reserva("Alexis","00122717","02-03","02-06",100,2));
        //Reservaciones.add(new Reserva())
    }
}
