// https://www.acmicpc.net/problem/20359
// A simple task
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int n1 = 1;
        int n2 = 0;
        while (true) {
            int result = (int) Math.pow(2, n2);
            result *= n1;
            if(result > n){
                n2 += 1;
                n1 = 1;
                continue;
            }
            if(result == n){
                break;
            }
            n1 += 2;
        }
        bw.write(n1 + " " + n2 + "\n");
        bw.flush();
        bw.close();
    }

}
