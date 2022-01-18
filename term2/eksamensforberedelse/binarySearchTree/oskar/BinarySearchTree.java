package term2.eksamensforberedelse.binarySearchTree.oskar;

/**
 * This class implements a binary search tree whose nodes hold objects that
 * implement the Comparable interface.
 */
public class BinarySearchTree<E extends Comparable<E>> {
    private Node root;

    /**
     * Constructs an empty tree.
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Inserts a new node into the tree.
     *
     * @param obj the object to insert
     */
    public void add(E obj) {
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;
        if (root == null) {
            root = newNode;
        } else {
            root.addNode(newNode);
        }
    }

    /**
     * Tries to find an object in the tree.
     *
     * @param obj the object to find
     * @return true if the object is contained in the tree
     */
    public boolean find(E obj) {
        Node current = root;
        boolean found = false;
        while (!found && current != null) {
            int d = current.data.compareTo(obj);
            if (d == 0) {
                found = true;
            } else if (d > 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return found;
    }

    /**
     * Tries to remove an object from the tree. Does nothing if the object is
     * not contained in the tree.
     *
     * @param obj the object to remove
     */
    public void remove(E obj) {
        // Find node to be removed

        Node toBeRemoved = root;
        Node parent = null;
        boolean found = false;
        while (!found && toBeRemoved != null) {
            int d = toBeRemoved.data.compareTo(obj);
            if (d == 0) {
                found = true;
            } else {
                parent = toBeRemoved;
                if (d > 0) {
                    toBeRemoved = toBeRemoved.left;
                } else {
                    toBeRemoved = toBeRemoved.right;
                }
            }
        }

        if (found) {

            // toBeRemoved contains obj

            // If one of the children is empty, use the other

            if (toBeRemoved.left == null || toBeRemoved.right == null) {
                Node newChild;
                if (toBeRemoved.left == null) {
                    newChild = toBeRemoved.right;
                } else {
                    newChild = toBeRemoved.left;
                }

                if (parent == null) // Found in root
                {
                    root = newChild;
                } else if (parent.left == toBeRemoved) {
                    parent.left = newChild;
                } else {
                    parent.right = newChild;
                }

            } else {

                // Neither subtree is empty

                // Find smallest element of the right subtree

                Node smallestParent = toBeRemoved;
                Node smallest = toBeRemoved.right;
                while (smallest.left != null) {
                    smallestParent = smallest;
                    smallest = smallest.left;
                }

                // smallest contains smallest child in right subtree

                // Move contents, unlink child

                toBeRemoved.data = smallest.data;
                if (smallestParent == toBeRemoved) {
                    smallestParent.right = smallest.right;
                } else {
                    smallestParent.left = smallest.right;
                }
            }
        }
    }

    /**
     * Prints the contents of the tree in sorted order.
     */
    public void print() {
        print(root);
        System.out.println();
    }

    /**
     * Prints a node and all of its descendants in sorted order.
     *
     * @param parent the root of the subtree to print
     */
    private void print(Node parent) {
        if (parent != null) {
            print(parent.left);
            System.out.print(parent.data + " ");
            print(parent.right);
        }
    }

    /**
     * A node of a tree stores a data item and references to the left and right
     * child nodes.
     */
    private class Node {
        private E data;
        private Node left;
        private Node right;

        /**
         * Inserts a new node as a descendant of this node.
         *
         * @param newNode the node to insert
         */
        private void addNode(Node newNode) {
            int comp = newNode.data.compareTo(data);
            if (comp < 0) {
                if (left == null) {
                    left = newNode;
                } else {
                    left.addNode(newNode);
                }
            } else if (comp > 0) {
                if (right == null) {
                    right = newNode;
                } else {
                    right.addNode(newNode);
                }
            }
        }
    }

    public E findMax() {
        return findMax(this.root);
    }

    public E findMax(Node n) {
        if (n.right == null) {
            return n.data;
        }
        return findMax(n.right);
    }

    public E findMinimum() {
        return findMinimum(this.root);
    }

    public E findMinimum(Node n) {
        if (n.left == null) {
            return n.data;
        }
        return findMinimum(n.left);
    }

    public E removeMinimum() {

        //Hvis root er det mindste i træet
        if (this.root.left == null) {
            E data = this.root.data;
            if (this.root.right == null) {
                this.root = null;
            } else {
                this.root = root.right;
            }
            return data;
        }

        //Start på rekursivt kald
        return removeMinimum(this.root);
    }

    public E removeMinimum(Node n) {
        if (n.left.left == null) {
            Node rootToRemove = n.left;

            //Skåret ud i pap
//            if (rootToRemove.right != null) {
//                n.left = rootToRemove.right;
//            } else if (rootToRemove.right == null) {
//                n.left = null;
//            }

            //Forkortet
            n.left = rootToRemove.right;

            return rootToRemove.data;
        }

        return removeMinimum(n.left);
    }

    public E removeMax() {

        //Hvis root er det største i træet
        if (this.root.right == null) {
            E data = this.root.data;
            if (this.root.left == null) {
                this.root = null;
            } else {
                this.root = root.left;
            }
            return data;
        }

        //Start på rekursivt kald
        return removeMax(this.root);
    }

    public E removeMax(Node n) {
        if (n.right.right == null) {
            Node rootToRemove = n.right;

            //Skåret ud i pap
//            if (rootToRemove.left != null) {
//                n.right = rootToRemove.left;
//            } else if (rootToRemove.right == null) {
//                n.right = null;
//            }

            //Forkortet
            n.right = rootToRemove.left;

            return rootToRemove.data;
        }

        return removeMax(n.right);
    }

}
