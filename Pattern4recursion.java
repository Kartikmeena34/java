public class Pattern4recursion {
    public static void main(String[] args) {
        int size = 5;
        printPattern(size, 0);
    }

    public static void printPattern(int size, int row) {
        if (size == row) {
            return;
        }
        printRow(size - row, 0);
        System.out.println();
        printPattern(size, row + 1);
    }

    public static void printRow(int stars, int col) {
        if (col == stars) {
            return;
        }
        System.out.print("*");
        printRow(stars, col + 1);
    }
}
