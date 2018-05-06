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

    public String username = "Rafael";
    private String password = "rafael";
    private String pass;

    public Admin() {

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

    public void login() {
        System.out.println("    Iniciar Sistema Administrativo");
        System.out.println("Username: " + username);
        System.out.print("Password: ");
        Scanner leer = new Scanner(System.in);
        pass = leer.nextLine();

        while (!pass.equals(password)) {
            System.out.println("    Contraseña incorrecta, vuelve a intentarlo");
            System.out.println("Username: " + username);
            System.out.print("Password: ");
            pass = leer.nextLine();
        }
        System.out.println("    Bienvenido, Rafael");
        Menu();
    }

    public void opciones() {
        System.out.println("---- SISTEMA ADMINISTRATIVO ----");
        System.out.println("1. Deshabilitar / Habilitar Habitaciones");
        System.out.println("2. Deshabilitar / Habilitar Pisos");
        System.out.println("3. Modificar Precios");
        System.out.println("4. Modificar Paquetes");
        System.out.println("5. Salir");
        System.out.print(": ");
    }

    public void menuPaquetes() {
        System.out.println("¿Que desea realizar?");
        System.out.println("1. Ver paquetes");
        System.out.println("2. Agregar paquete");
        System.out.println("3. Borrar paquete");
        System.out.println("4. Modificar nombre");
        System.out.println("5. Ver servicios del paquete");
        System.out.println("6. Regresar al menu");
        System.out.print(": ");
    }

    public void Menu() {
        String user = "Rafa";
        String pass = "admin";
        Scanner log = new Scanner(System.in);
        System.out.println("Ingrese el usuario");
        String us = log.next();
        System.out.println("Ingrese la contraseña");
        String pas = log.next();
        if (user.equals(us) == true && pass.equals(pas) == true) {
            //Piso habitacion = new Piso();
            ListaPaquetes Packs = new ListaPaquetes();
            ListaPaquetes.IniciarPacks();
            int opcion = 6;
            int opcion2 = 7;
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
                            Piso.cambiaEstadoPisos();
                            //              Piso.mostrar();
                            break;
                        case 3: //Modificar Precios
                            //              Piso.cambiarPrecioHabitacion();
                            //              Piso.mostrar();
                            break;
                        case 4: //Modificar Paquetes
                            Scanner pepe = new Scanner(System.in);
                            while (opcion2 != 6) {
                                menuPaquetes();
                                try {
                                    opcion2 = pepe.nextInt();
                                    switch (opcion2) {
                                        case 1:
                                            ListaPaquetes.MostrarPacks();
                                            break;
                                        case 2:
                                            ListaPaquetes.AgregarPack();
                                            break;
                                        case 3:
                                            ListaPaquetes.BorrarPack();
                                            break;
                                        case 4:
                                            ListaPaquetes.ModificarPack();
                                            
                                            break;
                                        case 6:
                                            System.out.println("    Regresando al menu");
                                            break;
                                        case 5:
                                            ListaPaquetes.VerServicios();
                                            break;
                                        default:
                                            System.out.println("    Ingresa una opción valida");
                                    }
                                } catch (InputMismatchException e) {
                                    System.err.println("    Por favor, ingrese un número");
                                    pepe.nextLine();
                                }
                            }
                        case 5:
                            System.out.println("    Saliendo del Sistema Administrativo");
                            break;
                        default:
                            System.out.println("    Por favor ingrese una opción valida");
                    }
                } catch (InputMismatchException e) {
                    System.err.println("    Por favor, ingrese un número");
                    leer.nextLine();
                }
            }
        } else {
            System.out.println("Usuario o contraseña incorrecta");
        }
    }

}
