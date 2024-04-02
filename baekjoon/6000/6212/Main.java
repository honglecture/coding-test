// https://www.acmicpc.net/problem/6212
// Dream Counting
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int[] array = new int[10];
        for (int i = n1; i <= n2; i++) {
            String str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                int n = Integer.parseInt(str.charAt(j) + "");
                array[n]++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
   
}