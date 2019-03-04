package Week2.IfStatements;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Julio Cesar Chavez Mark VII, please enter your current earth weight:");
        int weightEarth = input.nextInt();
        System.out.println("These planets are not yet conquered by you:\n" +
                "   1. Venus   2. Mars    3. Jupiter\n" +
                "   4. Saturn  5. Uranus  6. Neptune\n");
        System.out.println("What planet do you want to conquer this time?");
        int numberOfPlanet = input.nextInt();

        if (numberOfPlanet == 1 ) {
            System.out.println("You selected Venus planet.");
            double weightVenus = weightEarth * 0.78;
            System.out.println("Your weight would be " + weightVenus + " pounds on that planet.");
        }
        if (numberOfPlanet == 2 ) {
            System.out.println("You selected Mars planet.");
            double weightMars = weightEarth * 0.39;
            System.out.println("Your weight would be " + weightMars + " pounds on that planet.");
        }
        if (numberOfPlanet == 3 ) {
            System.out.println("You selected Jupiter planet.");
            double weightJupiter = weightEarth * 2.65;
            System.out.println("Your weight would be " + weightJupiter + " pounds on that planet.");
        }
        if (numberOfPlanet == 4 ) {
            System.out.println("You selected Saturn planet.");
            double weightSaturn = weightEarth * 1.17;
            System.out.println("Your weight would be " + weightSaturn + " pounds on that planet.");
        }
        if (numberOfPlanet == 5 ) {
            System.out.println("You selected Uranus planet.");
            double weightUranus = weightEarth * 1.05;
            System.out.println("Your weight would be " + weightUranus + " pounds on that planet.");
        }
        if (numberOfPlanet == 6 ) {
            System.out.println("You selected Neptune planet.");
            double weightNeptune = weightEarth * 1.23;
            System.out.println("Your weight would be " + weightNeptune + " pounds on that planet.");
        }
    }
}
