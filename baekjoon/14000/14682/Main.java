// https://www.acmicpc.net/problem/14682
// Shifty Sum
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int sum = n1;
        for (int i = 0; i < n2; i++) {
            n1 = Integer.parseInt(n1 + "0");
            sum += n1;
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

    
}