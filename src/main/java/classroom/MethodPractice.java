package classroom;

public class MethodPractice {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        System.out.println(a + b);

        int c = 6;
        int d = 4;
        System.out.println(c + d);

        int calculationResult = sum(30, 40);
        System.out.println(calculationResult);

        voidSum(30, 40);

        // int calculationResult = sum(30, 40);
        //

        System.out.println(sum(4, 10));

        // inLine return firstNumber + secondNumber;
    }

    // public (инкапсуляция) static int sum() - метод без аргумента
    // public static int sum(int firstNumber)

    public static int sum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static void voidSum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println(sum);

    }
}
