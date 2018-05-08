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
    
    public static void MostrarReservas(){
        int i=1;
        for(Reserva p: Reservaciones){
            System.out.println(p);
            i++;
        }
    }
    
    public static void AgregarReservas(){
        //Reservaciones.add(new Reserva())
    }
}
