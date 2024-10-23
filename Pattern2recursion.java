public class Pattern2recursion {
        public static void main(String[] args) {
            int size = 5;
            printPattern(size, 0);
        }
    
        public static void printPattern(int size, int row) {
            if (row == size) {
                return;
            }
            printRow(size, row, 0);
            System.out.println();
            printPattern(size, row + 1);
        }
    
        public static void printRow(int size, int row, int col) {
            if (col == size) {
                return;
            }
            if (row == 0 || row == size - 1 || col == 0 || col == size - 1) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
            printRow(size, row, col + 1);
        }
    }
    

