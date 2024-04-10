// https://www.acmicpc.net/problem/20336
// Haughty Cuisine
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        bw.write(size + "\n");
        for (int i = 1; i < sArray.length; i++) {
            bw.write(sArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

}
