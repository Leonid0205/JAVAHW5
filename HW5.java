import java.util.ArrayList;
/**
Сформировать и сделать обход дерева
 */
public class HW5 {

    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n11 = new Node(11);
        Node n20 = new Node(20);

        ArrayList<Node> ArrayRoot = new ArrayList<Node>();
        ArrayRoot.add(n2);
        ArrayRoot.add(n3);
        root.descendant = ArrayRoot;

        ArrayList<Node> ArrayN2 = new ArrayList<>();
        ArrayN2.add(n4);
        n2.descendant = ArrayN2;

        ArrayList<Node> ArrayN3 = new ArrayList<>();
        ArrayN3.add(n5);
        ArrayN3.add(n6);
        n3.descendant = ArrayN3;

        ArrayList<Node> ArrayN4 = new ArrayList<>();
        ArrayN4.add(n7);
        ArrayN4.add(n8);
        ArrayN4.add(n9);
        n4.descendant = ArrayN4;

        ArrayList<Node> ArrayN6 = new ArrayList<>();
        ArrayN6.add(n11);
        ArrayN6.add(n20);
        n6.descendant = ArrayN6;

        preOrder(root, "");
    }
    static void preOrder(Node tree, String space){
        if (tree != null){
            System.out.println(space + tree.value);
        }
        else {
            System.out.println(space + "null");
            return;
        }
        for (int i = 0; i < tree.descendant.size(); i++) {
            preOrder(tree.descendant.get(i), space + " ");
        }
        }
}
class Node {
    public Node(int value){
        this.value = value;
    }
    int value;
    ArrayList<Node> descendant = new ArrayList<>();
}