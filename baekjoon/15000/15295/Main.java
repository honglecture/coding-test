// https://www.acmicpc.net/problem/15295
// Chanukah Challenge
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int sum = n2;
            for (int j = 1; j <= n2; j++) {
                sum += j;
            }
            bw.write(n1 + " " + sum + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}
