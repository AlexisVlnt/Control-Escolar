package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
  
    static String bd = "control_escolar";
    static String login ="root";
    static String password = "123456";
//    static String password = "MYSQL123";
//    static String password = "server";
    
    static String url = "jdbc:mysql://localhost:3306/"+bd;
    
    Connection conn = null;
    
    public conexion() { //Metodo Constructor
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            conn = DriverManager.getConnection(url, login, password);
                    if (conn != null) {
                        System.out.println("Conexion a base de datos " + bd + " OK");
                     }
        }
        catch(SQLException e) {
            System.out.println(e);
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    
    public void desconectar() {
        conn = null;
        if (conn == null) {
            System.out.println("Conexion terminada");
            
        }
    }
}
