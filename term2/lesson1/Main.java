package term2.lesson1;

public class Main {
    public static void main(String[] args) {
//        int factorial = factorial(5);
//        System.out.println(factorial);
//        System.out.println(power2(2, 2));
//        System.out.println(productRus(19, 3));
//        System.out.println(product(19, 3));
        System.out.println(reverse("hej"));
//        System.out.println(euclid(54, 24));
    }

    public static int factorial(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int power(int n, int p) {
        if (n * p < 2) {
            return 1;
        } else {
            return power(n, p - 1) * n;
        }
    }

    public static int power2(int n, int p) {
        if (n * p < 2) {
            return 1;
        } else {
            if (p % 2 == 0) {
                return power2(n * n, p / 2);
            } else {
                return power2(n, p - 1) * n;
            }
        }
    }

    public static int product(int a, int b) {
        if (a * b == 0) {
            return 0;
        } else {
            return product(a - 1, b) + b;
        }
    }

    public static int productRus(int a, int b) {
        if (a * b == 0) {
            return 0;
        } else {
            if (a % 2 == 0) {
                return product(a / 2, b * 2);
            } else {
                return product(a - 1, b) + b;
            }
        }
    }

    public static String reverse(String s) {
        if (s.length() == 1) {
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }

    public static int euclid(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return euclid(b, a % b);
        }
    }
}
