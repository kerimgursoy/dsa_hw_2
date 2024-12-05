import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) throws FileNotFoundException{
        File file = new File("myfile.txt");
        Scanner scanner = new Scanner(file);
        int n = 0;
        if(scanner.hasNextInt()){
            n = scanner.nextInt();
        }
        int[] narray = new int[n];
        
        for(int i = 0; i < n && scanner.hasNextInt(); i++){
            narray[i] = scanner.nextInt();
        }

        Merge.sort_desc(narray);

        for(int i: narray){
            System.out.println(i);
        }

        scanner.close();
    }
}