
package com.ederru.mensajes;

import java.util.Scanner;

/**
 *
 * @author Eder Ruíz
 */
public class MensajesService {
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Tu nombre:");
        String nombre = sc.nextLine();
        
        Mensajes mensajeRegistro = new Mensajes();
        mensajeRegistro.setMensaje(mensaje);
        mensajeRegistro.setAutor_mensaje(nombre);
        
        MensajesDao.crearMensajeDB(mensajeRegistro);
    }
    
    public static void listarMensajes() {
        MensajesDao.leerMensajesDB();
    }
    
    public static void borrarMensaje() {
        
    }
    
    public static void editarMensaje() {
        
    }
    
}
