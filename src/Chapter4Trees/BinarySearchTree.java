package Chapter4Trees;

/**
 * Binary Search Tree Class
 * Created by admin on 2015-11-07.
 */
public class BinarySearchTree {
    public Node root;

    public void insertNode(int data) {
        if(root == null) {
            root = new Node(data);
            return;
        }

        Node parent;
        Node focusNode = root;
        while(true) {
            parent = focusNode;
            if(data < parent.data) {
                focusNode = parent.leftChild;
                if(focusNode == null) {
                    parent.leftChild = new Node(data);
                    return;
                }
            } else {
                focusNode = parent.rightChild;
                if(focusNode == null) {
                    parent.rightChild = new Node(data);
                    return;
                }
            }
        }

    }

    public static Node search(Node root, int data) {
        Node focusNode = root;
        while(focusNode.data != data) {
            if(data < focusNode.data) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
        }
        if(focusNode == null) {
            return null;
        } else {
            return focusNode;
        }
    }

    public static void inOrderTraversal(Node focusNode) {
        if(focusNode != null) {
            inOrderTraversal(focusNode.leftChild);
            System.out.println(focusNode.data);
            inOrderTraversal(focusNode.rightChild);
        }
    }

    public static void preOrderTraversal(Node focusNode) {
        if(focusNode != null) {
            System.out.println(focusNode.data);
            preOrderTraversal(focusNode.leftChild);
            preOrderTraversal(focusNode.rightChild);
        }
    }

    public static void postOrderTraversal(Node focusNode) {
        if(focusNode != null) {
            postOrderTraversal(focusNode.leftChild);
            postOrderTraversal(focusNode.rightChild);
            System.out.println(focusNode.data);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertNode(1);
        tree.insertNode(2);
        tree.insertNode(3);
        tree.insertNode(4);
        tree.insertNode(8);
        tree.insertNode(55);
        tree.insertNode(5);

        System.out.println("In Order Traversal: ");
        BinarySearchTree.inOrderTraversal(tree.root);
        System.out.println("Pre Order Traversal: ");
        BinarySearchTree.preOrderTraversal(tree.root);
        System.out.println("Post Order Traversal: ");
        BinarySearchTree.postOrderTraversal(tree.root);
        System.out.println("Search for the Node containing 55");
        Node searched = BinarySearchTree.search(tree.root, 55);
        System.out.println("Value received from matching Node is: " + searched.data);
    }
}
