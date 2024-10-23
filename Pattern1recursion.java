public class Pattern1recursion {
    public static void main(String[] args) {
        int size = 5;
        printPattern(size, 0);
    }

    public static void printPattern(int size, int row) {
        if (row == size) {
            return;
        }
        printRow(size);
        System.out.println();
        printPattern(size, row + 1);
    }

    public static void printRow(int size) {
        if (size == 0) {
            return;
        }
        System.out.print("* ");
        printRow(size - 1);
    }
}
