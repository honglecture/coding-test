// https://www.acmicpc.net/problem/26307
// Correct
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]) * 60;
        int n2 = Integer.parseInt(sArray[1]) + n1;
        int n3 = 60 * 9;
        System.out.println(n2 - n3);
        bw.flush();
        bw.close();
    }

}
