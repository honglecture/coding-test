// https://www.acmicpc.net/problem/31606
// 果物 (Fruit)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        System.out.println(n1 + n2 + 3);
        bw.flush();
        bw.close();
    }

    

}
