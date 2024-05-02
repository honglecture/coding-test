// https://www.acmicpc.net/problem/31780
// 불사조
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int answer = 0;
        for (int i = 0; i < n2 + 1; i++) {
            answer += n1;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
