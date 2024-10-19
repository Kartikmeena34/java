public class Pattern7 {
    public static void main(String[] args) {
        int size=5;
        for(int i=size;i>0;i--){
            for (int j=0;j<i;j++) {
                System.out.print("* ");
            }System.out.println();
        }/* */
        for(int k=2;k<=size;k++){
            for (int l=0;l<k;l++) {
            System.out.print("* ");
            }System.out.println();
        }
    }
}
