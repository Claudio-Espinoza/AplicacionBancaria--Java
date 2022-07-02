package control.controlador;

import UI.frame.NotificacionFail;

import java.util.Random;
import java.util.regex.Pattern;

public class Control {

//-|Nombre|-----------------------------------------------------------------------------------------------------------//

    public String upperCaseName(String nombre) {
        nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
        return nombre;
    }

//-|Rut|--------------------------------------------------------------------------------------------------------------//


    public boolean validarRut(String rut) {

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

    public boolean comprobarEscrituraRut(String rut) {

        if (rut.contains(".") || rut.contains("-")) {
            NotificacionFail notificacionFail = new NotificacionFail("El rut solo tiene que contener numeros");
            return false;
        } else {
            return true;
        }


    }


//-|pin|--------------------------------------------------------------------------------------------------------------//

    public boolean validarPin(String pinString) {

        boolean validar = true;

        try {

            if (pinString.length() != 4) {

                validar = false;
            }

        } catch (Exception e) {
            validar = false;

        }

        return validar;
    }

    // https://es.stackoverflow.com/questions/92139/c%C3%B3mo-verificar-que-el-valor-de-una-variable-string-es-un-integer-en-java
    public boolean isNumeric (String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }




//-|Mail|-------------------------------------------------------------------------------------------------------------//

    public boolean validarCorreo(String email) { //Este esta robadisimo pero no me acuerdo de donde
        String emailREGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailREGEX);
        if (email == null) {
            return false;

        }
        return pattern.matcher(email).matches();
    }

//-|random|-------------------------------------------------------------------------------------------------------------//

    public int generarNumTransaccion() {
        Random random = new Random();

        int numTransaccion;

        do {
            numTransaccion = random.nextInt(10000);

        } while (baseDeDatos.comprobarNumTransaccion(numTransaccion));


        return numTransaccion;
    }

    public String calcularDivisaEuro(double saldo) {
        saldo = saldo / 962.19;



        return saldo+" €";
    }

    public String calcularDivisaDolar(double saldo) {
        saldo = saldo / 851.31;



        return saldo+" $";
    }

    public boolean comprobarAdministrador(String rut, String pin) {
        if ("noseyo".equals(rut) && "sisabes".equals(pin)) {
            return true;
        } else {
            return false;
        }
    }

    public String generarNumeroTarjeta() {
        Random random = new Random();
        String numTarjeta;
        int numero;

        do {
            numero = random.nextInt(1000000000) + 1000000;
            numTarjeta = String.valueOf(numero);

        } while (baseDeDatos.comprobarNumTarjeta(numTarjeta));


        return numTarjeta;
    }



}
