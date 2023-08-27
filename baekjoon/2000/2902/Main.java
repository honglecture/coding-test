// https://www.acmicpc.net/problem/2902
// KMP는 왜 KMP일까?
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String[] sArray = str.split("-");
        String answer = "";
        for (int i = 0; i < sArray.length; i++) {
            answer += sArray[i].charAt(0);
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}