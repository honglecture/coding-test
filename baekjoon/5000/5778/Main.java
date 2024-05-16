// https://www.acmicpc.net/problem/5778
// Fake tickets
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
            if(n1 == 0 && n2 == 0){
                break;
            }
            int answer = 0;
            int[] answerArray = new int[n1 + 1];
            sArray = bf.readLine().split(" ");
            for (int i = 0; i < n2; i++) {
                int n = Integer.parseInt(sArray[i]);
                answerArray[n]++;
            }
            for (int i = 0; i < answerArray.length; i++) {
                if(answerArray[i] > 1){
                    answer++;
                }
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }
}