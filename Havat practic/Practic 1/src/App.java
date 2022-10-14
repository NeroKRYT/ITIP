public class App {

    public static void main(String[] args) throws Exception {
        // 1 Task
        System.out.println("Task 1");
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
        System.out.println();

        // 2 task
        System.out.println("Task 2");
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
        System.out.println();

        // 3 Task
        System.out.println("Task 3");
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));
        System.out.println();

        // Task 4
        System.out.println("Task 4");
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));
        System.out.println();

        // Task 5
        System.out.println("Task 5");
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
        System.out.println();

        // Task 6
        System.out.println("Task 6");
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));
        System.out.println();

        // Task 7
        System.out.println("Task 7");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
        System.out.println();

        // Task 8
        System.out.println("Task 8");
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
        System.out.println();

        // Task 9
        System.out.println("Task 9");
        System.out.println(sumOfCubes(new int[] { 1, 5, 9 }));
        System.out.println(sumOfCubes(new int[] { 3, 4, 5 }));
        System.out.println(sumOfCubes(new int[] { 2 }));
        System.out.println(sumOfCubes(new int[] {}));
        System.out.println();

        // Task 10
        System.out.println("Task 10");
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
        System.out.println();

    }

    // 1 Task
    public static int remainder(int F, int S) {
        return F % S;
    }

    // 2 task
    public static int triArea(int B, int H) {
        return (B * H) / 2;
    }

    // 3 task
    public static int animals(int chickens, int cows, int pigs) {
        return (chickens * 2) + (cows * 4) + (pigs * 4);
    }

    // 4 task
    public static boolean profitableGamble(double prob, double prize, double pay) {
        if (prob * prize > pay) {
            return true;
        } else {
            return false;
        }

    }

    // 5 Task
    public static String operation(int N, int a, int b) {

        if (a + b == N) {
            return "added";
        } else if (a - b == N) {
            return "subtracted";
        } else if (a * b == N) {
            return "multiply";
        } else if (a / b == 0) {
            return "division";
        } else {
            return "none";
        }

    }

    // Task 6
    public static int ctoa(char symbol) {
        int ascii = (symbol);
        return ascii;
    }

    // Task 7
    public static int addUpTo(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;

        }
        return sum;
    }

    // Task 8
    public static int nextEdge(int a, int b) {
        int c = a + b - 1;
        return c;
    }

    // Task 9
    public static int sumOfCubes(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * array[i] * array[i];
        }
        return sum;
    }

    // Task 10
    public static boolean abcmath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;

        }

        if (a % c == 0) {
            return true;
        } else {

            return false;
        }
    }

}
