/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

/**
 *
 * @author Karina Mina
 */
public class Habitacion extends Piso {
    private float costoNoche;
    private boolean estado = true;
    private char letraPiso;
    private int numHab;

    public  Habitacion(char letraPiso, int numHab,float costoNoche, boolean estado) {
        this.numHab = numHab;
        this.costoNoche = costoNoche;
        this.estado = estado;
        this.letraPiso = letraPiso;
        
    }
    
  @Override
    public String toString() {
        return "Habitacion estado:" + estado + ", costo por Noche = " + costoNoche+ ", Piso "+ letraPiso + ", hab # "+numHab;
    }
    public float getCostoNoche() {
        return costoNoche;
    }
    //GET DE ESTADO

    public boolean isEstado() {
        return estado;
    }

    public void setCostoNoche(float costoNoche) {
        this.costoNoche = costoNoche;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     
    
}
