// https://www.acmicpc.net/problem/2028
// 자기복제수
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
            int n1 = Integer.parseInt(bf.readLine());
            int n2 = n1 * n1;
            String str1 = String.valueOf(n2);
            String str2 = str1.substring(str1.length() - String.valueOf(n1).length());
            if(str2.equals(String.valueOf(n1))){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }

}