// https://www.acmicpc.net/problem/1225
// 이상한 곱셈
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        long sum = 0;
        String str1 = sArray[0];
        String str2 = sArray[1];
        for (int i = 0; i < str1.length(); i++) {
            int n1 = Integer.parseInt(String.valueOf(str1.charAt(i)));
            for (int j = 0; j < str2.length(); j++) {
                int n2 = Integer.parseInt(String.valueOf(str2.charAt(j)));
                sum += (long)(n1 * n2);
            }
        }
        bw.write(sum +"\n");
        bw.flush();
        bw.close();
    }

}
