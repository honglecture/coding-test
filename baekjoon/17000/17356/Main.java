// https://www.acmicpc.net/problem/17356
// 욱 제
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        double n1 = Integer.parseInt(sArray[0]);
        double n2 = Integer.parseInt(sArray[1]);
        double n3 = (double)((n2 - n1) / (double)400);
        double result = 1 / (1 + Math.pow(10, n3));
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
