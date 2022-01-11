package classroom;

import java.util.Arrays;

public class PrimitiveTypes {
   public static void main(String[] args) {

//    Floating point example (пример с плавающей точкой)

      float floatExample = 99999.9999f;
      System.out.println(floatExample);
      System.out.println(99999.9999f);

      double doubleExample = 2000000.9876D;
      System.out.println(doubleExample);
      System.out.println(2000000.9876D);

//    Integral example

     // Byte
     byte handCount = 2;
     System.out.println(handCount);
     System.out.println(Byte.MIN_VALUE);
     System.out.println(Byte.MAX_VALUE);

     // Short
     short distanceBetweenKievAndRiga = 1011;
     System.out.println(distanceBetweenKievAndRiga);

     // Integer
     int populationOfLatvia = 1900000;
     System.out.println(populationOfLatvia);

     // Long
     long currentWorldPopulation = 7900000000L;
     System.out.println(currentWorldPopulation);

     // Char
     char ch = '\u03A9';
     char pUnicode = '\u0070';
     char[] arrayOfOfChars = {'a', 'b', 'c', 'd'};
     System.out.println(ch);
     System.out.println(pUnicode);

     int[] arrayOfPeopleAges = {21, 22, 23, 24};
     System.out.println(Arrays.toString(arrayOfPeopleAges));

     // String variables

      String myName = "Diana";
      System.out.println(myName);

      String loremIpsum = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
      System.out.println(loremIpsum);

      String mySurname = "Matjuseva";

 //     String myNameAndSurname = myName + mySurname;
 //     String myNameAndSurname = myName + " " + mySurname;
 //     System.out.println(myNameAndSurname);

      System.out.printf("My name is %s. My surname is %s.\n", myName, mySurname);
      System.out.println("My name is " + mySurname + "." + " " + "My surname is " + mySurname + ".");

      // Operators

    int sumOfTwoNumbers = 10 + 30;
      System.out.println(sumOfTwoNumbers);
      System.out.println(5 + 10);
      System.out.println("5 + 10");

      int a = 30;
      int b = 5;
      System.out.println(a / b);
      System.out.println(a - b);
      System.out.println(a + b);
      System.out.println(a * b);

      System.out.println(9 % 4); // остаток от деления, то есть 1
      // 4 4 = 8
      // Result: 1

      float doubleDivision = 100 / 13F;
      System.out.println(doubleDivision);


   /*
   dhfhhgjgg
   vffddd
   fffggg
   fff
    */



   }
}
