// https://www.acmicpc.net/problem/6081
// Hay Expenses
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
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int[] array = new int[size1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]) - 1;
            int n2 = Integer.parseInt(sArray[1]) - 1;
            int sum = 0;
            for (int j = n1; j <= n2; j++) {
                sum += array[j];
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}