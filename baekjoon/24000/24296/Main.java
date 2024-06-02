// https://www.acmicpc.net/problem/24296
// ЛИНИЯ
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;
        while (true) {
            if(n % 2 == 0){
                answer = n;
                break;
            }
            n = n / 2 + 1;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
