import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {


    public static void main(String[] args) {

            //Con esto n hace falta liarse en los modulos
            //Class.forName("com.mysql.cj.jdbc.Driver");


        Connection con = Conezion.abrirConexion("ad2223_caguilar","1234","jdbc:mysql://dns11036.phdns11.es/ad2223_caguilar");
        try {
            transaccion(con);
        } catch (SQLException e) {
            System.out.println("Ze mamó");
        }
    }

    public static void transaccion(Connection con) throws SQLException {
        con.setAutoCommit(false);	// Se desactiva el AutoCommit para poder realizar la transacción
        Statement st = con.createStatement();
        String sql;
        sql="drop table if exists cliente;";
        st.execute(sql);	// Se elimina la tabla si existiera
        System.out.println("Elimina la tabla");
        sql="CREATE TABLE cliente(id int primary key, nombre varchar(45));";
        st.execute(sql);	// Se crea la tabla
        System.out.println("Crea la tabla");
        sql="insert into cliente VALUES (1,'UNO');";
        st.executeUpdate(sql);	// Inserta el registro 1
        System.out.println("Inserta registro 1");
        try{
            con.commit();		// Comienza la transacción
            sql="insert into cliente VALUES (2,'DOS');";
            st.executeUpdate(sql);	// Inserta el registro 2
            System.out.println("Inserta registro 2");
            sql="insert into cliente VALUES (3,'TRES');";
            st.executeUpdate(sql);	// Inserta el registro 3
            System.out.println("Inserta registro 3");
            sql="insert into cliente VALUES (3,'CUATRO');";
            st.executeUpdate(sql);	// Intenta insertar el registro 3 en vez de 4
            System.out.println("No inserta registro al exister el ID 3");
        }catch(SQLException e) {
            con.rollback();		// Deshace las dos últimas inserciones (2 y 3) ya que la última lanzó el error
        }
        con.setAutoCommit(true);	// Se vuelve a activar el AutoCommit
    }
}