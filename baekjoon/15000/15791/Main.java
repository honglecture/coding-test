// https://www.acmicpc.net/problem/15791
// 세진이의 미팅
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        List<Integer> list = new ArrayList<>();
        long result1 = 1;
        long result2 = 1;
        for (int i = n1; i > n1 - n2; i--) {
            result1 *= i;
            result1 %= 1000000007;
        }
        for (int i = 1; i <= n2; i++) {
            result2 *= i;
            result2 %= 1000000007;
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result1 / result2);
        bw.flush();
        bw.close();
    }

    
}