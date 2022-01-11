package homework;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {

//    1 Создать по 10 переменных, каждого типа данных. Переменна должна:
//    a Иметь название содержащее в себе минимум два слова
//    b Значение переменной должно быть таким-же логичным как и название
//    c Все переменные должны быть выведены на экран

//    Floating point

        float a, b, c;

        a = 3.123456789F;
        b = 350.0F;
        c = a + b;

        System.out.println("a = " + a);

        float d = 10.8632667283322234f;
        double y = 10.8632667283322234f;

        System.out.println("float value = " + d);
        System.out.println("float value = " + y);

        float num1 = 10.5f;
        float num2 = 20.5f;
        float sum = num1 + num2;
        double number = sum;
        System.out.println(number);

        double x = 10.5;
        double e = 20.5;
        double z = x + e;
        float result = (float) z;
        System.out.println(result);

        byte num3 = 127;
        byte num4 = -128;
        System.out.println("num3 : " + num1);
        System.out.println("num4 : " + num2);

        byte myNum = 100;
        System.out.println(myNum);

        int myNum1 = 100000;
        System.out.println(myNum1);

        long myNum2 = 15000000000L;
        System.out.println(myNum2);

        float myNum3 = 5.75f;
        System.out.println(myNum3);

        double myNum4 = 19.99d;
        System.out.println(myNum4);

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);


// 2 Вывести на экран минимальное и максимальное значение каждого типа данных.
//    a Пример: System.out.println(“Byte minimal value: ” + Byte.MIN_VALUE);

        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        int firstVariable = 200;
        int secondVariable = 400;

        System.out.println(Integer.max(firstVariable, secondVariable));
        System.out.println(Integer.compare(400, 400));

// 3 Для каждого арифметического оператора создать по два примера
//    a Например: int a = 10; int b = 20; int c = a + b;
//    i Примеры могут быть разные! (int r = 9 + 5);
//    b Распечатать результат на экране

        // Addition

        int a1 = 11;
        int b1 = 8;
        int c1 = a1 + b1;  // 19
        int d2 = 5 + b1;  // 13

        int q = 34;
        int w = 11;
        int e1 = q + w; // 45
        int t = 7 + 11; // 18

        // Subtraction

        int x1 = 12;
        int y1 = 6;
        int z1 = x1 - y1;  // 6
        int v = 7 - y1; // 1


        int r = 9;
        int f = 14;
        int m = r - f; // -5
        int g = 4 - 14; // -10

        // Multiplication *

        int u = 2;
        int i = 8;
        int o = u * i; // 16
        int s = 7 * i; // 56

        int h = 9;
        int j = 11;
        int k = h * j; // 99
        int l = 7 * 11; // 77


        // Division

        int vv = 10;
        int bb = 2;
        int nn = vv / bb; // 5
        int cc = 2 / bb; // 1

        int qq = 30;
        int ww = 2;
        int tt = qq / ww; // 2
        int mm = 50 / 2; // 25


// 4 Создать 5 переменных String и распечатать их значение на экран

        String[] animals = {"cat", "tiger", "dog", "snake", "cow", "tiger", "hamster", "lion", "camel", "sheep"};

        System.out.println(animals);
        System.out.println(Arrays.toString(animals));
        System.out.println(animals[5]);


// 5 Напишите одно предложение (по возможности длинное) о себе в виде комментария. Далее каждое слово присвойте к новой переменной и распечатайте предложение в одной строке.
//    a Пример: My name is Nikita.
//    b String firstPart = “My name is”;
//    c String name = “Nikita”;
//    d System.out.printlnt(firstPart + “ “ + name);
//    i Используйте так-же System.out.printf (формат)

        String name = "Diana";
        String lastName = "Matjuseva";
        int birthYear = 1989;
        //  int dateOfBirth = 090189;
        int yearsOld = 32;

        System.out.printf("My name is: " + name + " " + lastName + "." + " I am " + yearsOld + "." + " years old");

        String text = String.format("My name is: %s %s. I am %d years old", name, lastName, yearsOld);
        System.out.println(text);
        System.out.println(String.format("My name is: %s %s. I am %d years old", name, lastName, yearsOld));
        System.out.printf("My name is: %s %s. I am %d years old\n", name, lastName, yearsOld);

    }

}
