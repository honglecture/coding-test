// https://www.acmicpc.net/problem/3135
// 라디오
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
        int start = Integer.parseInt(sArray[0]);
        int end = Integer.parseInt(sArray[1]);
        int size = Integer.parseInt(bf.readLine());
        int answer = Math.abs(start - end);
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int result = Math.abs(n - end) + 1;
            if(answer > result){
                answer = result;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}