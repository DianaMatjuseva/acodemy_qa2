package homework;

public class AnimalExercises {

    public static void main(String[] args) {

        Animal cat = new Animal("Cat");
        Animal tiger = new Animal("Tiger");
        Animal snake = new Animal("Snake");
        Animal dog = new Animal("Dog");
        Animal hippo = new Animal("Hippo");
        Animal camel = new Animal("Camel");

        cat.status();
        cat.sleep();
        cat.sleep();
        cat.awake();
        cat.awake();
        cat.train();
        cat.walk();
        cat.play();
        cat.train();
        cat.train();
        cat.feed();
        cat.feed();
        cat.feed();
        cat.feed();
        cat.feed();
        cat.sleep();
        cat.feed();
        cat.sleep();
        cat.play();

        ObjectsHomework objHome = new ObjectsHomework();
        objHome.test("test");
    }

    void test(String test) {
        System.out.println("test");
    }

}


