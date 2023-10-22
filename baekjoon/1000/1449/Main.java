// https://www.acmicpc.net/problem/1449
// 수리공 항승
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
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        int[] array = new int[size];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        boolean[] visitArray = new boolean[array[array.length - 1] + 1];
        for (int i = 0; i < array.length; i++) {
            visitArray[array[i]] = true;
        }
        int count = 0;
        for (int i = 0; i < visitArray.length; i++) {
            if(visitArray[i]){
                for (int j = i; j < i + key; j++) {
                    if(j >= visitArray.length){
                        break;
                    }
                    visitArray[j] = false;
                }
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
    
}