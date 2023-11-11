// https://www.acmicpc.net/problem/14581
// 팬들에게 둘러싸인 홍준
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        System.out.println(":fan::fan::fan:");
        System.out.println(":fan::"+str+"::fan:");
        System.out.println(":fan::fan::fan:");
        bw.flush();
        bw.close();
    }

    
}