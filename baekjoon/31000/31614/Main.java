// https://www.acmicpc.net/problem/31614
// 分 (Minutes)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int sum = (n1 * 60) + n2;
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

    

}
