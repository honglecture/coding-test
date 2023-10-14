// https://www.acmicpc.net/problem/20492
// 세금
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer1 = (int) (n - (n * 0.22));
        int answer2 = 0;
        int temp1 = (int) (n * 0.2);
        int temp2 = (int) (temp1 * 0.22);
        answer2 = n - temp2;
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }

}
