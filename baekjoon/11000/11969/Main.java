// https://www.acmicpc.net/problem/11969
// Breed Counting
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
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int[][] array = new int[n + 1][4];
        for (int i = 1; i < array.length; i++) {
            int n1 = Integer.parseInt(bf.readLine());
            array[i][1] = array[i - 1][1];
            array[i][2] = array[i - 1][2];
            array[i][3] = array[i - 1][3];
            array[i][n1]++;
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int result1 = array[n2][1] - array[n1 - 1][1];
            int result2 = array[n2][2] - array[n1 - 1][2];
            int result3 = array[n2][3] - array[n1 - 1][3];
            bw.write(result1 + " " + result2 + " " + result3 + "\n");
        }
        bw.flush();
        bw.close(); 
    }

}