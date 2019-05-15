public class BinaryTree {

    Node root;
    Values val = new Values();

    void findMinMax(Node node, Values minv, Values maxv, int hd) {


        if (node == null)
            return;
        if (hd < minv.min)
            minv.min = hd;
        else if (hd > maxv.max)
            maxv.max = hd;

        findMinMax(node.left, minv, maxv, hd - 1);
        findMinMax(node.right, minv, maxv, hd + 1);



    }

    void printVerticalLine(Node node, int line_no, int hd) {
        if (node == null)
            return;

        if (hd == line_no)
            System.out.print(node.data + " ");

        printVerticalLine(node.left, line_no, hd - 1);
        printVerticalLine(node.right, line_no, hd + 1);
    }

    void verticalOrder(Node node) {
        findMinMax(node, val, val,0);

        for (int line_no = val.min; line_no <= val.max; line_no++) {
            printVerticalLine(node, line_no, 0);
            System.out.println("");
        }


    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.right.right = new Node(9);

        System.out.println("Vertical order traversal is: ");
        tree.verticalOrder(tree.root);

    }
}
