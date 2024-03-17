// https://www.acmicpc.net/problem/5607
// 問題 １
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
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 > n2){
                answer1 += n1 + n2;
            } else if(n1 < n2){
                answer2 += n1 + n2;
            } else {
                answer1 += n1;
                answer2 += n2;
            }
        }
        bw.write(answer1 + " " + answer2 + "\n");
        bw.flush();
        bw.close();
    }
}