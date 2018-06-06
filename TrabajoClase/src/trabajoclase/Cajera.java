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
public class Cajera extends Thread {
    String nombre; 
    Cliente cliente;
    long initialTime;

    public Cajera(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
    
    
    
    @Override
    
    public void run(){
        System.out.println("La cajera "+this.nombre+" comienza a procesar la "
                + "transacción "+this.cliente.getNombre()+" se tardo "
                +(System.currentTimeMillis()-this.initialTime)/1000);
        
        for(int i=0;i<this.cliente.getTransaccion().length;i++){
            
        }
    }
    
    public void Esperar(int s){
        try{
            Thread.sleep(s*1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
}
}