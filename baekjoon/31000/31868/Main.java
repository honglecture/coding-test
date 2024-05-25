// https://www.acmicpc.net/problem/31868
// 수박 게임
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        for (int i = 1; i < n1; i++) {
            n2 /= 2;
        }
        System.out.println(n2);
        bw.flush();
        bw.close();
    }

    

}
