import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
   public class ConexaoBD {
      static {
         try {
            Class.forName("com.mysql.jdbc.Driver");
         }
         catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
         }
      }
   public static Connection conectar() throws Exception {
      String servidor = "localhost";
      String porta = "3308";
      String database = "mydb";
      String usuario = "root";
      String senha = "Hus05091999";
         return DriverManager.getConnection("jdbc:mysql://"+servidor+":"+porta+"/"+database+"?useTimezone=true&serverTimezone=UTC", "root", "Hus05091999");
   }
   }