import java.util.Scanner;

public class PalindromeNumber {
    public static boolean palindrome(int[] num, int index) {
        //write the logic here
        int length = num.length - 1;
        if(index == length)
            return num[length - index] == num[index];
        else
            return palindrome(num,index + 1 );
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i=0; i< 5;i++)
            num[i]=sc.nextInt();
        boolean answer = palindrome(num, 0);
        System.out.println(answer);
    }
}
