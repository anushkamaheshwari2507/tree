//main class is to give the data
package tree1;

public class Main {
    public static void main(String[] args) {
        Tree obj = new Tree();
        traverse t = new traverse();
        obj.insert(10);
        obj.insert(6);
        obj.insert(12);
        obj.insert(7);
        obj.insert(3);
        obj.insert(4);
        obj.insert(11);
        obj.insert(15);
        obj.insert(13);
        obj.insert(16);
        System.out.println("preorder of a tree using recursion");
        t.traversepreorder(obj.getroot());
        System.out.println();
        System.out.println("postorder of a tree using recursion");
        t.traversepostorder(obj.getroot());
        System.out.println();
        System.out.println("inorder of a a tree using recursion");
        t.traverseinorder(obj.getroot());
        System.out.println();
        System.out.println("preorder of a tree using loop");
        t.preordeerloop(obj.getroot());
        System.out.println();
        System.out.println("inorder of a tree using loop");
        t.inorderloop(obj.getroot());
        System.out.println();
        System.out.println("level wise traversiong using loop");
        t.levelorder(obj.getroot());
        System.out.println();
        System.out.println("Deleting the node with value --> 10 ");
        Node x = obj.delete(10);
        System.out.println("deleted element will be " + x.getData());
    }

}
