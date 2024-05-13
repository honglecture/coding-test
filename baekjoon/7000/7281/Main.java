// https://www.acmicpc.net/problem/7281
// Internetas
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        int currentTime = 0;
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        for (int i = 0; i < array.length; i++) {
            int n1 = array[i][0];
            int n2 = array[i][1];
            if(n2 == 1){
                if(currentTime == 0){
                    currentTime = n1;
                } else {
                    answer = Integer.max(answer, n1 - currentTime);
                    currentTime = n1;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}