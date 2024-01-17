// https://www.acmicpc.net/problem/4589
// Gnome Sequencing
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        bw.write("Gnomes:\n");
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int[] array1 = {n1, n2, n3};
            int[] array2 = {n1, n2, n3};
            Arrays.sort(array2);
            boolean flag = true;
            if(n1 < n2){
                for (int j = 0; j < array1.length; j++) {
                    if(array1[j] != array2[j]){
                        flag = false;
                        break;
                    }
                }
            } else {
                for (int j = array1.length - 1; j >= 0; j--) {
                    if(array1[array1.length - j - 1] != array2[j]){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                bw.write("Ordered\n");
            } else {
                bw.write("Unordered\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}