
package com.ederru.mensajes;

import java.sql.Connection;

/**
 *
 * @author Eder Ruíz
 */
public class Main {
    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        
        try (Connection cnx = conexion.get_Connection()){
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
