public class Power{
    public static void main(String[] args){
        int n=15;
        System.out.println(PowerOfTwo(n));
    }
    public static boolean PowerOfTwo(int n){
        if (n == 1){
            return true;
        }
        if (n<=0||n%2!=0){
            return false;
        }
        return PowerOfTwo(n/2);
    }
}
