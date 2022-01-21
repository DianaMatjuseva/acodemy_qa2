package classroom;

import jdk.jshell.Snippet;

public class Polymorthism {

    public static void main(String[] args) {


        Human human = new Human();
        human.voice();
        System.out.println(human.days);

        Kid kid = new Kid();
        kid.voice();
        System.out.println(kid.days);
    }
}
