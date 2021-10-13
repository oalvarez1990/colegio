package taller3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class conexion {

    public static Connection getConexion;

    static Object getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    {

        String conexionUrl = "jdbc:sqlserver://localhost:1433"
                + "database=colegio;"
                + "user-sa;"
                + "password=;"
                + "loginTimeout=30;";

        try {
            Connection con = DriverManager.getConnection(conexionUrl);
        } catch (SQLException ex) {
            System.out.println("ex.toString");
        }

    }

}
