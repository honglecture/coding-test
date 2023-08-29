// https://www.acmicpc.net/problem/15964
// 이상한 기호
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        long n1 = Long.parseLong(sArray[0]);
        long n2 = Long.parseLong(sArray[1]);
        long result1 = n1 + n2;
        long result2 = n1 - n2;
        long result3 = result1 * result2;
        bw.write(result3 + "\n");
        bw.flush();
        bw.close();
    }
    
}