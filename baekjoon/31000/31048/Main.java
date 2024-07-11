// https://www.acmicpc.net/problem/31048
// Last Factorial Digit
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int currentNum = 1;
            for (int j = 2; j <= n; j++) {
                int result = currentNum * j;
                if(result > 9){
                    result %= 10;
                }
                currentNum = result;
            }
            bw.write(currentNum + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}
