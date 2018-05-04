/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Raul Calderon <https://github.com/calderonra>
 */
public class Admin {

    public String username;
    private String password;

    public Admin (){
        
    }
    
    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void opciones() {
        System.out.println("******** SISTEMA ADMINISTRATIVO ********");
        System.out.println("1. Deshabilitar / Habilitar Habitaciones");
        System.out.println("2. Deshabilitar / Habilitar Pisos");
        System.out.println("3. Modificar Precios");
        System.out.println("4. Modificar Paquetes");
        System.out.println("5. Salir");
    }

    public void menuPaquetes(){
        System.out.println("¿Que desea realizar?");
        System.out.println("1. Ver paquetes");
        System.out.println("2. Agregar paquete");
        System.out.println("3. Borrar paquete");
        System.out.println("4. Modificar precio");
    }
    public void Menu() {
        //Piso habitacion = new Piso();
        ListaPaquetes Packs = new ListaPaquetes();
        ListaPaquetes.IniciarPacks();
        int opcion = 6;
        int opcion2 =6;
        Scanner leer = new Scanner(System.in);

        while (opcion != 5) {
            opciones();
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1: //Des/Habilitar Habitacion 
          //              Piso.cambiarEstadoHabitacion();
          //            Piso.mostrar();
                        break;
                    case 2: //Des/Habilitar Piso
          //              Piso.AgregaPiso();
          //              Piso.mostrar();
                        break;
                    case 3: //Modificar Precios
          //              Piso.cambiarPrecioHabitacion();
          //              Piso.mostrar();
                        break;
                    case 4: //Modificar Paquetes
                        Scanner pepe = new Scanner(System.in);
                        while(opcion2 !=5){
                            menuPaquetes();
                            try{
                                opcion2 =pepe.nextInt();
                                switch(opcion2){
                                    case 1:
                                        ListaPaquetes.MostrarPacks();
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        break;
                                    case 4:
                                        break;
                                    case 5:
                                        break;
                                    default:
                                        System.out.println("Ingresa una opcion valida");
                                }
                            }
                            catch (InputMismatchException e) {
                                System.err.println("Por favor, ingrese un número");
                                pepe.nextLine();
                            }
                        }
                    case 5:
                        System.out.println("Adios, Rafael");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, ingerese un número");
                leer.nextLine();
            }
        }
    }
}
