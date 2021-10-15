package simpleloginform;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHAMS
 */
public class MY_CNX {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "seat_book";
    private static Integer portnumber = 5355 ;
    private static String password = "";
    
    public static Connection getConnection()
    {
    
         Connection cnx = null;
         
         MysqlDataSource datasource = new MysqlDataSource();
         
         datasource.setServerName(servername);
         datasource.setUser(username);
         datasource.setPassword(password);
         datasource.setDatabaseName(dbname);
         datasource.setPortNumber(portnumber);
         
        try {
            cnx = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection ->" + MY_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return cnx;
    
    }
    
}
