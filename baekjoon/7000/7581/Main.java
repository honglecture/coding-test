// https://www.acmicpc.net/problem/7581
// 토마토
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int n4 = Integer.parseInt(sArray[3]);
            if(n1 == 0 && n2 == 0 && n3 == 0 && n4 == 0){
                break;
            }
            int[] array = {n1, n2, n3, n4};
            int sum = 1;
            int index = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] != 0){
                    sum *= array[i];
                } else {
                    index = i;
                }
            }
            if(array[3] == 0){
                array[3] = sum;
            } else {
                array[index] = array[3] / sum;
            }
            for (int i = 0; i < array.length; i++) {
                bw.write(array[i] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}