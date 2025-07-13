package edu.charlotte.java.arrays;

public class MultiDimArrayDemo {
    public static void main(String[] args) {
        // Creating and initializing an array
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };

        // Accessing the elements in the Array
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);
    }
}
