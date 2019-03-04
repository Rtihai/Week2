package Week2.IfStatements;

import java.util.Scanner;

public class ChooseYourOwnShortAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my small stupid game! Just select one of the ways...\n" +
                "Where you want to go: 'kitchen' or 'upstairs'? ");

        String R1 = "house";

        String R2 = "kitchen";
        String R3 = "upstairs";

        String R4 = "refrigerator";
        String R5 = "cabinet";
        String R6 = "bathroom";
        String R7 = "bedroom";

        String R8 = "Yes";
        String R9 = "No";
        String R10 = "Yes";
        String R11 = "No";
        String R12 = "Yes";
        String R13 = "No";
        String R14 = "Yes";
        String R15 = "No";

        String firstWay = input.nextLine();
        if (firstWay.equals(R2)) {
            System.out.println("You entered in the " + R2 + ".\n" + "Next you can open a 'refrigerator' or to go in 'cabinet', what you want to do?");

            String secondWay = input.nextLine();
            if (secondWay.equals(R4)) {
                System.out.println("You opened the " + R4 + ".\n" + "Next you can eat a banana, do you want to eat it 'Yes' or 'No'?");
            }
            if (secondWay.equals(R5)) {
                System.out.println("You went to the " + R5 + ".\n" + "Next you can take a pen, do you want to take it 'Yes' or 'No'?");
            }

            String lastWay = input.nextLine(); // print two times, why?
            if (lastWay.equals(R8)) {
                System.out.println("You ate the banana and now you are dead.\nGAME OVER! Thank you for playing.");
            } else {
                System.out.println("You Win!\nThank you for playing.");
            }
            if (lastWay.equals(R10)) {
                System.out.println("You take the pen and now you are dead.\nGAME OVER! Thank you for playing.");
            } else {
                System.out.println("You Win!\nThank you for playing.");
            }
        }

        if (firstWay.equals(R3)) {
            System.out.println("You entered in the " + R3 + ".\n" + "Next you can open a 'bathroom' or to go in 'bedroom', what you want to do?");

            String secondWay = input.nextLine();
            if (secondWay.equals(R6)) {
                System.out.println("You opened the " + R6 + ".\n" + "Next you can take a soup, do you want to take it 'Yes' or 'No'?");
            }
            if (secondWay.equals(R7)) {
                System.out.println("You went to the " + R7 + ".\n" + "You can take a mirror, do you want to take it 'Yes' or 'No'?");
            }

            String lastWay = input.nextLine(); // print two times, why?
            if (lastWay.equals(R12)) {
                System.out.println("You took the soup and now you are dead.\nGAME OVER! Thank you for playing.");
            } else {
                System.out.println("You Win!\nThank you for playing.");
            }
            if (lastWay.equals(R14)) {
                System.out.println("You take the mirror and now you are dead.\nGAME OVER! Thank you for playing.");
            } else {
                System.out.println("You Win!\nThank you for playing.");
            }
        }
    }
}
