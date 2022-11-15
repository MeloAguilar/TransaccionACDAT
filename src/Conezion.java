

import java.sql.*;

public class Conezion {


    private static Connection conn;



    public static Connection abrirConexion(String user, String pass, String bbdd){
        try{
            conn = DriverManager.getConnection(bbdd, user,pass);
            if(conn != null){
                System.out.println("Conexion correcto");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo abrir la conexion");
        }
        return conn;
    }

    public static void cerrarConexion() throws SQLException {
        if(conn != null){
            conn.close();
        }
    }
}
