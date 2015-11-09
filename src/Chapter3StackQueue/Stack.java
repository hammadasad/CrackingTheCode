package Chapter3StackQueue;

/**
 * Stack class using linked lists
 * Created by admin on 2015-11-08.
 */
public class Stack {

    Node top;

    public void push(Object item) {
        if(top == null) {
            top = new Node(item);
        } else {
            Node newTop = new Node(item);
            newTop.next = top ;
            top = newTop;
        }
    }

    public Object pop() {
        if(top == null) {
            return null;
        } else {
            Object poppedData = top.item;
            top = top.next;
            return poppedData;
        }
    }

    public static void printStack(Node top) {
        Node focusNode = top;
        while(focusNode != null) {
            System.out.println(top.item);
            focusNode = focusNode.next;
        }
    }
}
