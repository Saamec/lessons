public class Main {
    public static void main(String[] args) {
        System.out.println(Threelevel(5));
        System.out.println(Factorial(5));


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
}