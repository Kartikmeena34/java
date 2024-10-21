public class Pattern7{
    public static void main(String[] args){
        int size=5;
        printUpperPart(size);
        printLowerPart(size,1);
    }
    public static void printUpperPart(int n){
        if (n>0){
            printStars(n);
            System.out.println();
            printUpperPart(n-1);
        }
    }

    public static void printLowerPart(int size, int n){
        if (n<=size){
            printStars(n);
            System.out.println();
            printLowerPart(size,n+1);
        }
    }

    public static void printStars(int n){
        if (n>0){
            System.out.print("* ");
            printStars(n-1);
        }
    }
}
