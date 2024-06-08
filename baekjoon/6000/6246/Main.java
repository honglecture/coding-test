// https://www.acmicpc.net/problem/6246
// 풍선 놀이
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
        boolean[] answerArray = new boolean[size1 + 1];
        int answer = 0;
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            for (int j = n1; j < answerArray.length; j += n2) {
                answerArray[j] = true;
            }
        }
        for (int i = 1; i < answerArray.length; i++) {
            if(!answerArray[i]){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
   
}