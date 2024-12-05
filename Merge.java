public class Merge {

    private static int[] aux;

    public static void sort_desc(int[] a) {
        aux = new int[a.length];
        sort(a, aux,0, a.length - 1);
    }

    private static void sort(int[] narray, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;

        sort(narray, aux, lo, mid);
        sort(narray, aux, mid + 1, hi);

        merge(narray, aux, lo, mid, hi);
    }

    private static void merge(int[] narray, int[] aux, int lo, int mid, int hi) {
        for (int k = lo; k <= hi; k++) {
            aux[k] = narray[k];
        }

        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                narray[k] = aux[j++];
            } else if (j > hi) {
                narray[k] = aux[i++];
            } else if (aux[i] >= aux[j]) {
                narray[k] = aux[i++];
            } else {
                narray[k] = aux[j++];
            }
        }
    }
}