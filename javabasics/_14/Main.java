package javabasics._14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1a: Use a FOR EACH loop to the total sum all the elements of the ArrayList itemsA
     * 1b: Use a FOR EACH loop to the total sum all the elements of the int array itemsB
     * 1c: Use a FOR I loop to the total sum all the elements of the int ArrayList itemsA
     * <p>
     * Print your results
     * <p>
     * Notice how we can use the same exact code for arrays and ArrayLists
     */
    private static void exercise1() {
        System.out.println("Exercise 1a:");
        List<Integer> itemsA = Arrays.asList(1, 56, 23);

        int sumForA = 0;

        // Write your code for 1a here
        for (Integer item : itemsA) {
            sumForA = sumForA + item;
        }
        System.out.println(sumForA);


        System.out.println("\nExercise 1b:");
        int[] itemsB = new int[]{1, 56, 23};

        int sumForB = 0;

        // Write your code for 1b here


        for (Integer item : itemsB) {
            sumForB = sumForB +item;
        }
        System.out.println(sumForB);


        System.out.println("\nExercise 1c:");

        int sumForC = 0;

        // Write your code for 1c here, refer back to the lesson to check the fori syntax

        for (int i = 0; i < itemsA.size() ; i++) {
            sumForC = sumForC + itemsA.get(i);
        }

        System.out.println(sumForC);

        if (sumForA != sumForB || sumForB != sumForC) {
            System.out.println("Failed, sums are different!");
        } else {
            System.out.println("Success, sums are the same!");
        }
    }

    /**
     * 2: Find the smallest and largest items in the arraylist
     * using a for each loop and an if statement/Math.min
     */
    private static void exercise2() {
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;

        // Write code here
        for (Integer item : items){
            minNumber = Math.min(minNumber, item);
            maxNumber = Math.max(maxNumber, item);
        }

        System.out.println(maxNumber);
        System.out.println(minNumber);
    }

    /**
     * 3: Edit the fori loop below so it only prints the first 2 names.
     */
    private static void exercise3() {
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        for (
                int index = 0;
                index < 2; // <---- Edit this line
                index = index + 1
        ) {
            System.out.println(names.get(index));
        }
    }

    /**
     * 4: Edit the fori loop below so it prints the 8 multiplication table
     * <p>
     * Bonus, how could we use a single variable to change our times table?
     * <p>
     * Multiplication tables, in case my vocabulary is different:
     * <a href="https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg">
     *      https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg
     * </a>
     */
    private static void exercise4() {
        int currentMult = 8;

        for (
                int timesTableCurrentValue = currentMult; // <---- Edit this line
                timesTableCurrentValue <= (currentMult*10); // <---- Edit this line
                timesTableCurrentValue = timesTableCurrentValue + currentMult // <---- Edit this line
        ) {
            System.out.println(timesTableCurrentValue);
        }
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------<br/>
     * Inside of the fori loop below, write another fori loop to complete all
     * the multiplication tables between 1-10.
     *
     * i.e. 5  = 5,10,15,20,25,30,35,40,45,50
     *
     * When a loop in inside a loop, we call this a nested loop
     */
    private static void exercise5() {
        for (int timesTableNumber = 1; timesTableNumber <= 10; timesTableNumber++) {
            // Your fori loop here
        }
    }
}
