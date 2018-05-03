/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;
import java.util.ArrayList;

/**
 *
 * @author Alexis Gómez C. <https://github.com/AlexisG13>
 */
public class ListaPaquetes {
    public static ArrayList<Paquete> Packs = new ArrayList<>();
    
    ListaPaquetes(){
        Packs.add(new Paquete("Premium",true,true,true,true,true));
        Packs.add(new Paquete("Básico",false,true,false,false,true));
    }
    
    
    
    
}
