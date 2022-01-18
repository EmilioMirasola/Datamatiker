package term2.eksamensforberedelse.binarySearchTree;

public class BinarySearchTreeTester {
	public static void main(String[] args) {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
		binarySearchTree.add(45);
		binarySearchTree.add(22);
		binarySearchTree.add(11);
		binarySearchTree.add(15);
		binarySearchTree.add(30);
		binarySearchTree.add(25);
		binarySearchTree.add(77);
		binarySearchTree.add(90);
		binarySearchTree.add(88);

		System.out.println("binarySearchTree.findMax() = " + binarySearchTree.findMax());
		System.out.println("binarySearchTree.findMin() = " + binarySearchTree.findMin());
		binarySearchTree.print();

		Integer minRemoved = binarySearchTree.removeMin();
		System.out.println("minRemoved = " + minRemoved);
		System.out.println("binarySearchTree.findMin() = " + binarySearchTree.findMin());

		Integer maxRemoved = binarySearchTree.removeMax();
		System.out.println("maxRemoved = " + maxRemoved);
		System.out.println("binarySearchTree.findMax() = " + binarySearchTree.findMax());
		System.out.println("binarySearchTree.findMin() = " + binarySearchTree.findMin());
		binarySearchTree.print();
	}
}
