package homework;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {

//    1 Создать по 10 переменных, каждого типа данных. Переменна должна:
//    a Иметь название содержащее в себе минимум два слова
//    b Значение переменной должно быть таким-же логичным как и название
//    c Все переменные должны быть выведены на экран

//    sea level (Example of variable related to climate change)

      String climate1 = "Sea level";
      String climate2 = "related to climate change";
      System.out.println("Sea level related to climate change");


//    dissolved oxygen related to fish kill

        String oxygen1 = "dissolved oxygen";
        String oxygen2 = "related to fish kill";

        System.out.println("Dissolved oxygen related to fish kill");


//    water salinity related to fish kill

      String water1 = "water salinity";
      String water2 = "related to fish kill";

      System.out.println("Water salinity related to fish kill");

       // red fox

      String animal1 = "red";
      String animal2 = "fox";

      System.out.println("Red fox");


       // curly sheep

      String animalSheep1 = "curly";
      String animalSheep2 = "sheep";

      System.out.println("Curly sheep");

      // faithful dog man's friend

      String animalDog1 = "faithful dog";
      String animalDog2 = "men's friend";

      System.out.println("Faithful dog men's friend");

     // funny clown in the circus

      String actorClown = "Funny clown";
      String actorClown2 = "in the circus";

      System.out.println("Funny clown in the circus");

      // today is the sunny day

      String sunnyDay1 = "Today is";
      String sunnyDay2 = "the sunny day";

      System.out.println("Today is the sunny day");

      // blue color

       String color1 = "Blue";
       String color2 = "color";

      System.out.println("Blue color");

       // bad joke

       String joke1 = "Bad";
       String joke2 = "joke";

      System.out.println("Bad joke");




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

        int a = 11;
        int b = 8;
        int c = a + b;  // 19
        int d = 5 + b;  // 13

        int q = 34;
        int w = 11;
        int e = q + w; // 45
        int t = 7 + 11; // 18

        // Subtraction

        int x = 12;
        int y = 6;
        int z = x - y;  // 6
        int v = 7 - y; // 1


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
