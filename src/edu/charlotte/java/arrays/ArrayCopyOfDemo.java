package edu.charlotte.java.arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee : copyTo)
            System.out.print(coffee + " ");

        System.out.println();
        // The below statement prints the contents of the 'copyTo' array in the same way as the 'for' loop above
        java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);

        System.out.println();
        // Converting the 'copyTo' array to a String and printing it
        System.out.println(java.util.Arrays.toString(copyTo));
    }
}
