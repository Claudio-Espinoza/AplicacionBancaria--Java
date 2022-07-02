package control.entidades;

public class Tarjeta {

    private int saldo = 10000;
    private String numCuenta;
    private int numTransaccion;

    public int getNumTransaccion() {
        return numTransaccion;
    }

    public Tarjeta(String numCuenta) {
        this.numCuenta = numCuenta;
    }


    public String getNumCuenta() {
        return numCuenta;
    }

    public Tarjeta(){

    }


    public int getSaldo() {
        return saldo;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void agregarSaldo(){

        //saldo = saldo + cantidad;

    }




}
