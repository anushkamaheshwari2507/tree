package tree1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class traverse {
    //traversing with the help of recursion
    //preorder in which printing has the format first root node will print
    //then leftnodes will print then right nodes will print
    public void traversepreorder(Node node) {
        if (node != null) {
            System.out.print(node.getData() + " -----> ");
            traversepreorder(node.getLeft());
            traversepreorder(node.getRight());
        }
    }

    //in postorder first the left nodes will print then right nodes will print and then the
    //root node will print
    public void traversepostorder(Node node) {
        if (node != null) {
            traversepostorder(node.getLeft());
            traversepostorder(node.getRight());
            System.out.print(node.getData() + "-----> ");
        }
    }

    //taversing in preorder will first print the left nodes then it will print the root node
    //then it will print the right nodes
    public void traverseinorder(Node node) {
        if (node != null) {
            traverseinorder(node.getLeft());
            System.out.print(node.getData() + "----->  ");
            traverseinorder(node.getRight());
        }
    }

    //traversing the tree using loop in preorder
    public void preordeerloop(Node node) {
        if (node == null)
            System.out.println("Empty Tree");
        else {
            Stack<Node> s = new Stack<>();
            s.push(node);
            while (!s.empty()) {
                Node temp = s.pop();
                System.out.print(temp.getData() + " --> ");
                if (temp.getRight() != null)
                    s.push(temp.getRight());
                if (temp.getLeft() != null)
                    s.push(temp.getLeft());
            }
        }
    }

    //traversing the tree using inorder using loop
    public void inorderloop(Node node) {
        if (node == null)
            System.out.println("Empty Tree");
        else {
            Stack<Node> s = new Stack<Node>();
            Node currNode = node;
            boolean temp = false;
            while (!temp) {
                if (currNode != null) {
                    s.push(currNode);
                    currNode = currNode.getRight();
                } else {
                    if (s.empty())
                        temp = true;
                    else {
                        currNode = s.pop();
                        System.out.print(currNode.getData() + " --> ");
                        currNode = currNode.getRight();
                    }
                }
            }
        }
    }

    //level wse traversing of a tree using loop
    public void levelorder(Node node) { //
        if (node == null)
            System.out.println("Empty tree");
        else {
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            while (!q.isEmpty()) {
                Node cur = q.remove();
                System.out.print(cur.getData() + " --> ");
                if (cur.getLeft() != null)
                    q.add(cur.getLeft());
                if (cur.getRight() != null)
                    q.add(cur.getRight());
            }
        }
    }
}
