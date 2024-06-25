// https://www.acmicpc.net/problem/7795
// 먹을 것인가 먹힐 것인가
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
        for (int i = 0; i < size; i++) {
            bf.readLine();
            String[] sArray = bf.readLine().split(" ");
            int[] array1 = new int[sArray.length];
            for (int j = 0; j < array1.length; j++) {
                array1[j] = Integer.parseInt(sArray[j]);
            }
            sArray = bf.readLine().split(" ");
            int[] array2 = new int[sArray.length];
            for (int j = 0; j < array2.length; j++) {
                array2[j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array1);
            Arrays.sort(array2);
            int answer = 0;
            for (int j = 0; j < array1.length; j++) {
                for (int k = 0; k < array2.length; k++) {
                    if(array1[j] > array2[k]){
                        answer++;
                    } else {
                        break;
                    }
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}