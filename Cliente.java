
import java.util.Scanner;
import java.util.regex.Pattern;

public class Cliente extends Usuario {
//-|Atributos|--------------------------------------------------------------------------------------------------------//

    private String pin;
    private String telefono;
    private String correo;

//-|Constructor|------------------------------------------------------------------------------------------------------//

    public Cliente() {
        super();
        this.pin = preguntarPin();
        this.telefono = preguntarTelefono();
        this.correo = preguntarCorreo();
    }

//-|Metodo|-----------------------------------------------------------------------------------------------------------//

    //-|Pin|-//
    private String preguntarPin() {
        Scanner entrada = new Scanner(System.in);
        boolean validar = true;
        int pin = 0;

        do {
            validar = true;
            try {

                System.out.print("Ingrese su Pin: ");
                pin = entrada.nextInt();
                if (pin > 9999 || pin < 1000) {
                    System.out.println("Esa contraseña no es valida");
                    validar = false;
                }
            } catch (Exception e) {
                validar = false;
                System.out.println("Esa contraseña no es valida");
                entrada.next();
            }
        } while (validar != true);

        String pinString = String.valueOf(pin);

        return pinString;
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

            if (validarCorreo(mail) == false) {
                System.out.println("Ese correo no es valido");
            }

        } while (!validarCorreo(mail));


        return mail;
    }

    private boolean validarCorreo(String email) {
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
        return super.toString() +
                "- Pin/Usuario: " + pin + "\n" +
                "- Correo: " + correo + "\n" +
                "- Telefono: " + telefono + "\n";
    }
}
