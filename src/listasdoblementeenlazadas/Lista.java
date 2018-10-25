
package listasdoblementeenlazadas;

public class Lista {
   private Node inicio,fin;
   public Lista(){
       inicio=null;
       fin=null;
   }
   void Insert(int dat)
{
    Node nuevo = new Node(dat);
        if(inicio==null)
        {
           inicio=nuevo;
           fin=nuevo;}
        else
        {
           nuevo.siguiente=inicio;
           inicio.anterior=nuevo;
           inicio=nuevo;}
 print();
}
   
   void InsertAtEnd(int dat){
       Node nuevo = new Node(dat);
    if(fin==null)
    {
        inicio=nuevo;
        fin=nuevo;}
    
    else
    {
        nuevo.anterior=fin;
        fin.siguiente=nuevo;
        fin=nuevo;}
       
    
}
   
   boolean isEmpty() {
       return inicio==null;
   }
   
   
   
   void print() {//metodo para saber si la lista esta vacia
   
    if (isEmpty()) 
        {
           //para saber si la lista esta vacia
           System.out.println("La lista está vacía");
        }
    else
       {
                   
                  
       }
   

       }
   
   }

