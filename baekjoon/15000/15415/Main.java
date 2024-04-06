// https://www.acmicpc.net/problem/15415
// Shattered Cake
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        int size = Integer.parseInt(bf.readLine());
        long sum = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            sum += (n1 * n2);
        }
        System.out.println(sum / n);
        bw.flush();
        bw.close();
    }

    
}
