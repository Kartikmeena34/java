public class Fact {
    public static void main(String[] args) {
        int a= facto(4);
        System.out.println(a);
    }
    public static int facto(int n){
        if(n<1){
            return 1;
        }else{
            return n*facto(n-1);
        }
    }
}
