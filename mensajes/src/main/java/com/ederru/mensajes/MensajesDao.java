
package com.ederru.mensajes;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.spec.PSource;

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
        Conexion db_connect = new Conexion();
        
        PreparedStatement p = null;
        ResultSet rs = null;
        
        try (Connection conexion = db_connect.get_Connection()){
            
            String query = "SELECT * FROM mensajes";
            p = conexion.prepareStatement(query);
            rs = p.executeQuery();
            
            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");
            }
            
            
            
        } catch (SQLException e) {
            System.out.println("Error: no se pudieron recuperar los mensajes.");
            System.out.println(e);
        }
    }
    
    public static void borrarMensajeDB(int id_mensaje) {
        Conexion db_connect = new Conexion();
        
        try (Connection conexion = db_connect.get_Connection()){
            PreparedStatement p = null;
            
            try {
                String query = "DELETE FROM mensajes WHERE ID_MENSAJE = ? ";
                p = conexion.prepareStatement(query);
                p.setInt(1, id_mensaje);
                p.executeUpdate();
                System.out.println("Mensaje Eliminado");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("Mensaje no eliminado");
            }
            
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
    }
    
    public static void actualizarMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();
        
        try (Connection conexion = db_connect.get_Connection()){
            PreparedStatement p = null;
            
            try {
                String query = "UPDATE mensajes SET MENSAJE = ? WHERE ID_MENSAJE = ? ";
                p = conexion.prepareStatement(query);
                p.setString(1, mensaje.getMensaje());
                p.setInt(2, mensaje.getId_mensaje());
                p.executeUpdate();
                System.out.println("Mensaje se atualizó correctamente");
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("Falla al actualizar");
            }
            
        } catch (SQLException e) {
            
            System.out.println(e);
        }
    }
    
}
