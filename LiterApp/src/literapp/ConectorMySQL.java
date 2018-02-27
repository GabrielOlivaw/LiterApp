package literapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabag
 */
public class ConectorMySQL {
    private static final String BD = "literapp_libros";
    private static final String URL = "jdbc:mysql://localhost/" + BD;
    private static final String USER = "root";
    private static final String PASS = null;
    
    public static Connection conectarBD() {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}
