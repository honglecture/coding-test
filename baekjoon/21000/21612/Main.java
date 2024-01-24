// https://www.acmicpc.net/problem/21612
// Boiling Water
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int result = 5 * n - 400;
        System.out.println(result);
        if(result > 100){
            System.out.println("-1");
        } else if(result < 100){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

}
