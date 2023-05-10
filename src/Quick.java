public class Quick {
    public static <T extends Comparable<T>> void sort(T[] a) { // Creating an entry method for usage in main method
        sort(a, 0, a.length - 1);
    }
    private static <T extends Comparable<T>> void sort(T[] a, int lo, int hi) { // Creating a private method for using in this class only for encapsulation
        if (hi <= lo) {
            return;
        }

        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }
    private static <T extends Comparable<T>> int partition(T[] a, int lo, int hi) { // Creating a partition method for splitting the array at the chosen pivot index
        int i = lo;
        int j = hi + 1;
        T pivot = a[lo];
        while (true) {
            while (less(a[++i], pivot)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(pivot, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }
    private static <T extends Comparable<T>> boolean less(T v, T w) { // Creating a method for checking the value when comparing two elements of the array
        return v.compareTo(w) < 0;
    }
    private static <T extends Comparable<T>> void exch(T[] a, int i, int j) { // Creating an exchange method for changing the main array
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}