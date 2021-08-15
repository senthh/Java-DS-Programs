//import Node;
public class BinarySearchTree {
    Node root;
    public BinarySearchTree() {
        root = null;
    }

    public int minvalue(Node current) {
        int mindata = current.data;
        while(current.left != null) {
            mindata = current.left.data;
            current = current.left;
        }
        return mindata;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }
    private Node addRecursive(Node current, int value) {
        if(current == null) {
            current = new Node(value);
            return current;
        }
        if(value < current.data) {
            current.left =  addRecursive(current.left,value);
        }
        else if(value > current.data) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
    private Node deleteRecursive(Node current, int value) {
        if(current == null) {
            return null;
        }
        if(value < current.data) {
            current.left =  deleteRecursive(current.left,value);
        }
        else if(value > current.data) {
            current.right = deleteRecursive(current.right, value);
        }
        else {
            if(current.left == null) {
                return current.right;
            }
            else if(current.right == null) {
                return current.left;
            }
            else {
                current.data = minvalue(current.right);
                current.right = deleteRecursive(current.right, current.data);
            }

        }

        return current;
    }
    public boolean search(int value) {
        root = searchRecurcive(root, value);
        if (root != null) {
            return true;
        }
        return false;
    }
    private Node searchRecurcive(Node current, int value) {
        if((current == null) || (current.data == value)) {
            return current;
        }
        if(value < current.data) {
            return searchRecurcive(current.left, value);
        }
        return searchRecurcive(current.right, value);
    }
    void preOrder(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) {
        if(root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if(root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]) {
        //Node current;
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(45);
        bst.add(10);
        bst.add(7);
        bst.add(12);
        bst.add(90);
        bst.add(50);
        System.out.println("Pre Order Traversal :");
        bst.preOrder(bst.root);
        System.out.println("\nIn Order Traversal :");
        bst.inOrder(bst.root);
        System.out.println("\nPost Order Traversal :");
        bst.postOrder(bst.root);

        System.out.println();
        System.out.println(bst.search(45));
        System.out.println(bst.search(10));

        System.out.print("\n\nMin value : " + bst.minvalue(bst.root));

        System.out.println("\n\nDeletion of Nodes");
        bst.delete(45);
        System.out.println("\nIn Order Traversal :");
        bst.inOrder(bst.root);
        System.out.println();
        System.out.println(bst.search(45));
        System.out.println(bst.search(10));



    }
}
