import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Trying out the .compareTo method
        Person Danylo = new Person(2004);
        Person Sasha = new Person(2005); // Initializing people
        Person Roman = new Person(2005);
        System.out.println("Comparing Danylo to Sasha: " + Danylo.compareTo(Sasha));
        System.out.println("Comparing Sasha to Danylo: " + Sasha.compareTo(Danylo)); // Using the compareTo method and printing out the results
        System.out.println("Comparing Sasha to Roman: " + Sasha.compareTo(Roman));

        // Trying out the Selection method with Integers
        Integer[] a = {873, 2, 445, 10, 12, 3, 6, 41}; // Initializing an array of objects of Integer class
        Selection.sort(a); // Calling the sort method for array "a"
        System.out.println("Selection sort result with Integer: " + Arrays.toString(a)); // Printing out the array "a"

        // Trying out the Selection method with Strings
        String[] b = {"Dog", "Cow", "Cat", "Pig", "Chicken"}; // Initializing an array of objects of String class
        Selection.sort(b); // Calling the sort method for array "b"
        System.out.println("Selection sort result with String: " + Arrays.toString(b)); // Printing out the array "b"

        // Trying out the Mergesort method with Integers
        Integer[] c = {53, 32, 326, 91, 33, 85, 193};
        Merge.sort(c);
        System.out.println("Mergesort sort result with Integer: " + Arrays.toString(c));

        // Trying out the Quicksort method with Integers
        Integer[] d = {101, 102, 242, 21, 3, 4, 34, 8};
        Quick.sort(d);
        System.out.println("Quicksort sort result with Integer: " + Arrays.toString(d));
    }
}
