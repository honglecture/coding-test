// https://www.acmicpc.net/problem/16430
// 제리와 톰
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int result = n2 - n1;
        bw.write(result + " " + n2 + "\n");
        bw.flush();
        bw.close();
    }

}
