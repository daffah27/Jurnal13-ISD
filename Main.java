public class Main {

    public static void main(String[] args) {
        Tree<String> tree = new Tree<>();

        tree.insertNode("F");
        tree.insertNode("E");
        tree.insertNode("H");
        tree.insertNode("D");
        tree.insertNode("G");
        tree.insertNode("C");
        tree.insertNode("B");
        tree.insertNode("H");
        tree.insertNode("K");
        tree.insertNode("J");

        System.out.println("Preorder traversal");
        tree.preorderTraversal();
        System.out.println();

        System.out.println("Inorder traversal");
        tree.inorderTraversal();
        System.out.println();

        System.out.println("Postorder traversal");
        tree.postorderTraversal();
        System.out.println();
        System.out.println();

        System.out.println("Searching for K");
        tree.searchBST("K");
        System.out.println("Searching for A");
        tree.searchBST("A");
    }
}