
package com.ederru.mensajes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Eder Ruíz
 */
public class MensajesDao {
    
    public static void crearMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();
        
        try (Connection conexion = db_connect.get_Connection()){
            
            PreparedStatement p = null;
            
            try {
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                p = conexion.prepareStatement(query);
                p.setString(1, mensaje.getMensaje());
                p.setString(2, mensaje.getAutor_mensaje());
                p.executeUpdate();
                System.out.println("El mensaje fue creado exitosamente");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
    
    public static void leerMensajesDB() {
        
    }
    
    public static void borrarMensajeDB(int id_mensaje) {
        
    }
    
    public static void actualizarMensajeDB(Mensajes mensaje) {
        
    }
    
}
