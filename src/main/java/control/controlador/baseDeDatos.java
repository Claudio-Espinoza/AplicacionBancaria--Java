package control.controlador;

import control.entidades.Motivo;
import control.entidades.Tarjeta;
import control.entidades.Transaccion;
import control.entidades.Usuario;

import java.sql.SQLException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class baseDeDatos {

    static final String DB_URL = "jdbc:mysql://localhost/usuarios";
    static final String USER = "Claudio";
    static final String PASS = "1234";
    static String QUERY = "SELECT rut,pin from usuario";

    public static void agregarUsuario(Usuario usuario) {
        Connection connection;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            PreparedStatement insert = connection.prepareStatement("INSERT INTO usuario"
                    + "(nombre,apellido,apellido2,email,rut,pin,numtarjeta)"
                    + " VALUES (?,?,?,?,?,?,?)");
            {

                insert.setString(1, usuario.getNombre());
                insert.setString(2, usuario.getApellido());
                insert.setString(3, usuario.getApellido2());
                insert.setString(4, usuario.getMail());
                insert.setString(5, usuario.getRut());
                insert.setString(6, usuario.getPin());
                insert.setString(7, usuario.getTarjeta().getNumCuenta());
            }
            insert.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void agregarTarjeta(Tarjeta tarjeta) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            PreparedStatement insert = connection.prepareStatement("INSERT INTO tarjeta"
                    + "(numtarjeta,saldo)" + " VALUES (?,?)");
            {

                insert.setString(1, tarjeta.getNumCuenta());
                insert.setInt(2, tarjeta.getSaldo());

            }
            insert.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void guardarTransaccion(Transaccion transaccion) {

        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            PreparedStatement insert = connection.prepareStatement("INSERT INTO transacciones"
                    + "(dinero,fecha,rutdestino,rutlocal,numtransaccion)"
                    + " VALUES (?,?,?,?,?)");

            insert.setInt(1, transaccion.getMonto());
            insert.setString(2, transaccion.getFecha());
            insert.setString(3, transaccion.getRutDestinatario());
            insert.setString(4, transaccion.getRutlocal());
            insert.setInt(5, transaccion.getNumtransaccion());

            insert.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarCuenta(String rut) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            PreparedStatement insert = connection.prepareStatement("DELETE  FROM usuario Where rut =  " + rut);

            insert.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void eliminarTarjeta(String numtarjeta) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            PreparedStatement insert = connection.prepareStatement("DELETE FROM tarjeta Where numtarjeta=  " + numtarjeta);

            insert.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void agregarMotivoTransaccion(String rut, String motivo) {

        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            PreparedStatement insert = connection.prepareStatement("UPDATE transacciones set motivo =  " + motivo + " WHERE rutlocal = " + rut);

            insert.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean comprobarNumTarjeta(String numTarjeta) {
        String QUERY2 = "SELECT numtarjeta FROM tarjeta";
        boolean validacion = false;

        Statement statement;
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {

                if (numTarjeta.equals(resultSet.getString("numtarjeta"))) {
                    validacion = true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return validacion;
    }

    public static boolean comprobarNumTransaccion(int numTransaccion) {
        String QUERY2 = "SELECT numtransaccion FROM transacciones";
        boolean validacion = false;

        Statement statement;
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {

                if (numTransaccion == resultSet.getInt("numtransaccion")) {
                    validacion = true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return validacion;
    }

    public static boolean comprobarSaldo(String numtarjeta, int gastar) {

        String QUERY2 = "SELECT saldo FROM tarjeta where numtarjeta = " + numtarjeta;

        boolean validacion = true;

        Statement statement;
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {

                if (gastar > resultSet.getInt("saldo")) {
                    validacion = false;
                } else {
                    validacion = true;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return validacion;

    }

    public static void quitarDinero(String numtarjeta, int monto) {
        String QUERY2 = "SELECT saldo FROM tarjeta where numtarjeta =" + numtarjeta;

        Statement statement;
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                int dinero = resultSet.getInt("saldo");
                dinero = dinero - monto;

                actualizarFondo(dinero, numtarjeta);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void agregarDinero(String numtarjeta, int monto) {
        String QUERY2 = "SELECT saldo, numtarjeta FROM tarjeta where numtarjeta = " + numtarjeta;

        Statement statement;
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                int dinero = resultSet.getInt("saldo");
                dinero += monto;

                actualizarFondo(dinero, numtarjeta);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // el parametro es el rut de la persona a la que van a transferir
    public static boolean comprobarUsuarioTransaccion(String rut) {

        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY);

            while (resultSet.next()) {
                if (rut.equals(resultSet.getString("rut"))) {
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean comprobarRutExistente(String rut) {
        String QUERY2 = "SELECT rut FROM usuario";
        boolean validacion = true;

        Statement statement;
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {

                if (rut.equals(resultSet.getString("rut"))) {
                    validacion = false;

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return validacion;
    }

    public static boolean comprobarLogueo(String rut, String pin) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(QUERY);

        while (resultSet.next()) {
            if (rut.equals(resultSet.getString("rut"))) {

                if (pin.equals(resultSet.getString("pin"))) {

                    return true;
                }
            }
        }
        return false;
    }

    //-------------------------------ACTUALIZAR DATOS-----------------------------------------------------------------------------------------------
    public static void actualizarFondo(int fondo, String numtarjeta) {
        Connection connection;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            PreparedStatement insert = connection.prepareStatement("UPDATE tarjeta set saldo = " + fondo
                    + " WHERE numtarjeta =" + numtarjeta);

            insert.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //-------------------------------------Retornar ----------------------------------------------------------------------------------------
    public static String retornarRut(String rut) {

        String QUERY2 = "SELECT rut FROM usuario WHERE rut = " + rut;

        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getString("rut");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String retornarNombre(String rut) {
        String QUERY2 = "SELECT nombre FROM usuario WHERE rut = " + rut;

        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getString("nombre");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String retornarApellido(String rut) {

        String QUERY2 = "SELECT * FROM usuario WHERE rut = " + rut;

        Connection connection;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getString("apellido");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String retornarApellido2(String rut) {

        try {
            Connection connection;

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String QUERY2 = "SELECT * FROM usuario WHERE rut = " + rut;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getString("apellido2");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String retornarCorreo(String rut) {

        try {
            Connection connection;
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String QUERY2 = "SELECT * FROM usuario WHERE rut = " + rut;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getString("email");
            }
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String retornarNumTarjeta(String rut) {

        try {

            Connection connection;

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String QUERY2 = "SELECT numtarjeta FROM usuario WHERE rut = " + rut;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getString("numtarjeta");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";

    }

    // Aqui podria crear un mismo pero en vez de que con el numero de tarjeta, seria con el rut del usuario
    public static int retornarSaldo(String numtarjeta) {

        try {

            Connection connection;

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String QUERY2 = "SELECT saldo FROM tarjeta WHERE numtarjeta = " + numtarjeta;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getInt("saldo");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String retornarMontoTransaccion(String rut, int id) {

        try {

            Connection connection;

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String QUERY2 = "select dinero from transacciones Where rutlocal = " + rut
                    + " AND idtransacciones = " + id;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getString("dinero");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static String retornarFechaTransaccion(String rut, int id) {

        try {

            Connection connection;

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String QUERY2 = "select fecha " + "from transacciones " + " Where rut = " + rut
                    + " AND idtransacciones = " + id;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getString("dinero");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";

    }

    public static String retornarRutDestino(String rut, int id) {

        try {

            Connection connection;

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String QUERY2 = "select rutdestino " + "from transacciones " + "Where rutlocal =" + rut + " AND idtransacciones = " + id;
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getString("rutdestino");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "";
    }

    public static int retornarIDTransaccion(String rut) {
        //SELECT product_id, product_name, list_price
        //FROM production.products
        //WHERE list_price = (SELECT MAX(list_price ) FROM production.products);

        try {

            Connection connection;

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String QUERY2 = "select idtransacciones " + "from transacciones " + " Where rutlocal = " + rut + " AND idtransacciones = "
                    + " (SELECT MAX(idtransacciones))";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getInt("idtransacciones");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static String retornarNumTransaccion(String rut, int id) {

        try {

            Connection connection;

            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String QUERY2 = "select numtransaccion " + "from transacciones " + "Where rutlocal =" + rut
                    + " AND idtransacciones = " + id;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY2);

            while (resultSet.next()) {
                return resultSet.getString("rutdestino");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";

    }
}
