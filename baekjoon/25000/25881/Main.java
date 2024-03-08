// https://www.acmicpc.net/problem/25881
// Electric Bill
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int m1 = Integer.parseInt(sArray[0]);
        int m2 = Integer.parseInt(sArray[1]);
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int result = 0;
            if(n > 1000){
                result += m1 * 1000;
                result += m2 * (n - 1000);
            } else {
                result += m1 * n;
            }
            bw.write(n + " " + result + "\n");
        }
        bw.flush();
        bw.close();
    }

}
