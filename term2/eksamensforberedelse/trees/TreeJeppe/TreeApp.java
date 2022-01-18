package term2.eksamensforberedelse.trees.TreeJeppe;

public class TreeApp {
    public static void main(String[] args) {
        BinaryTree<Integer> femten = new BinaryTree<>(15, null, null);
        BinaryTree<Integer> elleve = new BinaryTree<>(11, null, femten);

        BinaryTree<Integer> femogtyve = new BinaryTree<>(25, null, null);
        BinaryTree<Integer> tredive = new BinaryTree<>(30, femogtyve, null);

        BinaryTree<Integer> toogtyve = new BinaryTree<>(22, elleve, tredive);

        BinaryTree<Integer> otteogfirs = new BinaryTree<>(88, null, null);
        BinaryTree<Integer> halvfems = new BinaryTree<>(90, otteogfirs, null);

        BinaryTree<Integer> syvoghalvfjerds = new BinaryTree<>(77, null, halvfems);

        BinaryTree<Integer> femogfyre = new BinaryTree<>(45, toogtyve, syvoghalvfjerds);

        System.out.println(femogfyre.size());

        System.out.println(femogfyre.højde());

        System.out.println("PREORDER");
        femogfyre.printPreOrder();
        System.out.println("INORDER");
        femogfyre.printInOrder();
        System.out.println("POSTORDER");
        femogfyre.printPostOrder();

        System.out.println(femogfyre.sum());
    }
}
