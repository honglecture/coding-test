// https://www.acmicpc.net/problem/14914
// 사과와 바나나 나눠주기
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int min = Integer.min(n1, n2);
        int max = Integer.max(n1, n2);
        for (int i = 1; i <= min; i++) {
            if(min % i == 0 && max % i == 0){
                int result1 = n1 / i;
                int result2 = n2 / i;
                String str = i + " " + result1 + " " + result2;
                bw.write(str + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}