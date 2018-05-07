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
    public static int preciousar;
    public static void IniciarPacks(){
        Packs.add(new Paquete("Premium",true,true,true,true,true,150));
        Packs.add(new Paquete("Básico",false,true,false,false,true,10));
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
        System.out.println("Precio del paquete");
        int pipo = scan.nextInt();
        System.out.println("¿Que servicios incluira el paquete?(Indiquelo"
                + " usando true o false)\n");
        System.out.println("¿Desayuno?");
        boolean des = scan.nextBoolean();
        System.out.println("¿Piscina?");
        boolean pis = scan.nextBoolean();
        System.out.println("¿Servicio a la habitación?");
        boolean hab = scan.nextBoolean();
        System.out.println("¿Minibar?");
        boolean min = scan.nextBoolean();
        System.out.println("¿Internet ilimitado?");
        boolean inter = scan.nextBoolean();
        Packs.add(new Paquete(s,des,true,true,true,true,pipo));
    }
    
    public static void BorrarPack(){
        System.out.println("Elija el número del paquete a borrar");
        MostrarPacks();
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        Packs.remove(s-1);
        
    }
    
    public static void VerServicios(){
        System.out.println("Elija el paquete a ver");
        MostrarPacks();
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        System.out.println("Paquete: "+Packs.get(p-1).getNombre());
        System.out.println("Precio: "+Packs.get(p-1).precio+"\nServicios:");
        System.out.println("Desayuno: "+Packs.get(p-1).desayuno);
        System.out.println("Piscina: "+Packs.get(p-1).piscina);
        System.out.println("Servicio a la habitación: "+Packs.get(p-1).servicioHab);
        System.out.println("Internet: "+Packs.get(p-1).internet);
        System.out.println("Minibar: "+Packs.get(p-1).minibar);
    }
    
    public static void ModificarPack(){
        System.out.println("Elija el número del paquete a modificar");
        MostrarPacks();
        Scanner scan= new Scanner(System.in);
        int s = scan.nextInt();
        System.out.println("Nombre del paquete");
        String o = scan.next();
        System.out.println("Precio del paquete");
        int pipo = scan.nextInt();
        System.out.println("¿Que servicios incluira el paquete?(Indiquelo"
                + " usando true o false)\n");
        System.out.println("¿Desayuno?");
        boolean des = scan.nextBoolean();
        System.out.println("¿Piscina?");
        boolean pis = scan.nextBoolean();
        System.out.println("¿Servicio a la habitación?");
        boolean hab = scan.nextBoolean();
        System.out.println("¿Minibar?");
        boolean min = scan.nextBoolean();
        System.out.println("¿Internet ilimitado?");
        boolean inter = scan.nextBoolean();
        Packs.set((s-1),new Paquete(o,des,true,true,true,true,pipo));             
    }
    
    public static int obtenerPrecioPack(String pack){
        for(int i=0;i<Packs.size();i++){
            if(pack.equalsIgnoreCase(Packs.get(i).getNombre())){
                preciousar = Packs.get(i).precio;
                System.out.println("El paquete cuesta: $"+preciousar);
                return preciousar;
            }
        }
        
       return 0;
    }
            
    
}
