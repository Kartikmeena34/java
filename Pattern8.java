public class Pattern8{
    public static void main(String[] args){
        int size=5;
        printPlusPattern(size);
    }

    public static void printPlusPattern(int size){
        int mid=size/2;

        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if (i==mid||j==mid){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
