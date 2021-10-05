
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el id del mensaje a eliminar");
        int id_mensaje = sc.nextInt();
        MensajesDao.borrarMensajeDB(id_mensaje);
    }
    
    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nuevo mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Indica el ID del mensaje a editar: ");
        int id_mensaje = sc.nextInt();
        
        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDao.actualizarMensajeDB(actualizacion);
    }
    
}
