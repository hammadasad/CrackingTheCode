package Chapter3StackQueue;

/** Queue Class using Linked Lists
 * Created by admin on 2015-11-08.
 */
public class Queue {
    
    Node first, back;

    public void enqueue(Object item) {
        if(first == null) {
            first = new Node(item);
            back = first;
        } else {
            back.next = new Node(item);
            back = back.next;
        }
    }

    public Node dequeue() {
        if(first != null) {
            Node dequeued = first;
            first = first.next;
            return dequeued;
        }
        return null;
    }
}
