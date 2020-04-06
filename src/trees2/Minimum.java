//class for finding the maximum and minimum element or to search an element from the binary tree
package trees2;

public class Minimum {
    Node root;

    public Minimum() {
        root = null;
    }

    public void insert(int data) {
        Node newnode = new Node(data);
        if (root == null) {
            root = newnode;
        }
        Node parent = null;
        Node temp = root;
        while (temp != null) {
            parent = temp;
            if (temp.getData() >= newnode.getData())
                temp = temp.getLeft();
            else temp = temp.getRight();
        }
        if (parent.getData() >= newnode.getData())
            parent.setLeft(newnode);
        else
            parent.setRight(newnode);
    }

    public void preorder(Node node) {
        if (node != null) {
            System.out.println(node.getData() + "--->");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public Node found(int data) {
        Node temp = root;
        if (temp == null) {
            return null;
        }
        if (temp.getData() == data) {
            return temp;
        }
        while (temp.getData() != data) {
            if (temp.getData() >= data)
                temp = temp.getLeft();
            else temp = temp.getRight();
        }
        return temp;
    }

    public Node minmumelement() {
        Node temp = root;
        if (temp == null) {
            return null;
        }
        while (temp != null) {
            temp = temp.getLeft();
        }
        return temp;
    }

    public Node maximimelement() {
        Node rem = root;
        if (rem == null) {
            return null;
        }
        while (rem != null) {
            rem = rem.getRight();
        }
        return rem;
    }

    public Node getroot() {
        return this.root;
    }
}



