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

    //Problem 2.1
    //Write code to remove duplicates from an unsorted linked list. No Buffer
    public static void removeDuplicates(Node head) {
        for(Node current = head; current != null; current = current.next) {
            for(Node compared = current; compared != null; compared = compared.next) {
                if(compared.next != null) {
                    if(current.data == compared.next.data) {
                        compared.next = compared.next.next;
                    }
                }
            }
        }
    }

    //Problem 2.2
    //Implement an algorithm to find the nth to last element of a singly linked list.
    public static Node linkedListSubstring(Node head, int num) {
        if(num == 1) {
            return head;
        }
        int counter = 2;
        for(Node current = head.next; current != null; current = current.next) {
            if(counter == num) {
                return current;
            }
            counter++;
        }
        return null;
    }

    //Problem 2.3
    //Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
    //EXAMPLE
    //Input: the node ‘c’ from the linked list a->b->c->d->e
    //Result: nothing is returned, but the new linked list looks like a->b->d->e
    public static void removeMiddleNode(Node notHead) {
        Node current = notHead;
        while(current != null) {
            if(current.next != null) {
                current.data = current.next.data;
            }
            if(current.next.next == null) {
                current.next = null;
            }
            current = current.next;
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
        System.out.println("Adding a duplicate, which are 1,2,3");
        list.appendNode(1);
        list.appendNode(2);
        list.appendNode(3);
        Node.printList(list);
        System.out.println("Removing duplicates");
        Node.removeDuplicates(list);
        Node.printList(list);
        System.out.println("Linked List Substring starting 3rd element");
        Node list2 = Node.linkedListSubstring(list, 3);
        Node.printList(list2);
        System.out.println("Linked List Substring starting 2nd element");
        Node list3 = Node.linkedListSubstring(list, 2);
        Node.printList(list3);
    }


}
