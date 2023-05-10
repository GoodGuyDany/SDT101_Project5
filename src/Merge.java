import java.util.Arrays;
public class Merge {
    public static <T extends Comparable<T>> void sort(T[] a) { // Creating an entry method for usage in main method
        T[] aux = Arrays.copyOf(a, a.length);
        sort(a, aux, 0, a.length - 1);
    }
    private static <T extends Comparable<T>> void sort(T[] a, T[] aux, int lo, int hi) { // Creating a private method for using in this class only for encapsulation
        if (hi <= lo) {
            return;
        }
        int mid = (hi + lo)/2; // Getting the mid value
        sort(a, aux, lo, mid); // Sorting the left half
        sort(a, aux, mid + 1, hi); // Sorting the right half
        merge(a, aux, lo, mid, hi); // Merging the two halves
    }
    private static <T extends Comparable<T>> void merge(T[] a, T[] aux, int lo, int mid, int hi) { // Creating a merge method that merges the parts together after comparing values inside of them
        if (hi + 1 - lo >= 0) System.arraycopy(a, lo, aux, lo, hi + 1 - lo);
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) { // No elements in the left half, so we have to use the  element from the right half
                a[k] = aux[j++];
            } else if (j > hi) { // No elements in the right half so we have to use the element from the left half
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) { // Current element in right half is lesser, so we use it
                a[k] = aux[j++];
            } else { // Current element in left half is lesser. so we use it
                a[k] = aux[i++];
            }
        }
    }
    private static <T extends Comparable<T>> boolean less(T v, T w) { // Creating a method for checking the value when comparing two elements of the array
        return v.compareTo(w) < 0;
    }
}