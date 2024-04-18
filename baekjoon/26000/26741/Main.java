// https://www.acmicpc.net/problem/26741
// Farma
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        for (int i = 0; i <= n; i++) {
            int n1 = i * 2;
            int n2 = (n - i) * 4;
            if(n1 + n2 == m){
                System.out.println(i + " " + (n - i));
                break;
            }
        }
        bw.flush();
        bw.close();
    }

}
