package edu.charlotte.java.arrays;

public class DeclaringAndInitializingAnArray {
    public static void main(String[] args) {
        // declaring an array of integers
        int[] anArray;

        // allocating the memory for 10 integers
        anArray = new int[10];

        // Assigning values to each element of the array
        // initialize the first element
        anArray[0] = 100;
        // initialize the second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        // The below way of printing is only for the demo of showing the elements stored at each index in an array
        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);

        System.out.println();
        System.out.println("The elements in the second array are: ");
        // Using the shortcut syntax to create and initialize an array
        int[] anArray2 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        for(int index = 0; index < 10; index++)
            System.out.printf("Element at index %d: %d\n", index, anArray2[index]);

        // Printing array's size to the console
        System.out.println("The size of the array 'anArray' is: " + anArray.length);
    }
}
