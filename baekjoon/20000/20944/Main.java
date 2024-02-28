// https://www.acmicpc.net/problem/20944
// Kuber
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append("a");
        }
        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }

}
