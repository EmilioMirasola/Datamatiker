package term2.lesson27;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();

		binarySearchTree.add(45);

		binarySearchTree.add(22);
		binarySearchTree.add(11);
		binarySearchTree.add(15);
//		binarySearchTree.add(14);
//		binarySearchTree.add(16);

		binarySearchTree.add(30);
		binarySearchTree.add(25);

		binarySearchTree.add(77);
		binarySearchTree.add(90);
		binarySearchTree.add(88);

		binarySearchTree.print();

		System.out.println("Maks: " + binarySearchTree.findMax());
		System.out.println("Min: " + binarySearchTree.findMin());

		System.out.println("Removed smallest: : " + binarySearchTree.removeMin());
		binarySearchTree.print();

		System.out.println("Removed largest: " + binarySearchTree.removeMax());
		binarySearchTree.print();

	}
}
