package term2.eksamensforberedelse.trees.binartreestuderende;

public class BinarySearchTreeInteger {

	public static void main(String[] args) {

		BinaryTree<Integer> leftRightLeft = new BinaryTree<>(25);
		BinaryTree<Integer> rightRightLeft = new BinaryTree<>(88);
		BinaryTree<Integer> leftLeftRight = new BinaryTree<>(15);

		BinaryTree<Integer> leftLeft = new BinaryTree<>(11, null, leftLeftRight);
		BinaryTree<Integer> rightRight = new BinaryTree<>(90, rightRightLeft, null);
		BinaryTree<Integer> leftRight = new BinaryTree<>(30, leftRightLeft, null);


		BinaryTree<Integer> right = new BinaryTree<>(77, null, rightRight);
		BinaryTree<Integer> left = new BinaryTree<>(22, leftLeft, leftRight);

		BinaryTree<Integer> rootTree = new BinaryTree<>(45, left, right);
		System.out.println("rootTree.size() = " + rootTree.size());
		System.out.println("rootTree.heightPreOrder() = " + rootTree.heightPreOrder());
		System.out.println("rootTree.heightInOrder() = " + rootTree.heightInOrder());
		System.out.println("rootTree.heightPostOrder() = " + rootTree.heightPostOrder());
		System.out.println("rootTree.sum() = " + rootTree.sum());
	}
}
