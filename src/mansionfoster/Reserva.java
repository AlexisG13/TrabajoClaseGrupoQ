/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansionfoster;

/**
 *
 * @author andre
 */
public class Reserva {
    private int numDias, numHabsARes;
    //public Paquete paquete;
    private Check checkOut;
    private Check checkIn;

    public Reserva(int numDias, int numHabsARes, Check checkOut, Check checkIn) {
        this.numDias = numDias;
        this.numHabsARes = numHabsARes;
        this.checkOut = checkOut;
        this.checkIn = checkIn;
    }

    public Check getCheckOut() {
        return checkOut;
    }

    public Check getCheckIn() {
        return checkIn;
    }

    public int getNumDias() {
        return numDias;
    }

    public int getNumHabsARes() {
        return numHabsARes;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public void setNumHabsARes(int numHabsARes) {
        this.numHabsARes = numHabsARes;
    }

    public void setCheckOut(Check checkOut) {
        this.checkOut = checkOut;
    }

    public void setCheckIn(Check checkIn) {
        this.checkIn = checkIn;
    }
    
    
}
