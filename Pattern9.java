public class Pattern9{
    public static void main(String[] args){
        int size=5;
        printDiamondPattern(size);
    }
    public static void printDiamondPattern(int size){
        int n=size/2;
        for (int i=0;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print("  ");
            }
            for (int k=0;k<(2*i+1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

