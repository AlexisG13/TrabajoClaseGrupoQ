/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoclase;

/**
 *
 * @author Alexis Gómez C. <https://github.com/AlexisG13>
 */
public class Cliente {
    String nombre;
    int transaccion [];
    
    public Cliente(String nombre, int transaccion[]){
        this.nombre=nombre;
        this.transaccion=transaccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(int[] transaccion) {
        this.transaccion = transaccion;
    }
    
    
}
