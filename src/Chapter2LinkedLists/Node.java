package Chapter2LinkedLists;

/**
 * LinkedList Implementation with Node Deletion
 * Created by admin on 2015-11-05.
 */
public class Node {

    public Node next = null;
    public int data;

    public Node(int data) {
        this.data = data;
    }

    public void appendNode(int data) {
        for(Node temp = this; temp != null; temp = temp.next) {
            if(temp.next == null) {
                temp.next = new Node(data);
                return;
            }
        }
    }

    public static Node deleteNode(Node head, int data) {
        if(head.data == data) {
            return head.next;
        }

        for(Node temp = head; temp != null; temp = temp.next) {
            if(temp.next.data == data) {
                temp.next = temp.next.next;
                return temp;
            }
        }

        return head;
    }

    public static void printList(Node head) {
        int counter = 1;
        for(Node temp = head; temp != null; temp = temp.next) {
            System.out.println("Node " + counter + " value is : " + temp.data);
            counter++;
        }

    }

    public static void main(String[] args) {
        Node list = new Node(1);
        list.appendNode(2);
        list.appendNode(3);
        list.appendNode(4);
        Node.printList(list);
        System.out.println("Delete Node 3");
        Node.deleteNode(list,3);
        Node.printList(list);
    }


}
