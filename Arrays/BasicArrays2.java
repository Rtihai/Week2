package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args){
        Random newQ = new Random();
        int newZ[] = new int[10];
        for (int i = 0; i < newZ.length; i++){
            newZ[i] = 1 + newQ.nextInt(100);
            System.out.println("Slot " + i + " contains a " + newZ[i]);
        }
    }
}
