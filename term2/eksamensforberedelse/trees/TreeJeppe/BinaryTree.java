package term2.eksamensforberedelse.trees.TreeJeppe;

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
	 * @param rootData
	 *            the data for the root
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
	 * @param rootData
	 *            the data for the root
	 * @param left
	 *            the left subtree
	 * @param right
	 *            the right subtree
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
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.right;
		return result;

	}

	/**
	 *
	 * @param rootData
	 *            the new data for the root
	 *
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		E data = root.data;
		root.data = rootData;
		return data;

	}

	/**
	 *
	 * @param n
	 * @return true in n has no children
	 */
	private boolean isLeaf(Node n) {
		if (n.left == null && n.right == null){
			return true;
		}else{
			return false;
		}
	}

	/**
	 *
	 * @param n
	 * @return true in n has at least one child
	 */
	private boolean isInternal(Node n) {
		if (n.right != null || n.left != null){
			return true;
		} else{
			return false;
		}
	}

	/**
	 *
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	private int size(Node n) {
		if (n == null){
			return 0;
		}
		int left = size(n.left);
		int right = size(n.right);

		return left + right + 1;

	}

	public int højde(){
		return højde(root);
	}

	private int højde(Node n) {
		if (n == null){
			return -1;
		}
		int left = højde(n.left);
		int right = højde(n.right);

		if (left > right){
			return 1 + left;
		}else{
			return 1 + right;
		}
	}

//	public Node preOrder(){
//		return preOrder(root);
//	}

	private void preOrder(Node node){
		if (node != null){
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public void printPreOrder(){
		preOrder(root);

	}

	private void inOrder(Node node){
		if (node != null){
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
	}

	public void printInOrder(){
		inOrder(root);
	}

	private void postOrder(Node node){
		if (node != null){
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data);
		}
	}

	public void printPostOrder(){
		postOrder(root);
	}

	public int sum(){
		return sum(root);
	}

	private int sum(Node n) {
		if (n == null){
			return 0;
		}
		int total = (int) n.data;
		int left = sum(n.left);
		int right = sum(n.right);

		return left + right + total;
	}

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
