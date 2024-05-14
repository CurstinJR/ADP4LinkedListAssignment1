package za.ac.cput.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Insert values into the BST
        int[] values = {10, 6, 3, 5, 2, 8, 4, 1, 8};
        for (int value : values) {
            bst.insert(value);
        }

        System.out.println("Is the tree empty? " + bst.isEmpty());

        // Preorder traversal
        System.out.print("Preorder traversal: ");
        bst.preorder();
        System.out.println();

        // Inorder traversal
        System.out.print("Inorder traversal: ");
        bst.inorder();
        System.out.println();

        // Postorder traversal
        System.out.print("Postorder traversal: ");
        bst.postorder();
        System.out.println();
    }
}

