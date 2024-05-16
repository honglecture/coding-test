// https://www.acmicpc.net/problem/15130
// Arithmetic Sequences
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        int n1 = 0;
        int n2 = 0;
        int count = 0;
        int startIndex = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            if(array[i] != 0){
                if(n1 == 0){
                    n1 = array[i];
                    startIndex = i;
                } else {
                    n2 = array[i];
                }
            }
            if(n1 != 0 && n2 == 0){
                count++;
            }
        }
        if(n1 != n2){
            int key = n1 - n2;
            if(key % count == 0){
                key = key / count;
                for (int i = startIndex - 1; i >= 0; i--) {
                    array[i] = array[i + 1] + key;
                }
                for (int i = startIndex + 1; i < array.length; i++) {
                    array[i] = array[i - 1] - key;
                }
                for (int i = 0; i < array.length; i++) {
                    bw.write(array[i] + " ");
                }
                bw.write("\n");
            } else {
                bw.write("-1\n");
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                bw.write(n1 + "\n");
            }
        }
        
        
        bw.flush();
        bw.close();
    }

    
}
