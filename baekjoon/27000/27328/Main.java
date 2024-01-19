// https://www.acmicpc.net/problem/27328
// 三方比較 (Three-Way Comparison)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        if(n1 > n2){
            System.out.println("1");
        } else if(n1 == n2){
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
        bw.flush();
        bw.close();
    }

    

}
