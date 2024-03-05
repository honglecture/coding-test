// https://www.acmicpc.net/problem/27219
// Робинзон Крузо
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int result1 = n / 5;
        int result2 = n % 5;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result1; i++) {
            sb.append("V");
        }
        for (int i = 0; i < result2; i++) {
            sb.append("I");
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

    

}
