package control.entidades;

public abstract class Persona {
    String nombre;
    String apellido;
    String apellido2;


    public Persona(String nombre, String apellido, String apellido2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getApellido2() {
        return apellido2;
    }
}
