// https://www.acmicpc.net/problem/18005
// Even or Odd?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        if(n % 2 == 1){
            System.out.println("0");
        } else {
            if((n / 2) % 2 == 0){
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        }
        bw.flush();
        bw.close();
    }

}
