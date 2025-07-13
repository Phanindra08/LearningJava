package edu.charlotte.java.arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        // Declaring, Creating and Initializing an array
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        // Declaring and Creating an array
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo)
            System.out.print(coffee + " ");
    }
}
