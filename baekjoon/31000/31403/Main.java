// https://www.acmicpc.net/problem/31403
// A + B - C
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int n3 = Integer.parseInt(bf.readLine());
        int sum1 = n1 + n2 - n3;
        int sum2 = Integer.parseInt(n1 + "" + n2) - n3;
        System.out.println(sum1);
        System.out.println(sum2);
        bw.flush();
        bw.close();
    }

    

}
