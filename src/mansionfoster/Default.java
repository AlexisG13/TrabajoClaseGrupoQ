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
 * @author Karina Mina
 */
public class Default {

    public Default() {
    }

    public void opciones() {
        System.out.println("------ SISTEMA DEFAULT ------");
        System.out.println("1. Ver reservas semanales");
        System.out.println("2. Agregar reserva");
        System.out.println("3. Cancelar reserva");
        System.out.println("4. Modificar reserva");
        System.out.println("5. Salir");
        System.out.print(": ");
    }

    public void Menu() {
        int opcion = 6;
        Scanner leer = new Scanner(System.in);
        Piso.AgregaPiso();
        while (opcion != 5) {
            opciones();
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1: //Ver reservas
                        Piso.mostrar();
                        break;
                    case 2: //Agregar reserva
                       Reserva.reservar();
                        break;
                    case 3: //Cancelar reserva

                        break;
                    case 4: //Modificar reserva
                        break;
                    case 5:
                        System.out.println("    Saliendo del Sistema Default");
                        break;
                    default:
                        System.out.println("    Por favor ingrese una opción valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("    Por favor, ingrese un número");
                leer.nextLine();
            }
        }
    }
}
