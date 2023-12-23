// https://www.acmicpc.net/problem/21598
// SciComLove
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            System.out.println("SciComLove");
        }
        bw.flush();
        bw.close();
    }

}
