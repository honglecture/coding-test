// https://www.acmicpc.net/problem/25915
// 연세여 사랑한다
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 84;
        int n1 = bf.readLine().charAt(0);
        int n2 = 'I';
        sum += Math.abs(n1 - n2);
        System.out.println(sum);
        
        bw.flush();
        bw.close();
    }

}
