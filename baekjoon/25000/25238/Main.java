// https://www.acmicpc.net/problem/25238
// 가희와 방어율 무시
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        double n1 = Integer.parseInt(sArray[0]);
        double n2 = Integer.parseInt(sArray[1]);
        double result = n1- ((n1 * 0.01) * n2);
        if(result < 100){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

}
