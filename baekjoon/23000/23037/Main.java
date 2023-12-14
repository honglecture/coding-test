// https://www.acmicpc.net/problem/23037
// 5의 수난
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(str.charAt(i) + "");
            result += Math.pow(n, 5);
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
