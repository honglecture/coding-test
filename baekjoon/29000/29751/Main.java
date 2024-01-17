// https://www.acmicpc.net/problem/29751
// 삼각형
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        double n1 = Double.parseDouble(sArray[0]);
        double n2 = Double.parseDouble(sArray[1]);
        double result = (n1 * n2) / 2;
        System.out.printf("%.1f",result);
        bw.flush();
        bw.close();
    }

    

}
