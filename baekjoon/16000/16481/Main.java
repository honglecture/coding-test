// https://www.acmicpc.net/problem/16481
// 원 전문가 진우
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        double n1 = Integer.parseInt(sArray[0]);
        double n2 = Integer.parseInt(sArray[1]);
        double n3 = Integer.parseInt(sArray[2]);
        double result1 = n1 * n2 * n3;
        double result2 = (n1 * n2) + (n2 * n3) + (n1 * n3);
        System.out.println(result1 / result2);
        bw.flush();
        bw.close();
    }

    


}
