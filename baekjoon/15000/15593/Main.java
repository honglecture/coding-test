// https://www.acmicpc.net/problem/15593
// Lifeguards (Bronze)
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        for (int i = 0; i < array.length; i++) {
            boolean[] innerArray = new boolean[1001];
            for (int j = 0; j < array.length; j++) {
                if(i == j){
                    continue;
                }
                int start = array[j][0] + 1;
                int end = array[j][1];
                for (int k = start; k <= end; k++) {
                    innerArray[k] = true;
                }
            }
            int count = 0;
            for (int j = 0; j < innerArray.length; j++) {
                if(innerArray[j]){
                    count++;
                }
            }
            answer = Integer.max(answer, count);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
