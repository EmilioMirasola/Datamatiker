package term2.eksamensforberedelse.binarySearchTree.oskar;

public class MainApp {
    public static void main(String[] args) {

        BinarySearchTree<Integer> t1 = new BinarySearchTree<Integer>();

        t1.add(45);
        t1.add(22);
        t1.add(11);
        t1.add(15);
        t1.add(30);
        t1.add(25);

        t1.add(77);
        t1.add(90);
        t1.add(88);

//        System.out.println(t1.findMax());
//        t1.print();
//        System.out.println(t1.findMinimum());
//
//        System.out.println(t1.removeMinimum());
//        t1.print();
//
//        System.out.println(t1.removeMinimum());
//        t1.print();
//        System.out.println(t1.removeMinimum());
//        t1.print();
//        System.out.println(t1.removeMinimum());
//        t1.print();

        System.out.println(t1.removeMax());
        t1.print();
        System.out.println(t1.removeMax());
        t1.print();
        System.out.println(t1.removeMax());
        t1.print();
        System.out.println(t1.removeMax());
        t1.print();
        System.out.println(t1.removeMax());
        t1.print();
        System.out.println(t1.removeMax());
        t1.print();
        System.out.println(t1.removeMax());
        t1.print();
        System.out.println(t1.removeMax());
        t1.print();
        System.out.println(t1.removeMax());
        t1.print();
    }
}
