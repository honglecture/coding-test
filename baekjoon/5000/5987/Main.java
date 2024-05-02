// https://www.acmicpc.net/problem/5987
// String Function Encoding
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
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            String str = sArray[2];
            for (int j = 0; j < n2; j++) {
                String sub = str.substring(n1);
                str = sub + str;
            }
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }
}