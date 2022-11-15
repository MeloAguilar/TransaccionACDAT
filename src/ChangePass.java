import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ChangePass {
    public static void cambiarPassword (){
        try {
            Connection connection = Conezion.abrirConexion("ad2223_caguilar","Patatitasexy69","jdbc:mysql://dns11036.phdns11.es/ad2223_caguilar");
            Statement statement = connection.createStatement();
            statement.executeUpdate("SET PASSWORD FOR 'ad2223_caguilar'@'%' = password('Patatitasexy69')");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
