// https://www.acmicpc.net/problem/4796
// 캠핑
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 1;
        while(true){
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            if(n1 == 0 && n2 == 0 && n3 == 0){
                break;
            }
            int sum = 0;
            int result1 = n3 / n2;
            sum += result1 * n1;
            if(n3 % n2 != 0){
                int result2 = n3 % n2;
                sum += result2 >= n1 ? n1 : result2;
            }
            bw.write("Case " + count + ": " + sum + "\n");
            count++;
        }
        bw.flush();
        bw.close();
    }
}