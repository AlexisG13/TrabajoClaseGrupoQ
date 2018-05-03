/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

/**
 *
 * @author Alexis Gomez
 */
public class Paquete {
//Servicios que pueden contener los paquetes

    public String nombre;
    public boolean desayuno;
    public boolean piscina;
    public boolean servicioHab;
    public boolean minibar;
    public boolean internet;

    public Paquete(String nombre, boolean desayuno, boolean piscina,
            boolean servicioHab, boolean minibar, boolean internet) {
        this.nombre = nombre;
        this.desayuno = desayuno;
        this.piscina = piscina;
        this.servicioHab = servicioHab;
        this.minibar = minibar;
        this.internet = internet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//Métodos 
    private void EscogePaquete() {

    }

    private void AgregarPaquete() {

    }

    private void ModPaquete() {

    }

}
