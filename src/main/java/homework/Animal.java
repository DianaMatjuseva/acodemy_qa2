package homework;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Animal {

    private String animalName;
    private int animalWeight = 12;
    private String animalFood = "fish";
    private int pawsCount = 4;
    private int eyesCount = 2;
    private int hoursSleepsPerDay = 7;
    private int animalEnergy = 6;
    private boolean isSleeping = false;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int eyesCount, int animalWeight, String animalFood, int pawsCount, int hoursSleepsPerDay, int animalEnergy) {

        this.eyesCount = eyesCount;
        this.animalWeight = animalWeight;
        this.animalFood = animalFood;
        this.pawsCount = pawsCount;
        this.hoursSleepsPerDay = hoursSleepsPerDay;
        this.animalEnergy = animalEnergy;

    }

    public int getAnimalWeight() {
        return animalWeight;
    }

    public void walk() {
        if (animalEnergy == 0) {
            System.out.println("Animal can't do any exercise! You need to feed it.");
        } else {
            animalEnergy--;
            System.out.println("That was a good walk!");
        }
    }

    public void play() {
        if (animalEnergy == 0) {
            System.out.println("Animal can't do any exercise! You need to feed it.");
        } else {
            animalEnergy--;
            System.out.println("I like playing with You!");
        }
    }

    public void training() {
        if (animalEnergy == 0) {
            System.out.println("Animal can't do any exercise! You need to feed it.");
        } else {
            animalEnergy--;
            System.out.println("Trainings are good effect on me!");
        }
    }

    public void feed() {
        if (animalEnergy == 6) {
            System.out.println("Animal full of energy.");
        } else {
            animalEnergy = 6;
            System.out.println("Yammy, yammy! Thanks for feeding me!");
        }
    }

}

