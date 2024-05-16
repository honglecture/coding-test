// https://www.acmicpc.net/problem/5238
// Stacked Floating Mountains 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length - 1];
            boolean flag = true;
            for (int j = 1; j < sArray.length; j++) {
                array[j - 1] = Integer.parseInt(sArray[j]);
            }
            for (int j = 2; j < array.length; j++) {
                if(array[j - 2] + array[j - 1] != array[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }



    private static boolean solveFibbonacciSimple(int [] sequence) {
        boolean isFibbonacci = true;

        /* ------------------- INSERT CODE HERE ---------------------*/
        
        
        
        
        
        /* -------------------- END OF INSERTION --------------------*/

        return isFibbonacci;
    }
}