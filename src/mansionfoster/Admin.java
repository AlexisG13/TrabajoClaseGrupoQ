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

    public void Menu() {
        //Piso habitacion = new Piso();
        int opcion = 6;
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
                        break;
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
