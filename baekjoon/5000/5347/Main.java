// https://www.acmicpc.net/problem/5347
//  LCM
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            long n1 = Long.parseLong(sArray[0]);
            long n2 = Long.parseLong(sArray[1]);
            long result = getAnswer(n1, n2);
            bw.write(result +"\n");
        }
        bw.flush();
        bw.close();
    }
    private static long getAnswer(long n1, long n2){
        long result = 1;
        int start = 2;
        while (true) {
            if(n1 % start == 0 && n2 % start == 0){
                n1 /= start;
                n2 /= start;
                result *= start;
            } else {
                start++;
                if(start > n1 || start > n2){
                    break;
                }
            }
        }
        result *= n1 * n2;
        return result;
    }
}