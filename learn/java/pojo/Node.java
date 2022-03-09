package learn.java.pojo;

public class Node<E> {
    
    //item - This contains the value of the current element.
    E item;
    //next - This contains the pointer to the next element.
    Node<E> next;
    //prev - This contains the pointer to the previous element.
    Node<E> prev;

    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}
