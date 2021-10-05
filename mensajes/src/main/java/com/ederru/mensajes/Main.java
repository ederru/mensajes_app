
package com.ederru.mensajes;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Eder Ruíz
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do{
            System.out.println("----------------"); 
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar memnsaje");
            System.out.println("4. Elminar mensaje");
            System.out.println("5. Salir");
            
            //leemos la entrada del usuario
            opcion = sc.nextInt();
            
            switch(opcion) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                default:
                    break;
                
            }
            
        }while(opcion !=5);
        
        
        
    }
}
