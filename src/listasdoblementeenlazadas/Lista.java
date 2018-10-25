
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
       
     print();
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
    Node node = this.inicio;
    
        System.out.print(node.dato);
            while (node.siguiente != null) {//el while pregunta si node.sig no es nulo
                System.out.print(" -> ");
                node = node.siguiente;
                System.out.print(node.dato);
            }
            System.out.println("");
        }
    }
   void BorrarAlInicio(){//metodo para borrar al inicio
       Node node = this.inicio;
       if(isEmpty())
       {
           System.out.println("La lista esta vacia");}
       else
       {
           Node siguiente = inicio.siguiente;
           inicio = siguiente;}
       print();
       
   }
   void BorrarAlFinal(){   //metodo para borrar al final
       if(isEmpty()){
           System.out.println("La lista esta vacia");
       }else{
        Node siguiente = inicio;
        Node anterior = null;
            while(siguiente.siguiente != null) {
                anterior = siguiente;
                siguiente = siguiente.siguiente;
            }
            if(anterior != null) {
                anterior.siguiente = null;
            } else {
                inicio = null;
            }
       }
       print();
   }
}

