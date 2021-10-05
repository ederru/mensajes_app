
package com.ederru.mensajes;

/**
 *
 * @author Eder Ruíz
 */
public class Mensajes {
    private int id_mensaje;
    private String mensaje;
    private String autor_mensaje;
    private String fecha_mensaje;
    
    public Mensajes() {
        
    }

    public Mensajes(String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }
    
    

    /**
     * @return the id_mensaje
     */
    public int getId_mensaje() {
        return id_mensaje;
    }

    /**
     * @param id_mensaje the id_mensaje to set
     */
    public void setId_mensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the autor_mensaje
     */
    public String getAutor_mensaje() {
        return autor_mensaje;
    }

    /**
     * @param autor_mensaje the autor_mensaje to set
     */
    public void setAutor_mensaje(String autor_mensaje) {
        this.autor_mensaje = autor_mensaje;
    }

    /**
     * @return the fecha_mensaje
     */
    public String getFecha_mensaje() {
        return fecha_mensaje;
    }

    /**
     * @param fecha_mensaje the fecha_mensaje to set
     */
    public void setFecha_mensaje(String fecha_mensaje) {
        this.fecha_mensaje = fecha_mensaje;
    }
    
    
}
