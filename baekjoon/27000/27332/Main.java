// https://www.acmicpc.net/problem/27332
// 11 月 (November)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int sum = n1 + (n2 * 7);
        if(sum > 30){
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        bw.flush();
        bw.close();
    }

    

}
