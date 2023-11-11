// https://www.acmicpc.net/problem/1850
// 최대공약수
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
        long n1 = Long.parseLong(sArray[0]);
        long n2 = Long.parseLong(sArray[1]);
        long result = getAnswer(Long.max(n1, n2), Long.min(n1, n2));
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < result; i++) {
            sb.append("1");
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }


    private static long getAnswer(long n1, long n2){
        while (n2 > 0) {
            long temp = n1;
            n1 = n2;
            n2 = temp % n2;
        }
        return n1;
    }
}
