public class Insertion{

    public static void sort_descrtl(int[] narray){
        int N = narray.length;
        for (int i = N-1; i > 0; i--)
        {
            for (int j = i; j < N && narray[j] - narray[j-1] > 0; j++){
            exch(narray, j, j-1);}
        }
    }

    //public static void sort(int[] narray){
    //    int N = narray.length;
    //    for (int i = 1; i < N; i++)
    //    {
    //        for (int j = i; j > 0 && narray[j] - narray[j-1] < 0; j--){
    //            exch(narray, j, j-1);}
    //    }
    //}


    public static void sort_float(float[] narray){
        int N = narray.length;
        for (int i = 1; i < N; i++)
        {
            for (int j = i; j > 0 && narray[j] - narray[j-1] < 0; j--){
            exch(narray, j, j-1);}
        }
    }

    private static void exch(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j]; 
        a[j] = t;
    }

    private static void exch(float[] a, int i, int j){
        float t = a[i];
        a[i] = a[j]; 
        a[j] = t;
    }
    

}