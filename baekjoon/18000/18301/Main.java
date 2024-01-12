// https://www.acmicpc.net/problem/18301
// Rats
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int result = ((n1 + 1) * (n2 + 1)) / (n3 + 1) - 1;
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
