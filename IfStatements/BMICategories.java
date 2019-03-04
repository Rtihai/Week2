package Week2.IfStatements;

import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Your height: ");
        double yourHeight = keyboard.nextDouble();
        String category = "";

        System.out.print("Your weight: ");
        int weight = keyboard.nextInt();
        System.out.println();

        double bmi = (weight /(yourHeight*yourHeight)) * 703;
        double round = Math.round(bmi * 100.0) / 100.0;
        System.out.print("Your BMI: " + round + "\n");

        if(bmi <= 18.4){
            category = "Underweight";
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            category = "Normal weight";
        }
        else if(bmi>=25.0 && bmi<=29.9){
            category = "Overweight";
        }
        else if(bmi>=30){
            category = "Obese";
        }
        System.out.print("BMI: " + category);
    }
}
