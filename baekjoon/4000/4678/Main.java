// https://www.acmicpc.net/problem/4678
// Skew Binary
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("0")){
                break;
            }
            int size = str.length();
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                int n1 = Integer.parseInt(String.valueOf(str.charAt(i)));
                int n2 = size - i;
                int result = n1 * (int)(Math.pow(2, n2) - 1);
                sum += result;
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}