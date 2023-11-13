import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnect {
    
    public static void main(String[] args) {
        
        getConnection();
    }
     public static Connection getConnection(){
     
        Connection conn = null;
        try {  
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/inventorymanagementsystem", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }       
        return conn;
    }
}
