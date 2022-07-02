/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.entidades;

/**
 *
 * @author Claudio Espinoza
 */
public class Banco {

    private String motivo;
    private String fecha;
    private int saldo;
    private int numOperacion;

    public Banco() {

    }
    
    public Banco(String motivo, String fecha, int saldo, int numOperacion) {
        this.motivo = motivo;
        this.fecha = fecha;
        this.saldo = saldo;
        this.numOperacion = numOperacion;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getNumOperacion() {
        return numOperacion;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setNumOperacion(int numOperacion) {
        this.numOperacion = numOperacion;
    }
    
    
    
    

}
