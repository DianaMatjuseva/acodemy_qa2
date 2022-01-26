package classroom;

public class Homework_Arrays {

    public static void main(String[] args) {


        // 1 Если переменная типа int = 10, выведите на экран: “Integer value is 10”


//        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}};
//        int x = myNumbers[1][2];
//        System.out.println(x); // Outputs 10


// 2 В переменной типа int хранится любое число от 18 до 65. Скидку в химчистке можно получить группе лиц от 18-21 лет в размере 10 процентов. Группе лиц от 22 до 65 лет можно получить скидку в размере 15%. Группе лиц от 65 можно получить скидку в размере 20%. Написать программу необходимо таким образом, чтобы изменяя значения переменной, можно было бы попасть в определенную группу и получить сообщение на экран о том, в какой возрастной группе вы находитесь и на какую скидку можете расчитывать. (Текст придумать самим)

        int age = 18;
        if (age >= 18 && age <= 21) {
            System.out.println("You are from 18 to 21");
//        } else if () {

// 3 Создать массив String и добавить в него 10 наименований животных.

            String[] animals = {"tiger", "cat", "dog", "antelope", "whale", "snake", "bear", "crocodile", "wolf", "giraffe"};

//                animals.length = 10;
//                animals[0] = tiger
//                animals[1] = cat
//                animals[2] = dog
//                animals[3] = antelope
//                animals[4] = whale
//                animals[5] = snake
//                animals[6] = bear
//                animals[7] = crocodile
//                animals[8] = wolf
//                animals[9] = giraffe


                for (int i = 0; i < animals.length; i++) {
                    System.out.println(animals[i]);
                }

                for (String animal : animals) {
                    System.out.println(animal);
                }


// a Пройтись циклом по массиву, найти и распечатать любого животного.

                String[] animals1 = {"tiger", "cat", "dog", "antelope", "whale", "snake", "bear", "crocodile", "wolf", "giraffe"};
                int i = 0;
                i < (0 < 4) = true;
                System.out.println(animals[4]);
                // Outputs Whale


// 4 Создать массив с числами от 0 до 10 и распечатать только те четные числа.

                int[] numbers = new int[10];

                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = i;
                }

                for (int number : numbers) {
                    if (number % 2 == 0) {
                        System.out.println(number);

// 5 Предположим что мы хотим выбрать транспортное средство на котором сегодня поедем в офис. Транспортом может быть (машина, автобус, такси и т.д) Относительно значения, которое храниться в переменной используя оператор switch научить программу выводить на экран то, каким образом планируете добраться до работы.

                        String currentTransport = "taxi";

                        switch (currentTransport) {
                            case "bus":
                                System.out.println("I will ride bus");
                                break;
                            case "taxi":
                                System.out.println("I will ride a taxi");
                                break;
                            default:
                                System.out.println("??");
                        }


//    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//    cars[0]="Opel";
//    System.out.println(cars[0]);
//

//
//    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//    for (int i = 0; i < cars.length; i++) {
                        //       System.out.println(cars[i]);


// Now outputs Opel instead of Volvo

// 6 Распечатать на экране числа от 1 до 100.

                        // 1 2 3 4 5 6 7 8 9 10
                        // 3 6 9 12 15 18 21
                        // 10 20 30 40 ....

                        int number1 = 0;
                        for (int i = 0; i < 10; i++) {
                            number += 7;
                            System.out.println(number + " ");
                        }

//            int number = 100;
//
//            for (int i = number; i > number; i--) {
//                System.out.println(i);
//            }

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                int result = i * j;
//                System.out.println(result);
//            }
//        }
// 7 Распечатать на экране числа от 50 до 1.
// 8 Распечатайте на экране таблицу умножения (от 1 до 10)


                    }
                }
            }
        }
    }



