public class Pattern5recursion {
    public static void main(String[] args) {
        int size = 4;
        printPattern(size, 0);
    }

    public static void printPattern(int size, int row) {
        if (row == size) {
            return;
        }
        printSpaces(row);
        printRow(size, 0);
        System.out.println();
        printPattern(size, row + 1);
    }

    public static void printSpaces(int count) {
        if (count == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(count - 1);
    }

    public static void printRow(int stars, int col) {
        if (col == stars) {
            return;
        }
        System.out.print("* ");
        printRow(stars, col + 1);
    }
}
