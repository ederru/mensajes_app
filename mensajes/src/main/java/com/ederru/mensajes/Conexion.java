
package com.ederru.mensajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Eder Ruíz
 */
public class Conexion {
    
    public Connection get_Connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_bd","root","");
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
    
}
