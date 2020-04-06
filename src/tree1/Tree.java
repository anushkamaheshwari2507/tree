//inserting node in binary tree
package tree1;

public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    public void insert(int data) {
        Node newnode = new Node(data);
        if (root == null) {
            root = newnode;
        } else {
            Node parent = null;
            Node temp = root;
            while (temp != null) {
                parent = temp;
                if (temp.getData() >= newnode.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (parent.getData() >= newnode.getData()) {
                parent.setLeft(newnode);
            } else {
                parent.setRight(newnode);
            }
        }
    }

    //deleting a node from the tree which has three caeses
    public Node delete(int data) {
        Node temp = root;
        Node parent = null;
        Node response = null;

        //search for the node to be deleted
        while (temp != null && temp.getData() != data) {
            parent = temp;
            if (temp.getData() >= data)
                temp = temp.getLeft();
            else
                temp = temp.getRight();
        }


        if (temp != null) {
            response = temp;

            if (temp.getLeft() == null && temp.getRight() == null) { //if it is a leaf node or node with no child
                if (parent != null) {
                    if (parent.getData() > data)
                        parent.setLeft(null);
                    else
                        parent.setRight(null);
                } else root = null;
            } else if (temp.getLeft() != null && temp.getRight() == null) {  // if node has 1 child on left
                if (parent != null) {
                    if (parent.getData() > data)
                        parent.setLeft(temp.getLeft());
                    else
                        parent.setRight(temp.getLeft());
                } else root = root.getLeft();
            } else if (temp.getRight() != null && temp.getLeft() == null) { // if the node has 1 child on right
                if (parent != null) {
                    if (parent.getData() < data)
                        parent.setRight(temp.getRight());
                    else
                        parent.setLeft(temp.getRight());
                } else root = root.getRight();
            } else { // node has both the child. We can  either use inorder successor or inorder predecessor
                // this is by successor

                Node successor = getSuccessor(temp);
                successor.setLeft(temp.getLeft());
                successor.setRight(temp.getRight());
                if (parent != null) {
                    if (parent.getData() > data)
                        parent.setLeft(successor);
                    else
                        parent.setRight(successor);
                } else {
                    successor.setLeft(root.getLeft());
                    root = successor;
                }
            }
        }
        return response;
    }

    public Node getroot() {
        return this.root;
    }

    public Node getSuccessor(Node node) {
        Node successor = null;
        node = node.getRight();
        while (node != null) {
            successor = node;
            node = node.getLeft();
        }
        successor = delete(successor.getData());
        return successor;
    }
}
