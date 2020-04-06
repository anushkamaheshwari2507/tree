//main class
package trees2;

public class Main {
    public static void main(String[] args) {
        Minimum obj2 = new Minimum();
        obj2.insert(10);
        obj2.insert(6);
        obj2.insert(3);
        obj2.insert(4);
        obj2.insert(2);
        obj2.insert(12);
        obj2.insert(13);
        obj2.insert(15);
        System.out.println("preorder traversal of a binary tree");
        obj2.preorder(obj2.getroot());
        System.out.println();
        System.out.println("item is found or not?");
        Node x = obj2.found(10);
        System.out.println(x);
        System.out.println("minimumelement of the binary tree is");
        Node y = obj2.minmumelement();
        System.out.println(y);
        System.out.println("maximim element of the binary tree is");
        Node z = obj2.maximimelement();
        System.out.println(z);
    }
}
