package control.entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona{
//-|Atributos|--------------------------------------------------------------------------------------------------------//

    private String rut;
    private String pin;
    private String mail;
    private Tarjeta tarjeta;

//-|Constructor|------------------------------------------------------------------------------------------------------//

    public Tarjeta getTarjeta() {
        return tarjeta;
    }


    public Usuario(String primerNombre, String apellidoPaterno, String apellidoMaterno, String rut, String pin, String mail,String numCuenta) {
        super(primerNombre,apellidoPaterno,apellidoMaterno);
        this.rut = rut;
        this.pin = pin;
        this.mail = mail;
        this.tarjeta = new Tarjeta(numCuenta);
    }



//-|Getter|-----------------------------------------------------------------------------------------------------------//

    public String getRut() {
        return rut;
    }

    public String getPin() {
        return pin;
    }

    public String getMail() {
        return mail;
    }

//-|toString|---------------------------------------------------------------------------------------------------------//

    @Override
    public String toString() {
        return  super.toString()+ " | " + rut + " | " + pin +
                " | " +  mail  + " | ";
    }
}
