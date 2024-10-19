public class Pattern8 {
    public static void main(String[] args) {
        int size=5;
        for(int i=0;i<=size;i++){
            for (int k= 3; k < i; k++) {
                System.out.println("*");
            }System.out.println();
        }
        for(int j=0;j<=size;j++){
            System.out.print("* ");
        }
        for(int i=0;i<=size;i++){
            System.out.println("*");
        }
        
    }   
}
