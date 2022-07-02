package control.entidades;

public enum Motivo {
    PERSONAL ("Personal") , PAGO ("Pago"), PRESTAMO ("Prestamo");
    
    String motivo ;

    Motivo(String m){
        this.motivo=m;
    }
}
