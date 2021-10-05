
package com.ederru.mensajes;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Eder Ruíz
 */
public class Conexion {
    
    public Connection get_Connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            
            if (connection != null) {
                System.out.println("Conexion exitosa");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
    
}
