// https://www.acmicpc.net/problem/13222
// Matches
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        double n1 = Integer.parseInt(sArray[1]);
        double n2 = Integer.parseInt(sArray[2]);
        double n3 = Math.sqrt((n1 * n1) + (n2 * n2));
        for (int i = 0; i < size; i++) {
            double n = Integer.parseInt(bf.readLine());
            if(n <= n1 || n <= n2 || n <= n3){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}