// https://www.acmicpc.net/problem/28224
// Final Price
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 0; i < size; i++) {
            answer += Integer.parseInt(bf.readLine());
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

  
}
