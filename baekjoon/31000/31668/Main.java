// https://www.acmicpc.net/problem/31668
// A특별한 가지
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int n3 = Integer.parseInt(bf.readLine());
        int result = (n2 / n1) * n3;
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    

}
