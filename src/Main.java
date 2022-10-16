import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Threelevel(5));
        System.out.println(Factorial(5));
        double variable = Calc();
        System.out.println(variable);


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



}