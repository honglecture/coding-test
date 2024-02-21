// https://www.acmicpc.net/problem/15610
// Abbey Courtyard
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        double result = Math.sqrt(n) * 4;
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    
}
