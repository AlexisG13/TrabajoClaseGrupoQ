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
    public static void AgregarPack(){
        Packs.add(new Paquete("Premium",true,true,true,true,true));
        Packs.add(new Paquete("Básico",false,true,false,false,true));
    }
    public static void MostrarPacks(){
        int cont=0;
        System.out.println(Packs.get(0)+"\n"+Packs.get(1));
    }
    
    
}
