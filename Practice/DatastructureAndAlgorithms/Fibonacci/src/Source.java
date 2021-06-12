import java.util.Scanner;

public class Source {

    public static int fibonacci(int n){
        if(n < 2)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int fibonacciImproved(int n){

        int a = 0, b = 1,c = 0;
        for(int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
        return c;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fibonacci number to be generated ");
        int number = sc.nextInt();
        System.out.println("Fibonacci number generated is: " + fibonacciImproved(number));
    }
}
