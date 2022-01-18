package term2.eksamensforberedelse.trees.binartreestuderende;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 *
	 * @param rootData the data for the root
	 */
	public BinaryTree(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 *
	 * @param rootData the data for the root
	 * @param left     the left subtree
	 * @param right    the right subtree
	 */
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 *
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 *
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 *
	 * @return the left child of the root
	 */
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 *
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {
		BinaryTree<E> result = new BinaryTree<>();
		result.root = root.right;
		return result;

	}

	/**
	 * @param rootData the new data for the root
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		E prevRoot = root.data;
		root.data = rootData;
		return prevRoot;
	}

	/**
	 * @param n
	 * @return true in n has no children
	 */
	private boolean isLeaf(Node n) {
		return n.left == null && n.right == null;
	}

	/**
	 * @param n
	 * @return true in n has at least one child
	 */
	private boolean isInternal(Node n) {
		return n.left != null || n.right != null;
	}

	/**
	 * @return the number of nodes in the tree
	 */
	public int size() {
		if (isEmpty()) {
			return 1;
		}
		return size(root);
	}

	private int size(Node n) {
		if (isLeaf(n)) {
			return 1;
		}

		int leftSize = n.left != null ? size(n.left) : 0;
		int rightSize = n.right != null ? size(n.right) : 0;

		return leftSize + rightSize + 1;
	}


	public int heightPreOrder() {
		return heightPreOrder(root);
	}

	private int heightPreOrder(Node n) {
		System.out.println(n.data);
		if (isLeaf(n)) {
			return 0;
		} else {
			int leftHeight = n.left != null ? heightPreOrder(n.left) : 0;
			int rightHeight = n.right != null ? heightPreOrder(n.right) : 0;

			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}

	public int heightInOrder() {
		return heightInOrder(root);
	}

	private int heightInOrder(Node n) {
		if (isLeaf(n)) {
			System.out.println(n.data);
			return 0;
		} else {
			int leftHeight = n.left != null ? heightInOrder(n.left) : 0;
			System.out.println(n.data);
			int rightHeight = n.right != null ? heightInOrder(n.right) : 0;

			return Math.max(leftHeight, rightHeight) + 1;
		}
	}

	public int heightPostOrder() {
		return heightPostOrder(root);
	}

	private int heightPostOrder(Node n) {
		if (isLeaf(n)) {
			System.out.println(n.data);
			return 0;
		} else {
			int leftHeight = n.left != null ? heightPostOrder(n.left) : 0;
			int rightHeight = n.right != null ? heightPostOrder(n.right) : 0;
			System.out.println(n.data);

			return Math.max(leftHeight, rightHeight) + 1;
		}
	}


	public int sum() {
		return sum(root);
	}

	private int sum(Node n) {
		if (isLeaf(n)) {
			return (int) n.data;
		} else {
			int leftHeight = n.left != null ? sum(n.left) : 0;
			int rightHeight = n.right != null ? sum(n.right) : 0;

			return leftHeight + rightHeight + (int) n.data;
		}
	}
}
