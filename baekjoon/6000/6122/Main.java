// https://www.acmicpc.net/problem/6122
// Time Cards
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
        int[] sumArray = new int[n + 1];
        int[] array = new int[n + 1];
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int index = Integer.parseInt(sArray[0]);
            String type = sArray[1];
            int n1 = Integer.parseInt(sArray[2]);
            int n2 = Integer.parseInt(sArray[3]);
            int sum = 60 * n1 + n2;
            if(type.equals("START")){
                array[index] = sum;
            } else {
                sumArray[index] += sum - array[index];
            }
        }
        for (int i = 1; i < sumArray.length; i++) {
            int answer1 = sumArray[i] / 60;
            int answer2 = sumArray[i] % 60;
            bw.write(answer1 + " " + answer2 + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}