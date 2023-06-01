package lesson4;

public class Main {
    public static void main(String[] args) {
        RBTrees node = new RBTrees();

        node.insert(20);
        node.inorder();
        System.out.println("\n");
        node.insert(40);
        node.inorder();
        System.out.println("\n");
        node.insert(50);
        node.inorder();
        System.out.println("\n");
        node.insert(-44);
        node.inorder();
        System.out.println("\n");
        node.insert(-66);
        node.inorder();
        System.out.println("\n");
        node.insert(-22);
        node.inorder();
        System.out.println("\n");
        node.insert(-21);
        node.inorder();
        System.out.println("\n");
        node.insert(-2005);
        node.inorder();
    }
}