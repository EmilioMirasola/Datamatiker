package term2.lesson26;

public class Opg2 {
	public static void main(String[] args) {
		BinaryTree<Integer> femten = new BinaryTree<>(15);
		BinaryTree<Integer> elleve = new BinaryTree<>(11, null, femten);

		BinaryTree<Integer> femogtyve = new BinaryTree<>(25);
		BinaryTree<Integer> tredive = new BinaryTree<>(30, femogtyve, null);

		BinaryTree<Integer> toogtyve = new BinaryTree<>(22, elleve, tredive);

		BinaryTree<Integer> otteogfirs = new BinaryTree<>(88);
		BinaryTree<Integer> halvfems = new BinaryTree<>(90, otteogfirs, null);

		BinaryTree<Integer> syvoghalvfjers = new BinaryTree<>(77, null, halvfems);

		BinaryTree<Integer> femogfyrre = new BinaryTree<>(45, toogtyve, syvoghalvfjers);

		System.out.println("Preorder");
		System.out.println("Height: " + femogfyrre.heightPreOrder());

		System.out.println("Inorder");
		System.out.println("Height: " + femogfyrre.heightInOrder());

		System.out.println("Potorder");
		System.out.println("Height: " + femogfyrre.heightPostOrder());

		System.out.println("Sum: " + femogfyrre.sum());

	}
}
