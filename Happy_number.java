import java.util.Scanner;

public class Happy_number{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number=scanner.nextInt();
        scanner.close();
        int original=number;
        int limit=1000;
        boolean isHappy=false;
        while(limit>0){
            int sum=0;
            while(number>0){
                int digit=number%10;
                sum+=digit*digit;
                number/=10;
            }
            if(sum==1){
                isHappy=true;
                break;
            }
            else{
                number=sum;
            }
            limit--;
        }
        if(isHappy){
            System.out.println(original+"is a happy number.");
        } else{
            System.out.println(original+"is not a happy number.");
        }
    }
}
