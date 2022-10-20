import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Threelevel(5));
        System.out.println(Factorial(5));
        double variable = Calc();
        System.out.println(variable);
        System.out.println(Num1000(1000));


    }
    public static int Threelevel(int n){
        int num = 1;
        for(int i = 1; i <= n; i++){
            num += i;
        }
        return num;
    }
    public static int Factorial(int n){
        if (n <= 1) {
            return 1;
        }
        else {
            return n * Factorial(n - 1);
        }
    }
    public static double Calc() throws IOException {
        double result = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Введите через ентер число, потом оператор, потом число");
        Double first = s.nextDouble();

        String operator = s.next();

        Double second = s.nextDouble();

        switch (operator){
            case ("+"):
                    result = first + second;
                    break;
            case ("-"):
                result = first - second;
                break;
            case ("*"):
                result = first * second;
                break;
            case ("/"):
                if (second != 0) {
                    result = first / second;
                }
                else System.out.println("Делить на 0 нельзя!");
                break;

        }
        return result;
    };
     public static List<Integer> Num1000(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }



}
