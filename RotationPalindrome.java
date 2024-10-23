import java.util.Scanner;

public class RotationPalindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        sc.close();

        int length=(int)Math.log10(n)+1;  // Calculate the length of the number
        boolean isPalindromeFound=false;

        for(int i=1;i<length;i++){
            n=rotateNumber(n);
            System.out.println("Rotation"+i+":"+n);
            if(isPalindrome(n)){
                System.out.println(n+" is a palindrome.");
                isPalindromeFound=true;
                break;
            }
        }
        if(!isPalindromeFound){
            System.out.println("The number did not become a palindrome after"+(length-1)+"rotations.");
        }
    }
    //Rotation function
    public static int rotateNumber(int n){
        int temp=n;
        int ln=0;
        int p;
        int a=1;
        int j;

        while (temp!=0){
            ln++;
            temp=temp/10;
        }
        int r=1;  // n-1 rotation 
        temp=0;
        for (int i=1;i<=r;i++){
            temp=temp*10;
            j=n%10;
            temp=temp+j;
            n=n/10;
        }
        p=ln-r;
        for (int i=1;i<=p;i++){
            a=a*10;
        }
        temp=temp*a;
        temp=temp+n;
        return temp;
    }

    // palindrome function
    public static boolean isPalindrome(int n){
        int reversed=0,original=n;
        while(n!=0){
            int digit=n%10;
            reversed=reversed*10+digit;
            n/=10;
        }
        return original==reversed;
    }
}
