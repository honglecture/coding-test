// https://www.acmicpc.net/problem/20254
// Site Score
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]) *56;
        int n2 = Integer.parseInt(sArray[1]) *24;
        int n3 = Integer.parseInt(sArray[2]) *14;
        int n4 = Integer.parseInt(sArray[3]) *6;
        int sum = n1 + n2 + n3 + n4;
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

}
