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
public class ListaPaquetes {
    
    public static ArrayList<Paquete> Packs = new ArrayList<>();
    public ListaPaquetes(){};
    public static void IniciarPacks(){
        Packs.add(new Paquete("Premium",true,true,true,true,true));
        Packs.add(new Paquete("Básico",false,true,false,false,true));
    }
    public static void MostrarPacks(){
        int i=1;
        for(Paquete p : Packs){
            System.out.println(i+"- "+p);
            i++;
        }
    }
    public static void AgregarPack(){
        System.out.println("Nombre del paquete");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Packs.add(new Paquete(s,true,true,true,true,true));
    }
    
    public static void ModificarPack(){
        System.out.println("Elija el número del paquete a modificar");
        MostrarPacks();
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        Packs.remove(s-1);
        
    }
    
    public static void Hacete(){
        IniciarPacks();
        MostrarPacks();
    }
    
}
