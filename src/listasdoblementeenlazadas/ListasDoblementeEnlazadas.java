
package listasdoblementeenlazadas;

import java.util.Scanner;


public class ListasDoblementeEnlazadas {

    
    public static void main(String[] args) {
     Lista list = new Lista();
     Scanner teclado = new Scanner(System.in);
        int opcion;
        
        System.out.println("------moe moe moe moe moe moe moe------");
        System.out.println("1.- Insertar Al Inicio :3 ");
        System.out.println("2.- Insertar Al Final :0 ");
        System.out.println("3.- Borrar Al Inicio >3< ");
        System.out.println("4.- Borrar Al Final :3 ");
        System.out.println("5.- Mostar de Inicio a Fin n.n");
        System.out.println("6.- Mostar de Fin a Inicio nwn");
        System.out.println("7.- Salir, Exit, Bye Bye!!");
        System.out.println("------moe moe moe moe moe moe moe------");
        
        System.out.println("Que opcio desea elegir? :3");
         opcion = teclado.nextInt();
         
        while(opcion!=7)
        {
          switch(opcion)
          {
              case 1:
                  int dato;
                System.out.print("Digite el numero");
                dato=teclado.nextInt();
                list.Insert(dato);
                  break;
              case 2:
                System.out.println("Digite el numero");
                dato=teclado.nextInt();
                list.InsertAtEnd(dato);
                  break;
              case 3:
                  list.BorrarAlInicio();
                  break;
              case 4:
                  list.BorrarAlFinal();
                  break;
              case 5:
                  break;
              case 6:
                  break;
              case 7:
                  break;
              default:
          } 
          System.out.println("------moe moe moe moe moe moe moe------");
        System.out.println("1.- Insertar Al Inicio :3 ");
        System.out.println("2.- Insertar Al Final :0 ");
        System.out.println("3.- Borrar Al Inicio >3< ");
        System.out.println("4.- Borrar Al Final :3 ");
        System.out.println("5.- Mostar de Inicio a Fin n.n");
        System.out.println("6.- Mostar de Fin a Inicio nwn");
        System.out.println("7.- Salir, Exit, Bye Bye!!");
        System.out.println("------moe moe moe moe moe moe moe------");
        
        System.out.println("Que opcio desea elegir? :3");
         opcion = teclado.nextInt();
        
        
        }
            
         
         
            
    }
    
}
