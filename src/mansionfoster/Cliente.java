/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

import java.util.Scanner;

/**
 *
 * @author rauli
 */
public class Cliente {

    private static int DUI;

    public Cliente(int DUI) {
        this.DUI = DUI;
    }

    public void setDUI(int DUI) {
        this.DUI = DUI;
    }

    public int getDUI() {
        return DUI;
    }
    public static void pedieldui(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero de DUI: ");
        DUI=sc.nextInt();
        
        
        
    }
}
