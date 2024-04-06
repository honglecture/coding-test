// https://www.acmicpc.net/problem/31615
// 桁 (Digit)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int sum = n1 + n2;
        System.out.println(String.valueOf(sum).length());
        bw.flush();
        bw.close();
    }

    

}
