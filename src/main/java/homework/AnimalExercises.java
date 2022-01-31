package homework;

public class AnimalExercises {

    public static void main(String[] args) {
        Animal kitty = new Animal("Kitty");

        kitty.walk();
        kitty.training();
        kitty.play();
        kitty.getAnimalWeight();
        System.out.println("Animal weight" + kitty.getAnimalWeight() + "kg");
    }

}


