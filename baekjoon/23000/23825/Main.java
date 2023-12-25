// https://www.acmicpc.net/problem/23825
// 사이클 게임
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int min = Integer.min(Integer.parseInt(sArray[0]), Integer.parseInt(sArray[1]));
        System.out.println(min / 2);
        bw.flush();
        bw.close();
    }

}
