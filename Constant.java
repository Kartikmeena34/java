import java.util.Arrays;
import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        int kConstant=6174;

        for (int i=1;i<=5;i++){
            int asc=sortDigits(number,true);
            int desc=sortDigits(number,false);
            number=desc-asc;

            System.out.println("Step " + i + ": " + desc + " - " + asc + " = " + number);

            if (number==kConstant){
                System.out.println("The number reached Kaprekar's constant: " + kConstant);
                break;
            }
        }
        if (number!=kConstant){
            System.out.println("The number did not reach Kaprekar's constant after 5 steps.");
        }
    }
 
    public static int sortDigits(int n, boolean ascending) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = n % 10;
            n /= 10;
        }

   // Sort digits using built-in sorting method
        Arrays.sort(digits);
        
        // If descending, reverse the sorted array
        if (!ascending){
            for (int i=0;i<digits.length/2;i++){
                int temp=digits[i];
                digits[i]=digits[digits.length-1-i];
                digits[digits.length-1-i]=temp;
            }
        }
        int sortedNumber=0;
        for(int i=0;i<4;i++){
            sortedNumber=sortedNumber*10+digits[i];
        }
        return sortedNumber;
    }
}