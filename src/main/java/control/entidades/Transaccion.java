package control.entidades;

import java.util.Date;

public class Transaccion {
//-|Atributos|--------------------------------------------------------------------------------------------------------//

    private String fecha;
    private int numtransaccion;
    private int monto;
    private String rutDestinatario;
    private String rutlocal;
    private String motivo ="";


//-|Constructor|------------------------------------------------------------------------------------------------------//

    public Transaccion() {

    }

    public Transaccion(String fecha, int monto, String rutDestinatario, String rutlocal, int numtransaccion){
        this.fecha = fecha;
        this.monto = monto;
        this.rutDestinatario = rutDestinatario;
        this.rutlocal = rutlocal;
        this.numtransaccion = numtransaccion;

    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }


    //-|Getter|-----------------------------------------------------------------------------------------------------------//


    public String getMotivo() {
        return motivo;
    }



    public String getRutlocal() {
        return rutlocal;
    }

    public String getFecha() {
        return fecha;
    }

    public int getNumtransaccion() {
        return numtransaccion;
    }

    public int getMonto() {
        return monto;
    }

    public String getRutDestinatario() {
        return rutDestinatario;
    }

//-|toString|---------------------------------------------------------------------------------------------------------//

    @Override
    public String toString() {
        return " | " + fecha + " | " + monto + " | ";
    }
}
