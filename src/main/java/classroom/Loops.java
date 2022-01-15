package classroom;

public class Loops {

    public static void main(String[] args) {


        // Loops (for, while, do ... while)

        /*

        for (initialize counter; condition; counter change) {

        }

         */

        // i = 0;
        // 0 < 5 (true)
        // system.out.println("Hello World");

        // i = 1
        // 2 < 5 (true)
        // system.out.println("Hello World");

        // i = 5
        // 5 < 5 (false)
        // and of loop

        for (int i = 0; i < 5; i++) {
            System.out.println("This is: " + i + " iteration");
        }


        // for (int i = 5; i > 0; i--) {
        //    System.out.println("Hello World");

        for (int i = 0; i > 10; i++) {
            System.out.println("This is: " + i + " iteration");

        }

        String[] fruits = {"apple", "kiwi", "banana", "strawberry", "lemon"};
        // fruits.length = 5;
        // fruits[0] = apple
        // fruits[1] = kiwi
        // fruits[4] = lemon

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

       /*
       7, 14,21, 28, 35 .. * 10
       0, +7 +7 +7 +7
        */


        // i = 0;
        // i < (0 < 5) = true
        // System.out.println(fruits[i]);
        // fruits[0] = apple

        // i =1;
        // i < 5 (1 < 50) = true
        // System.out.println(fruits[i]);
        // fruits[1] = kiwi


        int number = 0;
        for (int i = 0; i < 10; i++) {
            number += 7;
            System.out.println(number + " ");
        }

        int evenNumbers = 0;

        for (int i = 0; i < 10; i++) {
            evenNumbers += 2;
            System.out.println(evenNumbers + " ");
        }

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }


//            int[] numbers = new int[10];
//
//            for (int i = 0; i < numbers.length; i++) {
//                numbers[i] = i;
//            }
//
//            for (int number : numbers) {
//                if(number % 2 == 0) {
//                System.out.println(number);
        }

        int x = 10;
        do {
            System.out.println("Hello World");
            x--;
        } while (x > 0);

        System.out.println("Diana");


        while (x > 0) {
            System.out.println("Hello World");
            x--;
        }

        System.out.println("\n");
        int a = 2;
        while (a <= 256) {
            System.out.println(a + " ");
            //a = a * 2; (тоже самое, что 124 строка, но укороченная версия)
            a *= 2;
            // 2 = 2 * 2
        }

    }
}
