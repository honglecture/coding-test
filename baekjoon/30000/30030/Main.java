// https://www.acmicpc.net/problem/30030
// 스위트콘 가격 구하기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int result = n / 11;
        System.out.println(n - result);
        bw.flush();
        bw.close();
    }

    

}
