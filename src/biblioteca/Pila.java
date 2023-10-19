package biblioteca;

public class Pila<T> {
    private class Node<T> extends Pila<T>{
        private T data;
        private Node next;

        public Node() {
            this.next = null;
        }

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    
    private Node<T> anchor;
    
    public Pila() {
        this.anchor = null;
    }
    
    public boolean isEmpty(){
        return this.anchor == null;
    }
    
    public void push(T e){
        Node aux = new Node(e);
        if(aux == null){
            System.out.println("No hay memoria");
        }
        aux.setNext(anchor);
        anchor=aux;
    }
    
    public T pop(){
        if(anchor==null){
             throw new IllegalStateException("La pila está vacía");
        }
        T result=anchor.getData();
        Node aux = anchor;
        anchor = anchor.getNext(); // Actualizar el nodo "anchor" al siguiente nodo
        aux = null;
        return result;
    }
    
    public T getTop(){
        if(anchor==null){
             throw new IllegalStateException("La pila está vacía");
        }
        return anchor.getData();
    }
    
    public String toString(){
        String res = "";
        Node<T> aux = new Node<T>();
        aux = this.anchor;
        do{
//          System.out.println("Elemento: " + aux.getData().toString());
            res += aux.getData().toString();
            aux = aux.getNext();
        }while(aux != null);
//        while (aux.getNext() != null) {
//            System.out.println("Elemento: " + aux.getData().toString());
//            aux = aux.getNext();
//        }
        return res;
    }
}
