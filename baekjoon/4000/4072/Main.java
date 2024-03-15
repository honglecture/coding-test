// https://www.acmicpc.net/problem/4072
// Words
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
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            String[] sArray = str.split(" ");
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < sArray.length; i++) {
                answer.append(new StringBuilder(sArray[i]).reverse() + " ");
            }
            answer.deleteCharAt(answer.length() - 1);
            bw.write(answer.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}