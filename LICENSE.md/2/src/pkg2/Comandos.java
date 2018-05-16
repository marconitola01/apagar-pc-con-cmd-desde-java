
package pkg2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author marco
 */
      public class Comandos{ 
     
    public static void ejecutar(String cmd) { 
      Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
      
        switch(opcion){
            case 1:
            try { 
            Runtime.getRuntime().exec(cmd); 
        }  
        catch (IOException e) { 
            System.out.println("Failed");         
        } 
            case 2:
                break;
            case 3:
                break;
        } }
      
    public static void main(String[] str) { 
        
        System.out.println("1. apagar");
        System.out.println("2. no apagar");
        System.out.println("3. salir");
      
        ejecutar("shutdown -a"); 
    
    } 
} 

