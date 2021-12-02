import java.util.Scanner;
import java.util.regex.Pattern;

public class Usuario {
//-|Atributos|--------------------------------------------------------------------------------------------------------//

    private String nombre;
    private String rut;

//-|Constructor|------------------------------------------------------------------------------------------------------//

    public Usuario() {
        this.nombre = preguntarNombre();
        this.rut = preguntarRut();
    }

//-|Metodo|-----------------------------------------------------------------------------------------------------------//

    //-|Nombre|-//
    private String preguntarNombre() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresé es su primer nombre: ");
        String primerNombre = entrada.next();
        primerNombre = upperCaseName(primerNombre);

        System.out.print("Ingresé es su segundo nombre: ");
        String segundoNombre = entrada.next();
        segundoNombre = upperCaseName(segundoNombre);

        System.out.print("Ingresé es su apellido paterno: ");
        String primerApellido = entrada.next();
        primerApellido = upperCaseName(primerApellido);

        System.out.print("Ingresé es su apellido materno: ");
        String segundoApellido = entrada.next();
        segundoApellido = upperCaseName(segundoApellido);

        String nameCompleto = primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido;

        return nameCompleto;
    }

    private String upperCaseName(String nombre) {
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();

        return nombre;
    }

    //-|Rut|-//
    private String preguntarRut() {
        Scanner entrada = new Scanner(System.in);
        String rut;
        boolean validador = true;

        do {
            System.out.print("Ingrese su rut: ");
            rut = entrada.next();
            validador = validarRut(rut);

            if (validador == false) {
                System.out.println("Ese rut no es valido");
            }
        } while (!validador);

        rut = modificarRut(rut);

        return rut;
    }

    private boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    private String modificarRut(String rut) {
        String rutDigito = rut;

        rut = rut.substring(0, 8);
        rutDigito = rutDigito.substring(8);

        rut = rut + "-" + rutDigito;

        return rut;
    }

//-|toString|---------------------------------------------------------------------------------------------------------//

    @Override
    public String toString() {
        return "Informacion de usuairo \n" +
                "- Nombre: " + nombre + "\n" +
                "- Rut: " + rut + "\n";
    }
}
