// https://www.acmicpc.net/problem/5235
// Even Sum More Than Odd Sum
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
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < sArray.length; j++) {
                int n = Integer.parseInt(sArray[j]);
                if(n % 2 == 0){
                    sum2 += n;
                } else {
                    sum1 += n;
                }
            }
            if(sum1 > sum2){
                bw.write("ODD\n");
            } else if(sum1 < sum2){
                bw.write("EVEN\n");
            } else {
                bw.write("TIE\n");
            }
        }
        bw.flush();
        bw.close();
    }
}