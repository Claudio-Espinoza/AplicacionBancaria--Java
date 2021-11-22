import java.util.Scanner;
import java.util.regex.Pattern;

public class Persona {
//-|Constructor|------------------------------------------------------------------------------------------------------//

    private String nombre;
    private String rut;
    private int pin;
    private String correo;
    private String Telefono;

//-|Constructor|------------------------------------------------------------------------------------------------------//

    public Persona() {
        this.nombre = preguntarNombre();
        this.rut = preguntarRut();
        this.pin = preguntarPin();
        this.correo = preguntarCorreo();
        this.Telefono = preguntarTelefono();
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

    //-|Pin|-//
    private int preguntarPin() {
        Scanner entrada = new Scanner(System.in);
        boolean validar = true;
        int pin = 0;

        do {
            validar = true;
            try {

                System.out.print("Ingrese su Pin: ");
                pin = entrada.nextInt();
                if (pin>9999 || pin < 1000) {
                    System.out.println("Esa contraseña no es valida");
                    validar = false;
                }
            } catch (Exception e) {
                validar = false;
                System.out.println("Esa contraseña no es valida");
                entrada.next();
            }
        } while (validar !=true);

        return pin;
    }

    //-|Telefono|-//
    private String preguntarTelefono() {
        Scanner entrada = new Scanner(System.in);
        boolean validar = true;
        String telefono = "+56 9 ", telefonoString;
        int telefonoInt = 0;

        do {
            try {
                validar = true;
                System.out.print("Ingrese su numero de contacto: +56 9 ");
                telefonoInt = entrada.nextInt();
            } catch (Exception e) {
                validar = false;
                System.out.println("Esa contraseña no es valida");
                entrada.next();
            }
        } while (telefonoInt > 99999999 || telefonoInt < 100000000 && !validar);

        telefonoString = String.valueOf(telefonoInt);
        telefono = telefono + telefonoString;


        return telefono;
    }

    //-|Correo|-//
    private String preguntarCorreo() {
        Scanner entrada = new Scanner(System.in);
        boolean validador = true;
        String mail;

        do {
            System.out.print("Ingresé su correo: ");
            mail = entrada.next();

            if (validarMail(mail) == false) {
                System.out.println("Ese correo no es valido");
            }

        } while (!validarMail(mail));


        return mail;
    }

    private boolean validarMail(String email) {
        String emailREGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailREGEX);
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }

//-|toString|---------------------------------------------------------------------------------------------------------//

    @Override
    public String toString() {
        return "Informacion de usuairo \n" +
                "- Nombre: " + nombre + "\n" +
                "- Rut: " + rut + "\n" +
                "- Pin: " + pin + "\n" +
                "- Correo: " + correo + "\n" +
                "- Telefono: " + Telefono;
    }
}
